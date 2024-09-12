package com.example.gaitlabapp.model.visits.popover;

import com.calendarfx.model.Entry;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
class IntervalTree<E extends Entry<?>> {

    private IntervalTree.TreeEntry<E> root;
    private int treeSize;
    private final Set<String> entryIDs = new HashSet();
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    IntervalTree() {
    }

    public final Instant getEarliestTimeUsed() {
        return this.root != null ? Instant.ofEpochMilli(this.getEarliestTimeUsed(this.root)) : null;
    }

    private long getEarliestTimeUsed(IntervalTree.TreeEntry<E> entry) {
        return entry.getLeft() != null ? this.getEarliestTimeUsed(entry.getLeft()) : entry.low;
    }

    public final Instant getLatestTimeUsed() {
        return this.root != null ? Instant.ofEpochMilli(this.getLatestTimeUsed(this.root)) : null;
    }

    private long getLatestTimeUsed(TreeEntry<E> entry) {
        return entry.getRight() != null ? this.getLatestTimeUsed(entry.getRight()) : entry.high;
    }

    public final boolean add(E entry) {
        IntervalTree.TreeEntry<E> e = this.addEntry(entry);
        return e != null;
    }

    public final boolean remove(Entry<?> entry) {
        TreeEntry<E> e = this.getEntry(entry);
        if (e == null) {
            return false;
        } else {
            this.deleteEntry(e);
            return true;
        }

    }

    public final boolean contains(E entry) {
       IntervalTree.TreeEntry<E> e = this.getEntry(entry);
        return e != null;
    }

    public final Collection<E> removePeriod(Instant start, Instant end) {
        Collection<E> result = this.getIntersectingObjects(start, end);
        Iterator var4 = result.iterator();

        while(var4.hasNext()) {
            E p = (E) var4.next();
            this.deleteEntry(this.getEntry(p));
        }

        return result;
    }

    public final Collection<E> getIntersectingObjects(Instant start, Instant end) {
        Collection<E> result = new ArrayList();
        if (this.root == null) {
            return result;
        } else {
            this.searchIntersecting(this.root, new IntervalTree.TimeInterval(start, end), result);
            return result;
        }
    }

    private void searchIntersecting(IntervalTree.TreeEntry<E> entry, IntervalTree<E>.TimeInterval timeInterval, Collection<E> result) {
        if (entry != null) {
            long pLow = this.getLow(timeInterval);
            long pHigh = this.getHigh(timeInterval);
            if (entry.maxHigh >= pLow) {
                if (entry.left != null) {
                    this.searchIntersecting(entry.left, timeInterval, result);
                }

                if (this.checkPLow(entry, pLow) || this.checkPHigh(entry, pHigh) || pLow <= entry.low && entry.high <= pHigh) {
                    result.add((E) entry.value);
                }

                if (pHigh >= entry.low) {
                    if (entry.right != null) {
                        this.searchIntersecting(entry.right, timeInterval, result);
                    }

                }
            }
        }
    }

    private boolean checkPLow(IntervalTree.TreeEntry<E> n, long pLow) {
        return n.low <= pLow && n.high > pLow;
    }

    private boolean checkPHigh(IntervalTree.TreeEntry<E> n, long pHigh) {
        return n.low < pHigh && n.high >= pHigh;
    }

    public final long size() {
        return (long)this.treeSize;
    }

    public final void clear() {
        this.treeSize = 0;
        this.root = null;
    }

    private long getLow(IntervalTree<E>.TimeInterval obj) {
        try {
            return obj.getStartTime() == null ? Long.MIN_VALUE : obj.getStartTime().toEpochMilli();
        } catch (Exception var3) {
            return Long.MAX_VALUE;
        }
    }

    private long getHigh(IntervalTree<E>.TimeInterval interval) {
        try {
            return interval.getEndTime() == null ? Long.MAX_VALUE : interval.getEndTime().toEpochMilli();
        } catch (ArithmeticException var3) {
            return Long.MAX_VALUE;
        }
    }

    private long getLow(Entry<?> entry) {
        try {
            return entry.getStartMillis();
        } catch (ArithmeticException var3) {
            return Long.MAX_VALUE;
        }
    }

    private long getHigh(Entry<?> entry) {
        try {
            return entry.isRecurring() ? ZonedDateTime.of(entry.getRecurrenceEnd(), LocalTime.MAX, entry.getZoneId()).toInstant().toEpochMilli() : entry.getEndMillis();
        } catch (ArithmeticException var3) {
            return Long.MAX_VALUE;
        }
    }

    private void fixUpMaxHigh(TreeEntry<E> entry) {
        while(entry != null) {
            entry.maxHigh = Math.max(entry.high, Math.max(entry.left != null ? entry.left.maxHigh : Long.MIN_VALUE, entry.right != null ? entry.right.maxHigh : Long.MIN_VALUE));
            entry = entry.parent;
        }

    }

    private TreeEntry<E> getEntry(Entry<?> entry) {
        TreeEntry<E> t = this.root;

        while(t != null) {
            int cmp = compareLongs(this.getLow(entry), t.low);
            if (cmp == 0) {
                cmp = compareLongs(this.getHigh(entry), t.high);
            }

            if (cmp == 0) {
                cmp = entry.hashCode() - ((Entry)t.value).hashCode();
            }

            if (cmp < 0) {
                t = t.left;
            } else {
                if (cmp <= 0) {
                    return t;
                }

                t = t.right;
            }
        }

        return null;
    }

    private TreeEntry<E> addEntry(E entry) {
        Objects.requireNonNull(entry, "null entry is not supported");
        String id = entry.getId();
        if (this.entryIDs.contains(id)) {
        }

        this.entryIDs.add(id);
        TreeEntry<E> t = this.root;
        if (t == null) {
            this.root = new TreeEntry(this.getLow(entry), this.getHigh(entry), entry, (TreeEntry)null);
            this.treeSize = 1;
            return this.root;
        } else {
            long cmp;
            TreeEntry parent;
            do {
                parent = t;
                cmp = (long)compareLongs(this.getLow(entry), t.low);
                if (cmp == 0L) {
                    cmp = (long)compareLongs(this.getHigh(entry), t.high);
                    if (cmp == 0L) {
                        cmp = (long)(entry.hashCode() - ((Entry)t.value).hashCode());
                    }
                }

                if (cmp < 0L) {
                    t = t.left;
                } else {
                    if (cmp <= 0L) {
                        return null;
                    }

                    t = t.right;
                }
            } while(t != null);

            TreeEntry<E> e = new TreeEntry(this.getLow(entry), this.getHigh(entry), entry, parent);
            if (cmp < 0L) {
                parent.left = e;
            } else {
                parent.right = e;
            }

            this.fixAfterInsertion(e);
            ++this.treeSize;
            return e;
        }
    }

    private static int compareLongs(long val1, long val2) {
        return val1 < val2 ? -1 : (val1 == val2 ? 0 : 1);
    }

    private static <V> TreeEntry<V> successor(TreeEntry<V> t) {
        if (t == null) {
            return null;
        } else {
            TreeEntry p;
            if (t.right != null) {
                for(p = t.right; p.left != null; p = p.left) {
                }

                return p;
            } else {
                p = t.parent;

                for(TreeEntry<V> ch = t; p != null && ch == p.right; p = p.parent) {
                    ch = p;
                }

                return p;
            }
        }
    }

    private static <V> boolean colorOf(TreeEntry<V> p) {
        return p == null ? true : p.color;
    }

    private static <V> TreeEntry<V> parentOf(TreeEntry<V> p) {
        return p == null ? null : p.parent;
    }

    private static <V> void setColor(TreeEntry<V> p, boolean c) {
        if (p != null) {
            p.color = c;
        }

    }

    private static <V> TreeEntry<V> leftOf(TreeEntry<V> p) {
        return p == null ? null : p.left;
    }

    private static <V> TreeEntry<V> rightOf(TreeEntry<V> p) {
        return p == null ? null : p.right;
    }

    private void rotateLeft(TreeEntry<E> p) {
        if (p != null) {
            TreeEntry<E> r = p.right;
            p.right = r.left;
            if (r.left != null) {
                r.left.parent = p;
            }

            r.parent = p.parent;
            if (p.parent == null) {
                this.root = r;
            } else if (p.parent.left == p) {
                p.parent.left = r;
            } else {
                p.parent.right = r;
            }

            r.left = p;
            p.parent = r;
            p.maxHigh = Math.max(p.left != null ? p.left.maxHigh : Long.MIN_VALUE, Math.max(p.right != null ? p.right.maxHigh : Long.MIN_VALUE, p.high));
            r.maxHigh = Math.max(p.maxHigh, Math.max(r.right != null ? r.right.maxHigh : Long.MIN_VALUE, r.high));
        }

    }

    private void rotateRight(TreeEntry<E> p) {
        if (p != null) {
            TreeEntry<E> l = p.left;
            p.left = l.right;
            if (l.right != null) {
                l.right.parent = p;
            }

            l.parent = p.parent;
            if (p.parent == null) {
                this.root = l;
            } else if (p.parent.right == p) {
                p.parent.right = l;
            } else {
                p.parent.left = l;
            }

            l.right = p;
            p.parent = l;
            p.maxHigh = Math.max(p.left != null ? p.left.maxHigh : Long.MIN_VALUE, Math.max(p.right != null ? p.right.maxHigh : Long.MIN_VALUE, p.high));
            l.maxHigh = Math.max(p.maxHigh, Math.max(l.left != null ? l.left.maxHigh : Long.MIN_VALUE, l.high));
        }

    }

    private void fixAfterInsertion(TreeEntry<E> x) {
        this.fixUpMaxHigh(x.parent);
        x.color = false;

        while(x != null && x != this.root && !x.parent.color) {
            TreeEntry y;
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
                y = rightOf(parentOf(parentOf(x)));
                if (!colorOf(y)) {
                    setColor(parentOf(x), true);
                    setColor(y, true);
                    setColor(parentOf(parentOf(x)), false);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == rightOf(parentOf(x))) {
                        x = parentOf(x);
                        this.rotateLeft(x);
                    }

                    setColor(parentOf(x), true);
                    setColor(parentOf(parentOf(x)), false);
                    this.rotateRight(parentOf(parentOf(x)));
                }
            } else {
                y = leftOf(parentOf(parentOf(x)));
                if (!colorOf(y)) {
                    setColor(parentOf(x), true);
                    setColor(y, true);
                    setColor(parentOf(parentOf(x)), false);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        this.rotateRight(x);
                    }

                    setColor(parentOf(x), true);
                    setColor(parentOf(parentOf(x)), false);
                    this.rotateLeft(parentOf(parentOf(x)));
                }
            }
        }

        this.root.color = true;
    }

    private void deleteEntry(TreeEntry<E> p) {
        this.entryIDs.remove(((Entry)p.value).getId());
        --this.treeSize;
        TreeEntry replacement;
        if (p.left != null && p.right != null) {
            replacement = successor(p);
            p.low = replacement.low;
            p.high = replacement.high;
            p.value = (E) replacement.value;
            p.maxHigh = replacement.maxHigh;
            p = replacement;
        }

        replacement = p.left != null ? p.left : p.right;
        if (replacement != null) {
            replacement.parent = p.parent;
            if (p.parent == null) {
                this.root = replacement;
            } else if (p == p.parent.left) {
                p.parent.left = replacement;
            } else {
                p.parent.right = replacement;
            }

            p.left = null;
            p.right = null;
            p.parent = null;
            this.fixUpMaxHigh(replacement.parent);
            if (p.color) {
                this.fixAfterDeletion(replacement);
            }
        } else if (p.parent == null) {
            this.root = null;
        } else {
            if (p.color) {
                this.fixAfterDeletion(p);
            }

            if (p.parent != null) {
                if (p == p.parent.left) {
                    p.parent.left = null;
                } else if (p == p.parent.right) {
                    p.parent.right = null;
                }

                this.fixUpMaxHigh(p.parent);
                p.parent = null;
            }
        }

    }

    private void fixAfterDeletion(TreeEntry<E> x) {
        while(x != this.root && colorOf(x)) {
           TreeEntry sib;
            if (x == leftOf(parentOf(x))) {
                sib = rightOf(parentOf(x));
                if (!colorOf(sib)) {
                    setColor(sib, true);
                    setColor(parentOf(x), false);
                    this.rotateLeft(parentOf(x));
                    sib = rightOf(parentOf(x));
                }

                if (colorOf(leftOf(sib)) && colorOf(rightOf(sib))) {
                    setColor(sib, false);
                    x = parentOf(x);
                } else {
                    if (colorOf(rightOf(sib))) {
                        setColor(leftOf(sib), true);
                        setColor(sib, false);
                        this.rotateRight(sib);
                        sib = rightOf(parentOf(x));
                    }

                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), true);
                    setColor(rightOf(sib), true);
                    this.rotateLeft(parentOf(x));
                    x = this.root;
                }
            } else {
                sib = leftOf(parentOf(x));
                if (!colorOf(sib)) {
                    setColor(sib, true);
                    setColor(parentOf(x), false);
                    this.rotateRight(parentOf(x));
                    sib = leftOf(parentOf(x));
                }

                if (colorOf(rightOf(sib)) && colorOf(leftOf(sib))) {
                    setColor(sib, false);
                    x = parentOf(x);
                } else {
                    if (colorOf(leftOf(sib))) {
                        setColor(rightOf(sib), true);
                        setColor(sib, false);
                        this.rotateLeft(sib);
                        sib = leftOf(parentOf(x));
                    }

                    setColor(sib, colorOf(parentOf(x)));
                    setColor(parentOf(x), true);
                    setColor(leftOf(sib), true);
                    this.rotateRight(parentOf(x));
                    x = this.root;
                }
            }
        }

        setColor(x, true);
    }

    private static final class TreeEntry<V> {
        private long low;
        private long high;
        private V value;
        private long maxHigh;
        private TreeEntry<V> left;
        private TreeEntry<V> right;
        private TreeEntry<V> parent;
        private boolean color = true;

        TreeEntry(long low, long high, V value, TreeEntry<V> parent) {
            this.low = low;
            this.high = high;
            this.value = value;
            this.parent = parent;
            this.maxHigh = high;
        }

        public String toString() {
            Instant var10000 = Instant.ofEpochMilli(this.low);
            return "[" + var10000 + " - " + Instant.ofEpochMilli(this.high) + "]=" + this.value;
        }

        public TreeEntry<V> getLeft() {
            return this.left;
        }

        public TreeEntry<V> getRight() {
            return this.right;
        }
    }

    private class TimeInterval {
        private final Instant startTime;
        private final Instant endTime;

        public TimeInterval(Instant startTime, Instant endTime) {
            Objects.requireNonNull(startTime);
            Objects.requireNonNull(endTime);
            if (startTime.isAfter(endTime)) {
                throw new IllegalArgumentException("start time can not be after end time, start = " + startTime + ", end = " + endTime);
            } else {
                this.startTime = startTime;
                this.endTime = endTime;
            }
        }

        public Instant getStartTime() {
            return this.startTime;
        }

        public Instant getEndTime() {
            return this.endTime;
        }
    }
}

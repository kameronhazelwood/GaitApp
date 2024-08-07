package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.comparisons.IHopComparison;

import java.util.List;

public interface HopCompServices {
    IHopComparison save(IHopComparison hopComparison);
    IHopComparison update(IHopComparison hopComparison);
    List<IHopComparison> findAll();
    void delete(Long id);
}

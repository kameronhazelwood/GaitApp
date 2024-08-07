package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.comparisons.IFlexibilityComparison;

import java.util.List;

public interface FlexibilityCompService {
    IFlexibilityComparison save(IFlexibilityComparison flexibilityComparison);
    IFlexibilityComparison update(IFlexibilityComparison flexibilityComparison);
    List<IFlexibilityComparison> findAll();
    void delete(Long id);
}

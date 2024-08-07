package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.comparisons.ICoreStrengthComparison;

import java.util.List;

public interface CoreStrengthCompServices {
    ICoreStrengthComparison save(ICoreStrengthComparison coreStrengthComparison);
    ICoreStrengthComparison update(ICoreStrengthComparison coreStrengthComparison);
    List<ICoreStrengthComparison> findAll();
    void delete(Long id);
}

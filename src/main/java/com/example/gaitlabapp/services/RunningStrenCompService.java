package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.forms.comparisons.IRunningStrengthComparison;

import java.util.List;

public interface RunningStrenCompService {
    IRunningStrengthComparison save(IRunningStrengthComparison runningStrengthComparison);
    IRunningStrengthComparison update(IRunningStrengthComparison runningStrengthComparison);
    List<IRunningStrengthComparison> findAll();
    void delete(Long id);
}

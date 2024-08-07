package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.comparisons.IPromComparison;

import java.util.List;

public interface PromCompService {
    IPromComparison save(IPromComparison promComparison);
    IPromComparison update(IPromComparison promComparison);
    List<IPromComparison> findAll();
    void delete(Long id);
}

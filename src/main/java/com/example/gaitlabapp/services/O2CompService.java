package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.comparisons.IO2Comparison;

import java.util.List;

public interface O2CompService {
    IO2Comparison save(IO2Comparison io2Comparison);
    IO2Comparison update(IO2Comparison io2Comparison);
    List<IO2Comparison> findAll();
    void delete(Long id);
}

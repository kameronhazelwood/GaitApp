package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IDiagRecommendations;

import java.util.List;

public interface DiagRecomService {
    IDiagRecommendations save(IDiagRecommendations diagRecommendations);
    IDiagRecommendations update(IDiagRecommendations diagRecommendations);
    List<IDiagRecommendations> findAll();
}

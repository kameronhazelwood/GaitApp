package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.hipscores.IHipScoresModel;

import java.util.List;

public interface HipScoresService {
    IHipScoresModel save(IHipScoresModel hipScoresModel);
    IHipScoresModel update(IHipScoresModel hipScoresModel);
    List<IHipScoresModel> findAll();
    void delete(Long id);
}

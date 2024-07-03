package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IToneModel;

import java.util.Optional;

public interface ToneService {
    Optional<IToneModel> save(IToneModel toneModel);
    IToneModel findAll();
    void delete(Long id);
}

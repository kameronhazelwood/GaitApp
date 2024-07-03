package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IPainModel;

import java.util.Optional;

public interface PainService {
    Optional<IPainModel> save(IPainModel painModel);
    IPainModel findAll();
    void delete(Long id);
}

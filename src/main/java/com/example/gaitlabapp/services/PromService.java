package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IPromModel;

import java.util.List;
import java.util.Optional;

public interface PromService {
    Optional<IPromModel> save(IPromModel promModel);
    List<IPromModel> findAll();
    void delete(Long id);
}

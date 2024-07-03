package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IShueeModel;

import java.util.Optional;

public interface ShueeService {
    Optional<IShueeModel> save(IShueeModel iShueeModel);
    IShueeModel findAll();
    void delete(Long id);
}

package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IVariabilityModel;

import java.util.List;

public interface VariabilityService {
    IVariabilityModel save(IVariabilityModel variabilityModel);
    IVariabilityModel update(IVariabilityModel variabilityModel);
    List<IVariabilityModel> findAll();
}

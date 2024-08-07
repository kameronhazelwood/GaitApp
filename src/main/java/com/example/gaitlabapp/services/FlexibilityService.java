package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IFlexibilityModel;

import java.util.List;

public interface FlexibilityService {
    IFlexibilityModel save(IFlexibilityModel flexibilityModel);
    IFlexibilityModel update(IFlexibilityModel flexibilityModel);
    List<IFlexibilityModel> findAll();
    void delete(Long id);
}

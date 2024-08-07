package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IFootConditionsModel;

import java.util.List;

public interface FootConditionsService {
    IFootConditionsModel save(IFootConditionsModel footConditionsModel);
    IFootConditionsModel update(IFootConditionsModel footConditionsModel);
    List<IFootConditionsModel> findAll();
    void delete(Long id);
}

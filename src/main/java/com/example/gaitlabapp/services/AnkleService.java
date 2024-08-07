package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IAnkleModel;

import java.util.List;

public interface AnkleService {
    IAnkleModel save(IAnkleModel ankleModel);
    IAnkleModel update(IAnkleModel ankleModel);
    List<IAnkleModel> findAll();
    void delete(Long id);
}

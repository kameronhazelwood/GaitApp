package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IKneeMomentsModel;
import com.example.gaitlabapp.model.forms.videoAssessment.IKneeModel;

import java.util.List;

public interface KneeService {
    IKneeModel save(IKneeModel IKneeModel);
    IKneeModel update(IKneeModel kneeModel);
    List<IKneeModel> findAll();
    void delete(Long id);
}

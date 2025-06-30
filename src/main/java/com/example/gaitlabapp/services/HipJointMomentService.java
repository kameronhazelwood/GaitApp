package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IHipJointMomentsModel;

import java.util.List;

public interface HipJointMomentService {
    IHipJointMomentsModel save(IHipJointMomentsModel hipJointMomentsModel);
    IHipJointMomentsModel update(IHipJointMomentsModel hipJointMomentsModel);
    List<IHipJointMomentsModel> findAll();
}

package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IKneeJointAnglesModel;

import java.util.List;

public interface KneeJointService {
    IKneeJointAnglesModel save(IKneeJointAnglesModel kneeJointAnglesModel);
    IKneeJointAnglesModel update(IKneeJointAnglesModel kneeJointAnglesModel);
    List<IKneeJointAnglesModel> findAll();
}

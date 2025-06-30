package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IArmJointAnglesModel;

import java.util.List;

public interface ArmJointsAnglesSerivce {
    IArmJointAnglesModel save (IArmJointAnglesModel armJointAnglesModel);
    IArmJointAnglesModel update (IArmJointAnglesModel armJointAnglesModel);
    List<IArmJointAnglesModel> findAll();
    void delete(Long id);
}

package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IAnkleJointAnglesModel;

import java.util.List;

public interface AnkleJointService {
    IAnkleJointAnglesModel save(IAnkleJointAnglesModel ankleJointAnglesModel);
    IAnkleJointAnglesModel update(IAnkleJointAnglesModel ankleJointAnglesModel);
    List<IAnkleJointAnglesModel> findAll();
}

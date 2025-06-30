package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IHipJointModel;

import java.util.List;

public interface HipJointService {
    IHipJointModel save(IHipJointModel hipJointModel);
    IHipJointModel update(IHipJointModel hipJointModel);
    List<IHipJointModel> findAll();
}

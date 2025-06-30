package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IAnkleJointMomentModel;

import java.util.List;

public interface AnkleJointMomentService {
    IAnkleJointMomentModel save(IAnkleJointMomentModel ankleJointMomentModel);
    IAnkleJointMomentModel update(IAnkleJointMomentModel ankleJointMomentModel);
    List<IAnkleJointMomentModel> findAll();
}

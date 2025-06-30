package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.ISaggitalJointModel;

import java.util.List;

public interface SaggitalJointService {
    ISaggitalJointModel save(ISaggitalJointModel saggitalJointModel);
    ISaggitalJointModel update(ISaggitalJointModel saggitalJointModel);
    List<ISaggitalJointModel> findAll();
}

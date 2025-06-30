package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IPelvisOrientationModel;

import java.util.List;

public interface PelvisOrienService {
    IPelvisOrientationModel save(IPelvisOrientationModel pelvisOrientationModel);
    IPelvisOrientationModel update(IPelvisOrientationModel pelvisOrientationModel);
    List<IPelvisOrientationModel> findAll();
}

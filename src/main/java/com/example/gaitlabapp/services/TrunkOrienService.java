package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.ITrunkOrientationModel;

import java.util.List;

public interface TrunkOrienService {
    ITrunkOrientationModel save(ITrunkOrientationModel trunkOrientationModel);
    ITrunkOrientationModel update(ITrunkOrientationModel trunkOrientationModel);
    List<ITrunkOrientationModel> findAll();
}

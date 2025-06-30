package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IFootOrientationModel;

import java.util.List;

public interface FootOrienService {
    IFootOrientationModel save(IFootOrientationModel footOrientationModel);
    IFootOrientationModel update(IFootOrientationModel footOrientationModel);
    List<IFootOrientationModel> findAll();
}

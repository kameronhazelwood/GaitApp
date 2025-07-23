package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IRecomSurgicalModel;

import java.util.List;

public interface RecomSurgicalService {
    IRecomSurgicalModel save(IRecomSurgicalModel surgicalModel);
    IRecomSurgicalModel update(IRecomSurgicalModel surgicalModel);
    List<IRecomSurgicalModel> findAll();
}

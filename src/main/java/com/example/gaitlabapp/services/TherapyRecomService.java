package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.ITherapyRecomModel;

import java.util.List;

public interface TherapyRecomService {
    ITherapyRecomModel save(ITherapyRecomModel recomModel);
    ITherapyRecomModel update(ITherapyRecomModel recomModel);
    List<ITherapyRecomModel> findAll();
}

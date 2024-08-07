package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IAmbulatoryModel;

import java.util.List;

public interface AmbulatoryService {
    IAmbulatoryModel save(IAmbulatoryModel ambulatoryModel);
    IAmbulatoryModel update(IAmbulatoryModel ambulatoryModel);
    List<IAmbulatoryModel> findAll();
    void delete(Long id);

}

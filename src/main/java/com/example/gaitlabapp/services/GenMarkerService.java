package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IGenMarkInfoModel;

import java.util.List;

public interface GenMarkerService {
    IGenMarkInfoModel save(IGenMarkInfoModel genMarkInfoModel);
    IGenMarkInfoModel update(IGenMarkInfoModel genMarkInfoModel);
    List<IGenMarkInfoModel> findAll();
    IGenMarkInfoModel findByPatientId(Integer patientId);
    void delete(Long id);
}

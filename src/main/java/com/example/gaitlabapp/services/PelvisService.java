package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IPelvisModel;

import java.util.List;

public interface PelvisService {
    IPelvisModel save(IPelvisModel pelvisModel);
    IPelvisModel update(IPelvisModel pelvisModel);
    List<IPelvisModel> findAll();
    void delete(Long id);
}

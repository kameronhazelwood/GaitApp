package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IHipModel;

import java.util.List;

public interface HipService {
    IHipModel save(IHipModel hipModel);
    IHipModel update(IHipModel hipModel);
    List<IHipModel> findAll();
    void delete(Long id);
}

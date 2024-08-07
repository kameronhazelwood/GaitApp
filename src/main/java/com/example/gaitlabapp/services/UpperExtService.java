package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IUpperExtModel;

import java.util.List;

public interface UpperExtService {
    IUpperExtModel save(IUpperExtModel upperExtModel);
    IUpperExtModel update(IUpperExtModel upperExtModel);
    List<IUpperExtModel> findAll();
    void delete(Long id);
}

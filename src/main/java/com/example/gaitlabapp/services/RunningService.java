package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.IRunningModel;

import java.util.List;

public interface RunningService {
    IRunningModel save(IRunningModel runningModel);
    IRunningModel update(IRunningModel runningModel);
    List<IRunningModel> findAll();
    void delete(Long id);
}

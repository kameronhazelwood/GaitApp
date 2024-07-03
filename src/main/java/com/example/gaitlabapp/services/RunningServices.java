package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IRunningStrengthModel;

import java.util.Optional;

public interface RunningServices {
    Optional<IRunningStrengthModel> save(IRunningStrengthModel runningStrengthModel);
    IRunningStrengthModel findAll();
    void delete(Long id);
}

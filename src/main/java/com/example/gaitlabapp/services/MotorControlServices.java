package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IMotorControlModel;

import java.util.List;

public interface MotorControlServices {
    IMotorControlModel save(IMotorControlModel motorControlModel);
    IMotorControlModel update(IMotorControlModel motorControlModel);
    List<IMotorControlModel> findAll();
    void delete(Long id);
}

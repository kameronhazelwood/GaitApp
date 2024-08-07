package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IMovementDisorderModel;

import java.util.List;

public interface MovementDisorderService {
    IMovementDisorderModel save(IMovementDisorderModel movementDisorderModel);
    IMovementDisorderModel update(IMovementDisorderModel movementDisorderModel);
    List<IMovementDisorderModel> findAll();
    void delete(Long id);
}

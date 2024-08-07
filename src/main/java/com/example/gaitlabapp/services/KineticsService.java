package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IKineticsModel;

import java.util.List;

public interface KineticsService {
    IKineticsModel save(IKineticsModel kineticsModel);
    IKineticsModel update(IKineticsModel kineticsModel);
    List<IKineticsModel> findAll();
    void delete(Long id);
}

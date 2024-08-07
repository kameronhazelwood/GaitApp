package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.videoAssessment.ITrunkClass;

import java.util.List;

public interface TrunkService {
    ITrunkClass save(ITrunkClass trunkClass);
    ITrunkClass update(ITrunkClass trunkClass);
    List<ITrunkClass> findAll();
    void delete(Long id);
}

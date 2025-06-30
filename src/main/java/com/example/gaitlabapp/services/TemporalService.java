package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.ITemporalModel;

import java.util.List;

public interface TemporalService {
    ITemporalModel save(ITemporalModel temporalModel);
    ITemporalModel update(ITemporalModel temporalModel);
    List<ITemporalModel> findAll();
    void delete(Long id);
}

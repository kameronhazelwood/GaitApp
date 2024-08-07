package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IAdlModel;

import java.util.List;

public interface AdlService {
    IAdlModel save(IAdlModel adlModel);
    IAdlModel update(IAdlModel adlModel);
    List<IAdlModel> findAll();
    void delete(Long id);
}

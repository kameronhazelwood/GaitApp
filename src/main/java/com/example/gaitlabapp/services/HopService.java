package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IHopModel;

import java.util.List;

public interface HopService {
    IHopModel save(IHopModel hopModel);
    IHopModel update(IHopModel hopModel);
    List<IHopModel> findAll();
    void delete(Long id);
}

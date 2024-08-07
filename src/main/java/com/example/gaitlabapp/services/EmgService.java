package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IEMGModel;

import java.util.List;

public interface EmgService {
    IEMGModel save(IEMGModel iemgModel);
    IEMGModel update(IEMGModel iemgModel);
    List<IEMGModel> findAll();
    void delete(Long id);
}

package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.forms.IOrthosisModel;

import java.util.List;

public interface OrthosisService {
    IOrthosisModel save(IOrthosisModel orthosisModel);
    IOrthosisModel update(IOrthosisModel orthosisModel);
    List<IOrthosisModel> findAll();
    void delete(Long id);
}

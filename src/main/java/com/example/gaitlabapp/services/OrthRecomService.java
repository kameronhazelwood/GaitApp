package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IOrthoticsRecomModel;

import java.util.List;

public interface OrthRecomService {
    IOrthoticsRecomModel save(IOrthoticsRecomModel orthoticsRecomModel);
    IOrthoticsRecomModel update(IOrthoticsRecomModel orthoticsRecomModel);
    List<IOrthoticsRecomModel> findAll();
}

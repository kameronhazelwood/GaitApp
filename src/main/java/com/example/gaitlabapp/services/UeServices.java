package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.forms.IUeToneModel;

import java.util.Optional;

public interface UeServices {

    Optional<IUeToneModel> save(IUeToneModel iUeToneModel);
    IUeToneModel findAll();
    void delete(Long id);
}

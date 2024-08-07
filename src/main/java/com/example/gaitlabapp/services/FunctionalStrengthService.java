package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IFunctionalStrengthModel;

import java.util.List;

public interface FunctionalStrengthService {
    IFunctionalStrengthModel save(IFunctionalStrengthModel functionalStrengthModel);
    IFunctionalStrengthModel update(IFunctionalStrengthModel functionalStrengthModel);
    List<IFunctionalStrengthModel> findAll();
    void delete(Long id);
}

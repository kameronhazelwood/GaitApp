package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.ICoreStrengthModel;

import java.util.List;

public interface CoreStrengthService {
    ICoreStrengthModel save(ICoreStrengthModel strengthModel);
    ICoreStrengthModel update(ICoreStrengthModel strengthModel);
    List<ICoreStrengthModel> findAll();
    void delete(Long id);
}

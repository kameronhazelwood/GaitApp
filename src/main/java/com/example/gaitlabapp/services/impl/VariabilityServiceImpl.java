package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IVariabilityModel;
import com.example.gaitlabapp.repo.VariabilityRepo;
import com.example.gaitlabapp.services.VariabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VariabilityServiceImpl implements VariabilityService {
    private final VariabilityRepo variabilityRepo;
    @Override
    public IVariabilityModel save(IVariabilityModel variabilityModel) {
        return null;
    }

    @Override
    public IVariabilityModel update(IVariabilityModel variabilityModel) {
        return null;
    }

    @Override
    public List<IVariabilityModel> findAll() {
        return variabilityRepo.findAll();
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IFunctionalStrengthModel;
import com.example.gaitlabapp.repo.FunctionalStrengthRepo;
import com.example.gaitlabapp.services.FunctionalStrengthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FunctionalStrengthServiceIimpl implements FunctionalStrengthService {
    private final FunctionalStrengthRepo functionalStrengthRepo;
    @Override
    public IFunctionalStrengthModel save(IFunctionalStrengthModel functionalStrengthModel) {
        return functionalStrengthRepo.save(functionalStrengthModel);
    }

    @Override
    public IFunctionalStrengthModel update(IFunctionalStrengthModel functionalStrengthModel) {
        return functionalStrengthRepo.save(functionalStrengthModel);
    }

    @Override
    public List<IFunctionalStrengthModel> findAll() {
        return functionalStrengthRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        functionalStrengthRepo.deleteById(String.valueOf(id));
    }
}

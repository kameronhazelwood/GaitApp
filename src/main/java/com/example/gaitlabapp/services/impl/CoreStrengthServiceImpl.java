package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.ICoreStrengthModel;
import com.example.gaitlabapp.repo.CoreStrengthRepo;
import com.example.gaitlabapp.services.CoreStrengthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoreStrengthServiceImpl implements CoreStrengthService {
    private final CoreStrengthRepo coreStrengthRepo;
    @Override
    public ICoreStrengthModel save(ICoreStrengthModel strengthModel) {
        return coreStrengthRepo.save(strengthModel);
    }

    @Override
    public ICoreStrengthModel update(ICoreStrengthModel strengthModel) {
        return coreStrengthRepo.save(strengthModel);
    }

    @Override
    public List<ICoreStrengthModel> findAll() {
        return coreStrengthRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        coreStrengthRepo.deleteById(String.valueOf(id));
    }
}

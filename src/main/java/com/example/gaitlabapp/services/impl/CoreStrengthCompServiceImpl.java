package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.comparisons.ICoreStrengthComparison;
import com.example.gaitlabapp.repo.CoreStrengthCompRepo;
import com.example.gaitlabapp.services.CoreStrengthCompServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoreStrengthCompServiceImpl implements CoreStrengthCompServices {
    private final CoreStrengthCompRepo coreStrengthCompRepo;
    @Override
    public ICoreStrengthComparison save(ICoreStrengthComparison coreStrengthComparison) {
        return coreStrengthCompRepo.save(coreStrengthComparison);
    }

    @Override
    public ICoreStrengthComparison update(ICoreStrengthComparison coreStrengthComparison) {
        return coreStrengthCompRepo.save(coreStrengthComparison);
    }

    @Override
    public List<ICoreStrengthComparison> findAll() {
        return coreStrengthCompRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        coreStrengthCompRepo.deleteById(String.valueOf(id));
    }
}

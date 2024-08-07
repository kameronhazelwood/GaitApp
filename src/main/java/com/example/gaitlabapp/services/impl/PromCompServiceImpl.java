package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.comparisons.IPromComparison;
import com.example.gaitlabapp.repo.PromCompRepo;
import com.example.gaitlabapp.services.PromCompService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PromCompServiceImpl implements PromCompService {
    private final PromCompRepo promCompRepo;
    @Override
    public IPromComparison save(IPromComparison promComparison) {
        return promCompRepo.save(promComparison);
    }

    @Override
    public IPromComparison update(IPromComparison promComparison) {
        return promCompRepo.save(promComparison);
    }

    @Override
    public List<IPromComparison> findAll() {
        return promCompRepo.findAll();
    }
    @Override
    public void delete(Long id) {

    }
}

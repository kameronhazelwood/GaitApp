package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.comparisons.IRunningStrengthComparison;
import com.example.gaitlabapp.repo.RunningStrenCompRepo;
import com.example.gaitlabapp.services.RunningStrenCompService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RunningStrenCompServiceImpl implements RunningStrenCompService {
    private final RunningStrenCompRepo runningStrenCompRepo;
    @Override
    public IRunningStrengthComparison save(IRunningStrengthComparison runningStrengthComparison) {
        return runningStrenCompRepo.save(runningStrengthComparison);
    }

    @Override
    public IRunningStrengthComparison update(IRunningStrengthComparison runningStrengthComparison) {
        return runningStrenCompRepo.save(runningStrengthComparison);
    }

    @Override
    public List<IRunningStrengthComparison> findAll() {
        return runningStrenCompRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        runningStrenCompRepo.deleteById(String.valueOf(id));
    }
}

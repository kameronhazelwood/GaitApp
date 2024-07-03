package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IRunningStrengthModel;
import com.example.gaitlabapp.repo.RunningRepo;
import com.example.gaitlabapp.services.RunningServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RunningServiceImpl implements RunningServices {
    private RunningRepo runningRepo;
    @Override
    public Optional<IRunningStrengthModel> save(IRunningStrengthModel runningStrengthModel) {
        return Optional.of(runningRepo.save(runningStrengthModel));
    }

    @Override
    public IRunningStrengthModel findAll() {
        return (IRunningStrengthModel) runningRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        runningRepo.deleteById(String.valueOf(id));
    }
}

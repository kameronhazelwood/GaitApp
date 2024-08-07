package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IRunningModel;
import com.example.gaitlabapp.repo.RunningRepo;
import com.example.gaitlabapp.services.RunningService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RunningServiceImpl implements RunningService {
    private final RunningRepo runningRepo;
    @Override
    public IRunningModel save(IRunningModel runningModel) {
        return runningRepo.save(runningModel);
    }

    @Override
    public IRunningModel update(IRunningModel runningModel) {
        return runningRepo.save(runningModel);
    }

    @Override
    public List<IRunningModel> findAll() {
        return runningRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        runningRepo.deleteById(String.valueOf(id));
    }
}

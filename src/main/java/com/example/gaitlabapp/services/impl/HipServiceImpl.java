package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IHipModel;
import com.example.gaitlabapp.repo.HipRepo;
import com.example.gaitlabapp.services.HipService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HipServiceImpl implements HipService {
    private final HipRepo hipRepo;
    @Override
    public IHipModel save(IHipModel hipModel) {
        return hipRepo.save(hipModel);
    }

    @Override
    public IHipModel update(IHipModel hipModel) {
        return hipRepo.save(hipModel);
    }

    @Override
    public List<IHipModel> findAll() {
        return hipRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        hipRepo.deleteById(String.valueOf(id));
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.hipscores.IHipScoresModel;
import com.example.gaitlabapp.repo.HipScoreRepo;
import com.example.gaitlabapp.services.HipScoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HipScoreServiceImpl implements HipScoresService {
    private final HipScoreRepo hipScoreRepo;
    @Override
    public IHipScoresModel save(IHipScoresModel hipScoresModel) {
        return hipScoreRepo.save(hipScoresModel);
    }

    @Override
    public IHipScoresModel update(IHipScoresModel hipScoresModel) {
        return hipScoreRepo.save(hipScoresModel);
    }

    @Override
    public List<IHipScoresModel> findAll() {
        return hipScoreRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        hipScoreRepo.deleteById(String.valueOf(id));
    }
}

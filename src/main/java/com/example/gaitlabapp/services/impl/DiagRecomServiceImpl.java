package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IDiagRecommendations;
import com.example.gaitlabapp.repo.DiagRecomRepo;
import com.example.gaitlabapp.services.DiagRecomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiagRecomServiceImpl implements DiagRecomService {
    private final DiagRecomRepo diagRecomRepo;
    @Override
    public IDiagRecommendations save(IDiagRecommendations diagRecommendations) {
        return null;
    }

    @Override
    public IDiagRecommendations update(IDiagRecommendations diagRecommendations) {
        return null;
    }

    @Override
    public List<IDiagRecommendations> findAll() {
        return diagRecomRepo.findAll();
    }
}

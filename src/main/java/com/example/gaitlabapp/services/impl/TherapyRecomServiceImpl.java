package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.ITherapyRecomModel;
import com.example.gaitlabapp.repo.TherapyRecomRepo;
import com.example.gaitlabapp.services.TherapyRecomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TherapyRecomServiceImpl implements TherapyRecomService {
    private final TherapyRecomRepo therapyRecomRepo;
    @Override
    public ITherapyRecomModel save(ITherapyRecomModel recomModel) {
        return null;
    }

    @Override
    public ITherapyRecomModel update(ITherapyRecomModel recomModel) {
        return null;
    }

    @Override
    public List<ITherapyRecomModel> findAll() {
        return therapyRecomRepo.findAll();
    }
}

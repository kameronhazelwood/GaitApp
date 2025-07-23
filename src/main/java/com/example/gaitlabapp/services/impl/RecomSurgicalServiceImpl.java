package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IRecomSurgicalModel;
import com.example.gaitlabapp.repo.RecomSurgicalRepo;
import com.example.gaitlabapp.services.RecomSurgicalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecomSurgicalServiceImpl implements RecomSurgicalService {
    private final RecomSurgicalRepo recomSurgicalRepo;
    @Override
    public IRecomSurgicalModel save(IRecomSurgicalModel surgicalModel) {
        return null;
    }

    @Override
    public IRecomSurgicalModel update(IRecomSurgicalModel surgicalModel) {
        return null;
    }

    @Override
    public List<IRecomSurgicalModel> findAll() {
        return recomSurgicalRepo.findAll();
    }
}

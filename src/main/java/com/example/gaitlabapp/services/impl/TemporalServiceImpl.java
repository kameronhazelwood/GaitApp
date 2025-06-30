package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.ITemporalModel;
import com.example.gaitlabapp.repo.TemporalRepo;
import com.example.gaitlabapp.services.TemporalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TemporalServiceImpl implements TemporalService {
    private final TemporalRepo temporalRepo;
    @Override
    public ITemporalModel save(ITemporalModel temporalModel) {
        return null;
    }

    @Override
    public ITemporalModel update(ITemporalModel temporalModel) {
        return null;
    }

    @Override
    public List<ITemporalModel> findAll() {
        return temporalRepo.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}

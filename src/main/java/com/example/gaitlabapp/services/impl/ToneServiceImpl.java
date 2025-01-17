package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IToneModel;
import com.example.gaitlabapp.repo.ToneRepo;
import com.example.gaitlabapp.services.ToneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToneServiceImpl implements ToneService {
    private ToneRepo toneRepo;
    @Override
    public IToneModel save(IToneModel toneModel) {
        return toneRepo.save(toneModel);
    }

    @Override
    public IToneModel findAll() {
        return (IToneModel) toneRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        toneRepo.deleteById(String.valueOf(id));
    }
}

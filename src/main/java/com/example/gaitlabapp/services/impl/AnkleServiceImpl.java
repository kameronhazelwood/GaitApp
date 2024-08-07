package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IAnkleModel;
import com.example.gaitlabapp.repo.AnkleRepo;
import com.example.gaitlabapp.services.AnkleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnkleServiceImpl implements AnkleService {
    private final AnkleRepo ankleRepo;
    @Override
    public IAnkleModel save(IAnkleModel ankleModel) {
        return ankleRepo.save(ankleModel);
    }

    @Override
    public IAnkleModel update(IAnkleModel ankleModel) {
        return ankleRepo.save(ankleModel);
    }

    @Override
    public List<IAnkleModel> findAll() {
        return ankleRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        ankleRepo.deleteById(String.valueOf(id));
    }
}

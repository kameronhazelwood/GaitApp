package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IKneeModel;
import com.example.gaitlabapp.repo.KneeRepo;
import com.example.gaitlabapp.services.KneeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KneeServiceImpl implements KneeService {
    private final KneeRepo kneeRepo;
    @Override
    public IKneeModel save(IKneeModel kneeModel) {
        return kneeRepo.save(kneeModel);
    }

    @Override
    public IKneeModel update(IKneeModel kneeModel) {
        return kneeRepo.save(kneeModel);
    }

    @Override
    public List<IKneeModel> findAll() {
        return kneeRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        kneeRepo.deleteById(String.valueOf(id));
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IAmbulatoryModel;
import com.example.gaitlabapp.repo.AmbulatoryRepo;
import com.example.gaitlabapp.services.AmbulatoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AmbulatoryServiceImpl implements AmbulatoryService {
    private final AmbulatoryRepo ambulatoryRepo;
    @Override
    public IAmbulatoryModel save(IAmbulatoryModel ambulatoryModel) {
        return ambulatoryRepo.save(ambulatoryModel);
    }

    @Override
    public IAmbulatoryModel update(IAmbulatoryModel ambulatoryModel) {
        return ambulatoryRepo.save(ambulatoryModel);
    }

    @Override
    public List<IAmbulatoryModel> findAll() {
        return ambulatoryRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        ambulatoryRepo.deleteById(String.valueOf(id));
    }
}

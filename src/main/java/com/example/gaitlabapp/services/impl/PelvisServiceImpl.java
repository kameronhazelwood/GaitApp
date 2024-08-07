package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IPelvisModel;
import com.example.gaitlabapp.repo.PelvisRepo;
import com.example.gaitlabapp.services.PelvisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PelvisServiceImpl implements PelvisService {
    private final PelvisRepo pelvisRepo;
    @Override
    public IPelvisModel save(IPelvisModel pelvisModel) {
        return pelvisRepo.save(pelvisModel);
    }

    @Override
    public IPelvisModel update(IPelvisModel pelvisModel) {
        return pelvisRepo.save(pelvisModel);
    }

    @Override
    public List<IPelvisModel> findAll() {
        return pelvisRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        pelvisRepo.deleteById(String.valueOf(id));
    }
}

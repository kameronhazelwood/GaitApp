package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IOrthosisModel;
import com.example.gaitlabapp.repo.OrthosisRepo;
import com.example.gaitlabapp.services.OrthosisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrthosisServiceImpl implements OrthosisService {
    private final OrthosisRepo orthosisRepo;
    @Override
    public IOrthosisModel save(IOrthosisModel orthosisModel) {
        return orthosisRepo.save(orthosisModel);
    }

    @Override
    public IOrthosisModel update(IOrthosisModel orthosisModel) {
        return orthosisRepo.save(orthosisModel);
    }

    @Override
    public List<IOrthosisModel> findAll() {
        return orthosisRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        orthosisRepo.deleteById(String.valueOf(id));
    }
}

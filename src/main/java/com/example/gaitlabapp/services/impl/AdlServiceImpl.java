package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IAdlModel;
import com.example.gaitlabapp.repo.AdlRepo;
import com.example.gaitlabapp.services.AdlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdlServiceImpl implements AdlService {
    private final AdlRepo adlRepo;
    @Override
    public IAdlModel save(IAdlModel adlModel) {
        return adlRepo.save(adlModel);
    }

    @Override
    public IAdlModel update(IAdlModel adlModel) {
        return adlRepo.save(adlModel);
    }

    @Override
    public List<IAdlModel> findAll() {
        return adlRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        adlRepo.deleteById(String.valueOf(id));
    }
}

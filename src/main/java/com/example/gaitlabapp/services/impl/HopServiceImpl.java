package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IHopModel;
import com.example.gaitlabapp.repo.HopRepo;
import com.example.gaitlabapp.services.HopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HopServiceImpl implements HopService {
    private final HopRepo hopRepo;
    @Override
    public IHopModel save(IHopModel hopModel) {
        return hopRepo.save(hopModel);
    }

    @Override
    public IHopModel update(IHopModel hopModel) {
        return hopRepo.save(hopModel);
    }

    @Override
    public List<IHopModel> findAll() {
        return hopRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        hopRepo.deleteById(String.valueOf(id));
    }
}

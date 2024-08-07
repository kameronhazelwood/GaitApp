package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IKineticsModel;
import com.example.gaitlabapp.repo.KineticsRepo;
import com.example.gaitlabapp.services.KineticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KineticsServiceImpl implements KineticsService {
    private final KineticsRepo kineticsRepo;
    @Override
    public IKineticsModel save(IKineticsModel kineticsModel) {
        return kineticsRepo.save(kineticsModel);
    }

    @Override
    public IKineticsModel update(IKineticsModel kineticsModel) {
        return kineticsRepo.save(kineticsModel);
    }

    @Override
    public List<IKineticsModel> findAll() {
        return kineticsRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        kineticsRepo.deleteById(String.valueOf(id));
    }
}

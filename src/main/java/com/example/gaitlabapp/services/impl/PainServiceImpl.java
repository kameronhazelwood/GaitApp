package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IPainModel;
import com.example.gaitlabapp.repo.PainRepo;
import com.example.gaitlabapp.services.PainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PainServiceImpl implements PainService {
    private PainRepo painRepo;
    @Override
    public IPainModel save(IPainModel painModel) {
        return painRepo.save(painModel);
    }

    @Override
    public IPainModel findAll() {
        return (IPainModel) painRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        painRepo.deleteById(String.valueOf(id));
    }
}

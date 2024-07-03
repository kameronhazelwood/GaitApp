package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IUeToneModel;
import com.example.gaitlabapp.repo.UeRepo;
import com.example.gaitlabapp.services.UeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UeServiceImpl implements UeServices {
    private UeRepo ueRepo;
    @Override
    public Optional<IUeToneModel> save(IUeToneModel iUeToneModel) {
        return Optional.of(ueRepo.save(iUeToneModel));
    }

    @Override
    public IUeToneModel findAll() {
        return (IUeToneModel) ueRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        ueRepo.deleteById(String.valueOf(id));
    }
}

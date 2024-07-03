package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IShueeModel;
import com.example.gaitlabapp.repo.ShueeRepo;
import com.example.gaitlabapp.services.ShueeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShueeServiceImpl implements ShueeService {
    private ShueeRepo shueeRepo;
    @Override
    public Optional<IShueeModel> save(IShueeModel iShueeModel) {
        return Optional.of(shueeRepo.save(iShueeModel));
    }

    @Override
    public IShueeModel findAll() {
        return (IShueeModel) shueeRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        shueeRepo.deleteById(String.valueOf(id));
    }
}

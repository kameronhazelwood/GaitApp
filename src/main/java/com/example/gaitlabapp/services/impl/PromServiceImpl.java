package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IPromModel;
import com.example.gaitlabapp.repo.PromRepo;
import com.example.gaitlabapp.services.PromService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PromServiceImpl implements PromService {
    private PromRepo promRepo;
    @Override
    public IPromModel save(IPromModel promModel) {
        return promRepo.save(promModel);
    }

    @Override
    public List<IPromModel> findAll() {
        return (List<IPromModel>) promRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        promRepo.deleteById(String.valueOf(id));
    }
}

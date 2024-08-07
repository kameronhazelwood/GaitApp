package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IUpperExtModel;
import com.example.gaitlabapp.repo.UpperExtRepo;
import com.example.gaitlabapp.services.UpperExtService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UpperExtServiceImpl implements UpperExtService {
    private final UpperExtRepo upperExtRepo;
    @Override
    public IUpperExtModel save(IUpperExtModel upperExtModel) {
        return upperExtRepo.save(upperExtModel);
    }

    @Override
    public IUpperExtModel update(IUpperExtModel upperExtModel) {
        return upperExtRepo.save(upperExtModel);
    }

    @Override
    public List<IUpperExtModel> findAll() {
        return upperExtRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        upperExtRepo.deleteById(String.valueOf(id));
    }
}

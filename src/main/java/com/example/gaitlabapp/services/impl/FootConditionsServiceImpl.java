package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.IFootConditionsModel;
import com.example.gaitlabapp.repo.FootConditionsRepo;
import com.example.gaitlabapp.services.FootConditionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FootConditionsServiceImpl implements FootConditionsService {
    private final FootConditionsRepo footConditionsRepo;
    @Override
    public IFootConditionsModel save(IFootConditionsModel footConditionsModel) {
        return footConditionsRepo.save(footConditionsModel);
    }

    @Override
    public IFootConditionsModel update(IFootConditionsModel footConditionsModel) {
        return footConditionsRepo.save(footConditionsModel);
    }

    @Override
    public List<IFootConditionsModel> findAll() {
      return  footConditionsRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        footConditionsRepo.deleteById(String.valueOf(id));
    }
}

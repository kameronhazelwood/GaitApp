package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IFlexibilityModel;
import com.example.gaitlabapp.repo.FlexibilityRepo;
import com.example.gaitlabapp.services.FlexibilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlexibilityServiceImpl implements FlexibilityService {
    private final FlexibilityRepo flexibilityRepo;
    @Override
    public IFlexibilityModel save(IFlexibilityModel flexibilityModel) {
        return flexibilityRepo.save(flexibilityModel);
    }

    @Override
    public IFlexibilityModel update(IFlexibilityModel flexibilityModel) {
        return flexibilityRepo.save(flexibilityModel);
    }

    @Override
    public List<IFlexibilityModel> findAll() {
        return flexibilityRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        flexibilityRepo.deleteById(String.valueOf(id));
    }
}

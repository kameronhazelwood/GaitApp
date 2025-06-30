package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IHipJointMomentsModel;
import com.example.gaitlabapp.repo.HipJointMomentRepo;
import com.example.gaitlabapp.services.HipJointMomentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HipJointMomentServiceImpl implements HipJointMomentService {
    private final HipJointMomentRepo hipJointMomentRepo;
    @Override
    public IHipJointMomentsModel save(IHipJointMomentsModel hipJointMomentsModel) {
        return null;
    }

    @Override
    public IHipJointMomentsModel update(IHipJointMomentsModel hipJointMomentsModel) {
        return null;
    }

    @Override
    public List<IHipJointMomentsModel> findAll() {
        return hipJointMomentRepo.findAll();
    }
}

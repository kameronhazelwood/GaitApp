package com.example.gaitlabapp.services.impl;


import com.example.gaitlabapp.model.forms.IKneeJointAnglesModel;
import com.example.gaitlabapp.repo.KneeJointRepo;
import com.example.gaitlabapp.services.KneeJointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KneeJointServiceImpl implements KneeJointService {
    private final KneeJointRepo kneeJointRepo;

    @Override
    public IKneeJointAnglesModel save(IKneeJointAnglesModel kneeJointAnglesModel) {
        return null;
    }

    @Override
    public IKneeJointAnglesModel update(IKneeJointAnglesModel kneeJointAnglesModel) {
        return null;
    }

    @Override
    public List<IKneeJointAnglesModel> findAll() {
        return kneeJointRepo.findAll();
    }
}

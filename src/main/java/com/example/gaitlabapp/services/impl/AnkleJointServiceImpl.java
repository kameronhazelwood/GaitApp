package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IAnkleJointAnglesModel;
import com.example.gaitlabapp.repo.AnkleJointRepo;
import com.example.gaitlabapp.services.AnkleJointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnkleJointServiceImpl implements AnkleJointService {
    private final AnkleJointRepo ankleJointRepo;
    @Override
    public IAnkleJointAnglesModel save(IAnkleJointAnglesModel ankleJointAnglesModel) {
        return null;
    }

    @Override
    public IAnkleJointAnglesModel update(IAnkleJointAnglesModel ankleJointAnglesModel) {
        return null;
    }

    @Override
    public List<IAnkleJointAnglesModel> findAll() {
        return ankleJointRepo.findAll();
    }
}

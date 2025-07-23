package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IAnkleJointMomentModel;
import com.example.gaitlabapp.repo.AnkleJointMomentRepo;
import com.example.gaitlabapp.services.AnkleJointMomentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnkleJointMomentServiceImpl implements AnkleJointMomentService {
    private final AnkleJointMomentRepo ankleJointMomentRepo;
    @Override
    public IAnkleJointMomentModel save(IAnkleJointMomentModel ankleJointMomentModel) {
        return null;
    }

    @Override
    public IAnkleJointMomentModel update(IAnkleJointMomentModel ankleJointMomentModel) {
        return null;
    }

    @Override
    public List<IAnkleJointMomentModel> findAll() {
        return ankleJointMomentRepo.findAll();
    }
}

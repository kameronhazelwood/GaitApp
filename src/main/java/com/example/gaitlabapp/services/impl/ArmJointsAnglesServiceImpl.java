package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IArmJointAnglesModel;
import com.example.gaitlabapp.repo.ArmJointRepo;
import com.example.gaitlabapp.services.ArmJointsAnglesSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArmJointsAnglesServiceImpl implements ArmJointsAnglesSerivce {
    private final ArmJointRepo armJointRepo;

    @Override
    public IArmJointAnglesModel save(IArmJointAnglesModel armJointAnglesModel) {
        return null;
    }

    @Override
    public IArmJointAnglesModel update(IArmJointAnglesModel armJointAnglesModel) {
        return null;
    }

    public List<IArmJointAnglesModel> findAll() {return armJointRepo.findAll();}

    @Override
    public void delete(Long id) {

    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IMotorControlModel;
import com.example.gaitlabapp.repo.MotorControlRepo;
import com.example.gaitlabapp.services.MotorControlServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MotorControlServicesImpl implements MotorControlServices {
    private final MotorControlRepo motorControlRepo;
    @Override
    public IMotorControlModel save(IMotorControlModel motorControlModel) {
        return motorControlRepo.save(motorControlModel);
    }

    @Override
    public IMotorControlModel update(IMotorControlModel motorControlModel) {
        return motorControlRepo.save(motorControlModel);
    }

    @Override
    public List<IMotorControlModel> findAll() {
        return motorControlRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        motorControlRepo.deleteById(String.valueOf(id));
    }
}

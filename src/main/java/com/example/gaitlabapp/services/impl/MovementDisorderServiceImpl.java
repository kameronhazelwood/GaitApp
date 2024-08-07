package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IMovementDisorderModel;
import com.example.gaitlabapp.repo.MovementDisorderRepo;
import com.example.gaitlabapp.services.MovementDisorderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovementDisorderServiceImpl implements MovementDisorderService {
    private final MovementDisorderRepo movementDisorderRepo;
    @Override
    public IMovementDisorderModel save(IMovementDisorderModel movementDisorderModel) {
        return movementDisorderRepo.save(movementDisorderModel);
    }

    @Override
    public IMovementDisorderModel update(IMovementDisorderModel movementDisorderModel) {
        return movementDisorderRepo.save(movementDisorderModel);
    }

    @Override
    public List<IMovementDisorderModel> findAll() {
        return movementDisorderRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        movementDisorderRepo.deleteById(String.valueOf(id));
    }
}

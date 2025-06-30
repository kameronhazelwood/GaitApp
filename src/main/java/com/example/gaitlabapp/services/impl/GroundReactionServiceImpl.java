package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IGroundReactionForces;
import com.example.gaitlabapp.repo.GroundReactionRepo;
import com.example.gaitlabapp.services.GroundReactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroundReactionServiceImpl implements GroundReactionService {
    private final GroundReactionRepo groundReactionRepo;
    @Override
    public IGroundReactionForces save(IGroundReactionForces groundReactionForces) {
        return null;
    }

    @Override
    public IGroundReactionForces update(IGroundReactionForces groundReactionForces) {
        return null;
    }

    @Override
    public List<IGroundReactionForces> findAll() {
        return groundReactionRepo.findAll();
    }
}

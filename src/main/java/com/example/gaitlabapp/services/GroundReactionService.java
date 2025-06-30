package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IGroundReactionForces;

import java.util.List;

public interface GroundReactionService {
    IGroundReactionForces save(IGroundReactionForces groundReactionForces);
    IGroundReactionForces update(IGroundReactionForces groundReactionForces);
    List<IGroundReactionForces> findAll();
}

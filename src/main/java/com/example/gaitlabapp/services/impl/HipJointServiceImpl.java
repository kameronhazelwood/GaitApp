package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IHipJointModel;
import com.example.gaitlabapp.repo.HipJointRepo;
import com.example.gaitlabapp.services.HipJointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HipJointServiceImpl implements HipJointService {
    private final HipJointRepo hipJointRepo;
    @Override
    public IHipJointModel save(IHipJointModel hipJointModel) {
        return null;
    }

    @Override
    public IHipJointModel update(IHipJointModel hipJointModel) {
        return null;
    }

    @Override
    public List<IHipJointModel> findAll() {
        return hipJointRepo.findAll();
    }
}

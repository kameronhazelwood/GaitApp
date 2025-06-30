package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.ISaggitalJointModel;
import com.example.gaitlabapp.repo.SaggitalJointRepo;
import com.example.gaitlabapp.services.SaggitalJointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaggitalJointServiceImpl implements SaggitalJointService {
    private final SaggitalJointRepo saggitalJointRepo;
    @Override
    public ISaggitalJointModel save(ISaggitalJointModel saggitalJointModel) {
        return null;
    }

    @Override
    public ISaggitalJointModel update(ISaggitalJointModel saggitalJointModel) {
        return null;
    }

    @Override
    public List<ISaggitalJointModel> findAll() {
        return saggitalJointRepo.findAll();
    }
}

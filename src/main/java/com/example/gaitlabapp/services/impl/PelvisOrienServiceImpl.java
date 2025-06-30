package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IPelvisOrientationModel;
import com.example.gaitlabapp.repo.PelvisOrienRepo;
import com.example.gaitlabapp.services.PelvisOrienService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PelvisOrienServiceImpl implements PelvisOrienService {
    private final PelvisOrienRepo pelvisOrienRepo;
    @Override
    public IPelvisOrientationModel save(IPelvisOrientationModel pelvisOrientationModel) {
        return null;
    }

    @Override
    public IPelvisOrientationModel update(IPelvisOrientationModel pelvisOrientationModel) {
        return null;
    }

    @Override
    public List<IPelvisOrientationModel> findAll() {
        return pelvisOrienRepo.findAll();
    }
}

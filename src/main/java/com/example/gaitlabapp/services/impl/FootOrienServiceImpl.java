package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IFootOrientationModel;
import com.example.gaitlabapp.repo.FootOrienRepo;
import com.example.gaitlabapp.services.FootOrienService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FootOrienServiceImpl implements FootOrienService {
    private final FootOrienRepo footOrienRepo;
    @Override
    public IFootOrientationModel save(IFootOrientationModel footOrientationModel) {
        return null;
    }

    @Override
    public IFootOrientationModel update(IFootOrientationModel footOrientationModel) {
        return null;
    }

    @Override
    public List<IFootOrientationModel> findAll() {
        return footOrienRepo.findAll();
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.ITrunkOrientationModel;
import com.example.gaitlabapp.repo.TrunkOrienRepo;
import com.example.gaitlabapp.services.TrunkOrienService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrunkOrienServiceImpl implements TrunkOrienService {
    private final TrunkOrienRepo trunkOrienRepo;
    @Override
    public ITrunkOrientationModel save(ITrunkOrientationModel trunkOrientationModel) {
        return null;
    }

    @Override
    public ITrunkOrientationModel update(ITrunkOrientationModel trunkOrientationModel) {
        return null;
    }

    @Override
    public List<ITrunkOrientationModel> findAll() {
        return trunkOrienRepo.findAll();
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IGenMarkInfoModel;
import com.example.gaitlabapp.repo.GenMarkerRepo;
import com.example.gaitlabapp.services.GenMarkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenMarkerServiceImpl implements GenMarkerService {
    private final GenMarkerRepo genMarkerRepo;
    @Override
    public IGenMarkInfoModel save(IGenMarkInfoModel genMarkInfoModel) {
        return genMarkerRepo.save(genMarkInfoModel);
    }

    @Override
    public IGenMarkInfoModel update(IGenMarkInfoModel genMarkInfoModel) {
        return genMarkerRepo.save(genMarkInfoModel);
    }

    @Override
    public List<IGenMarkInfoModel> findAll() {
        return genMarkerRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        genMarkerRepo.deleteById(String.valueOf(id));
    }
}

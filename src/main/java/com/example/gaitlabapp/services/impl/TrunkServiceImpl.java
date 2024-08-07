package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.videoAssessment.ITrunkClass;
import com.example.gaitlabapp.repo.TrunkRepo;
import com.example.gaitlabapp.services.TrunkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrunkServiceImpl implements TrunkService {
    private final TrunkRepo trunkRepo;
    @Override
    public ITrunkClass save(ITrunkClass trunkClass) {
        return trunkRepo.save(trunkClass);
    }

    @Override
    public ITrunkClass update(ITrunkClass trunkClass) {
        return trunkRepo.save(trunkClass);
    }

    @Override
    public List<ITrunkClass> findAll() {
        return trunkRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        trunkRepo.deleteById(String.valueOf(id));
    }
}

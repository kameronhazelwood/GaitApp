package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IAROMModel;
import com.example.gaitlabapp.repo.AromRepo;
import com.example.gaitlabapp.services.AromService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AromServiceImpl implements AromService {
    private final AromRepo aromRepo;
    @Override
    public IAROMModel save(IAROMModel iaromModel) {
        return aromRepo.save(iaromModel);
    }

    @Override
    public IAROMModel update(IAROMModel iaromModel) {
        return aromRepo.save(iaromModel);
    }

    @Override
    public List<IAROMModel> findAll() {
        return aromRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        aromRepo.deleteById(String.valueOf(id));
    }
}

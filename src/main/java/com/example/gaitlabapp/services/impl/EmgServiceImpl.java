package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IEMGModel;
import com.example.gaitlabapp.repo.EmgRepo;
import com.example.gaitlabapp.services.EmgService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmgServiceImpl implements EmgService {
    private final EmgRepo emgRepo;
    @Override
    public IEMGModel save(IEMGModel iemgModel) {
        return emgRepo.save(iemgModel);
    }

    @Override
    public IEMGModel update(IEMGModel iemgModel) {
        return emgRepo.save(iemgModel);
    }

    @Override
    public List<IEMGModel> findAll() {
        return emgRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        emgRepo.deleteById(String.valueOf(id));
    }
}

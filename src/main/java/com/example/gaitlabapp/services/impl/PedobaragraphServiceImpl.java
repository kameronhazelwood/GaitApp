package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IPedobaragraphModel;
import com.example.gaitlabapp.repo.PedobaragraphRepo;
import com.example.gaitlabapp.services.PedobaragraphService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedobaragraphServiceImpl implements PedobaragraphService {
    private final PedobaragraphRepo pedobaragraphRepo;
    @Override
    public IPedobaragraphModel save(IPedobaragraphModel pedobaragraphModel) {
        return null;
    }

    @Override
    public IPedobaragraphModel update(IPedobaragraphModel pedobaragraphModel) {
        return null;
    }

    @Override
    public List<IPedobaragraphModel> findAll() {
        return pedobaragraphRepo.findAll();
    }
}

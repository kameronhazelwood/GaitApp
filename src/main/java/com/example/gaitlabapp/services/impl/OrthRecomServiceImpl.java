package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IOrthoticsRecomModel;
import com.example.gaitlabapp.repo.OrthRecomRepo;
import com.example.gaitlabapp.services.OrthRecomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrthRecomServiceImpl implements OrthRecomService {
    private final OrthRecomRepo orthRecomRepo;
    @Override
    public IOrthoticsRecomModel save(IOrthoticsRecomModel orthoticsRecomModel) {
        return null;
    }

    @Override
    public IOrthoticsRecomModel update(IOrthoticsRecomModel orthoticsRecomModel) {
        return null;
    }

    @Override
    public List<IOrthoticsRecomModel> findAll() {
        return orthRecomRepo.findAll();
    }
}

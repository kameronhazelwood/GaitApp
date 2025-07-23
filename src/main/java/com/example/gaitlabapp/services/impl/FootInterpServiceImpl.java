package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IFootInterpModel;
import com.example.gaitlabapp.repo.FootInterpRepo;
import com.example.gaitlabapp.services.FootInterpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FootInterpServiceImpl implements FootInterpService {
    private final FootInterpRepo footInterpRepo;
    @Override
    public IFootInterpModel save(IFootInterpModel footInterpModel) {
        return null;
    }

    @Override
    public IFootInterpModel update(IFootInterpModel footInterpModel) {
        return null;
    }

    @Override
    public List<IFootInterpModel> findAll() {
        return footInterpRepo.findAll();
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.comparisons.IO2Comparison;
import com.example.gaitlabapp.repo.O2CompRepo;
import com.example.gaitlabapp.services.O2CompService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class O2CompServiceImpl implements O2CompService {
    private final O2CompRepo o2CompRepo;
    @Override
    public IO2Comparison save(IO2Comparison io2Comparison) {
        return o2CompRepo.save(io2Comparison);
    }

    @Override
    public IO2Comparison update(IO2Comparison io2Comparison) {
        return o2CompRepo.save(io2Comparison);
    }

    @Override
    public List<IO2Comparison> findAll() {
        return o2CompRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        o2CompRepo.deleteById(String.valueOf(id));
    }
}

package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.comparisons.IHopComparison;
import com.example.gaitlabapp.repo.HopCompRepo;
import com.example.gaitlabapp.services.HopCompServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HopCompServiceImpl implements HopCompServices {
    private final HopCompRepo hopCompRepo;
    @Override
    public IHopComparison save(IHopComparison hopComparison) {
        return hopCompRepo.save(hopComparison);
    }

    @Override
    public IHopComparison update(IHopComparison hopComparison) {
        return hopCompRepo.save(hopComparison);
    }

    @Override
    public List<IHopComparison> findAll() {
        return hopCompRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        hopCompRepo.deleteById(String.valueOf(id));
    }
}

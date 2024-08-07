package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.comparisons.IFlexibilityComparison;
import com.example.gaitlabapp.repo.FlexibilityCompRepo;
import com.example.gaitlabapp.services.FlexibilityCompService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlexibilityCompServiceImpl implements FlexibilityCompService {
    private final FlexibilityCompRepo flexibilityCompRepo;

    @Override
    public IFlexibilityComparison save(IFlexibilityComparison flexibilityComparison) {
        return flexibilityCompRepo.save(flexibilityComparison);
    }

    @Override
    public IFlexibilityComparison update(IFlexibilityComparison flexibilityComparison) {
        return flexibilityCompRepo.save(flexibilityComparison);
    }

    @Override
    public List<IFlexibilityComparison> findAll() {
        return flexibilityCompRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        flexibilityCompRepo.deleteById(String.valueOf(id));
    }
}

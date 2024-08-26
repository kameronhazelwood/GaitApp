package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IDiagnosisModel;
import com.example.gaitlabapp.repo.DiagnosisRepo;
import com.example.gaitlabapp.services.DiagnosisService;
import javafx.collections.transformation.SortedList;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DiagnosisServiceImpl implements DiagnosisService {
    private final DiagnosisRepo diagnosisRepo;
    @Override
    public Optional<IDiagnosisModel> save(IDiagnosisModel diagnosisModel) {
        return Optional.of(diagnosisRepo.save(diagnosisModel));
    }

    @Override
    public Optional<IDiagnosisModel> findByCode(String code) {
        return diagnosisRepo.findByCode(code);
    }

    @Override
    public Optional<IDiagnosisModel> findByDescription(String description) {
        return diagnosisRepo.findByDescription(description);
    }

    @Override
    public List<IDiagnosisModel> findAll() {
        return diagnosisRepo.findAll();
    }

    @Override
    public void delete(Long id) {
        diagnosisRepo.deleteById(String.valueOf(id));
    }
}

package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.patients.IDiagnosisModel;
import javafx.collections.ObservableList;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DiagnosisRepo  extends JpaRepository<IDiagnosisModel, String> {
    Optional<IDiagnosisModel> findByCode( String code);
    Optional<IDiagnosisModel> findByDescription( String description);
}

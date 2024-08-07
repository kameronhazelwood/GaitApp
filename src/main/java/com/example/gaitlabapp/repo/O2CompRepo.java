package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.comparisons.IO2Comparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface O2CompRepo extends JpaRepository<IO2Comparison, String> {
    List<IO2Comparison> findAll();
}

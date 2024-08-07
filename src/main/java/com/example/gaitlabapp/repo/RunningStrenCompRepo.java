package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.comparisons.IRunningStrengthComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RunningStrenCompRepo extends JpaRepository<IRunningStrengthComparison, String> {
    List<IRunningStrengthComparison> findAll();
}

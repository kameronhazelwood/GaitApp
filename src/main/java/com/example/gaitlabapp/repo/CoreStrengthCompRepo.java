package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.comparisons.ICoreStrengthComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoreStrengthCompRepo extends JpaRepository<ICoreStrengthComparison, String> {
    List<ICoreStrengthComparison> findAll();
}

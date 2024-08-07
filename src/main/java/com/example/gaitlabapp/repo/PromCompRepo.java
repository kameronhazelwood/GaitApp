package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.comparisons.IPromComparison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromCompRepo extends JpaRepository<IPromComparison, String> {
    List<IPromComparison> findAll();
}

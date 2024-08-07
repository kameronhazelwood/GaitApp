package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.ICoreStrengthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoreStrengthRepo extends JpaRepository<ICoreStrengthModel, String> {
    List<ICoreStrengthModel> findAll();
}

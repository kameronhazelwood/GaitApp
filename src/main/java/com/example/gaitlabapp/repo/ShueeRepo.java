package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IShueeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShueeRepo extends JpaRepository<IShueeModel, String> {
    List<IShueeModel> findAll();
}

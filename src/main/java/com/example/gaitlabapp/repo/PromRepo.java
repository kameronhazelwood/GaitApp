package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IPromModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromRepo extends JpaRepository<IPromModel, String> {
    List<IPromModel> findAll();
}

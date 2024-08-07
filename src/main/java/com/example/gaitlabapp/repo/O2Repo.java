package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IO2Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface O2Repo extends JpaRepository<IO2Model, String> {
    List<IO2Model> findAll();
}

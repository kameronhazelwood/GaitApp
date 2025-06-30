package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IFootOrientationModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootOrienRepo extends JpaRepository<IFootOrientationModel, String> {
}

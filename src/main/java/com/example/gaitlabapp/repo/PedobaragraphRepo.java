package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IPedobaragraphModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedobaragraphRepo extends JpaRepository<IPedobaragraphModel, String> {
}

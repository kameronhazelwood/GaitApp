package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.forms.IFootInterpModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootInterpRepo extends JpaRepository<IFootInterpModel, String> {
}

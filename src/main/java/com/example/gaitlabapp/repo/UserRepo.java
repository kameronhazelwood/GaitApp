package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.users.IUsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<IUsersModel, String> {
    Optional<IUsersModel> findByUsername(String username);

}

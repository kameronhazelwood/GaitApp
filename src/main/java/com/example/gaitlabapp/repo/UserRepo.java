package com.example.gaitlabapp.repo;

import com.example.gaitlabapp.model.users.IUsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<IUsersModel, String> {
    Optional<IUsersModel> findByUsername(String username);

}

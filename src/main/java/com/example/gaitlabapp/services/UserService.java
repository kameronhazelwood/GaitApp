package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.users.IUsersModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<IUsersModel> save(IUsersModel usersModel);

    Optional<IUsersModel> findByUsername(String username);

    List<IUsersModel> findAll();

    void delete(Long id);
}

package com.example.gaitlabapp.services.impl;


import com.example.gaitlabapp.model.users.IUsersModel;
import com.example.gaitlabapp.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepo repo;

    public Optional<IUsersModel> save(IUsersModel usersModel){
        return Optional.of(repo.save(usersModel));
    }
    public Optional<IUsersModel> findByUsername(String username){
        return repo.findByUsername(username);
    }
    public List<IUsersModel> findAll(){
        return repo.findAll();
    }
    public void delete(Long id){
        repo.deleteById(String.valueOf(id));
    }

}


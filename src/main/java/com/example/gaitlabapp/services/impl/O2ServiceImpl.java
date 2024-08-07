package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.forms.IO2Model;
import com.example.gaitlabapp.repo.O2Repo;
import com.example.gaitlabapp.services.O2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class O2ServiceImpl implements O2Service {
    private O2Repo o2Repo;
    @Override
    public IO2Model save(IO2Model io2Model) {
        return o2Repo.save(io2Model);
    }

    @Override
    public IO2Model update(IO2Model io2Model) {
        return o2Repo.save(io2Model);
    }

    @Override
    public List<IO2Model> findAll() {
        return o2Repo.findAll();
    }

    @Override
    public void delete(Long id) {
        o2Repo.deleteById(String.valueOf(id));
    }
}

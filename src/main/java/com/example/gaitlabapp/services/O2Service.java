package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IO2Model;

import java.util.List;

public interface O2Service {
    IO2Model save(IO2Model io2Model);
    IO2Model update(IO2Model io2Model);
    List<IO2Model> findAll();
    void delete(Long id);
}

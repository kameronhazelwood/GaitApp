package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IFootInterpModel;

import java.util.List;

public interface FootInterpService {
    IFootInterpModel save(IFootInterpModel footInterpModel);
    IFootInterpModel update(IFootInterpModel footInterpModel);
    List<IFootInterpModel> findAll();
}

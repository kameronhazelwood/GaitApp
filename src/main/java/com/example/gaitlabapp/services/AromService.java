package com.example.gaitlabapp.services;

import com.example.gaitlabapp.model.forms.IAROMModel;

import java.util.List;

public interface AromService {
    IAROMModel save(IAROMModel iaromModel);
    IAROMModel update(IAROMModel iaromModel);
    List<IAROMModel> findAll();
    void delete(Long id);
}

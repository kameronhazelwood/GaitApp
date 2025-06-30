package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.forms.IKneeMomentsModel;

import java.util.List;

public interface KneeMomentService {
    IKneeMomentsModel save(IKneeMomentsModel kneeMomentsModel);
    IKneeMomentsModel update(IKneeMomentsModel kneeMomentsModel);
    List<IKneeMomentsModel> findAll();
}

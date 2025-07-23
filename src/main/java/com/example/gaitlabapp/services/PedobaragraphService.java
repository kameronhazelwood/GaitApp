package com.example.gaitlabapp.services;


import com.example.gaitlabapp.model.forms.IPedobaragraphModel;

import java.util.List;

public interface PedobaragraphService {
    IPedobaragraphModel save(IPedobaragraphModel pedobaragraphModel);
    IPedobaragraphModel update(IPedobaragraphModel pedobaragraphModel);
    List<IPedobaragraphModel> findAll();
}

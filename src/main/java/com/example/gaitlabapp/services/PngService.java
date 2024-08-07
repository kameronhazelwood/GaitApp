package com.example.gaitlabapp.services;



import com.example.gaitlabapp.model.patients.IPngModel;

import java.util.List;

public interface PngService {
    IPngModel save(IPngModel pngModel);
    IPngModel update(IPngModel pngModel);
    List<IPngModel> findAll();
    void delete(Long id);
}

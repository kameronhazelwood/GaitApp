package com.example.gaitlabapp.services.impl;

import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepo repo;
    @Override
    public IPatientModel save(IPatientModel patientModel) { return repo.save(patientModel);}

    @Override
    public IPatientModel update(IPatientModel patientModel){ return repo.save(patientModel);}

    @Override
    public IPatientModel findByFirstName(String firstName) {
        return repo.findByFirstName(firstName);
    }

    @Override
    public Optional<IPatientModel> findByLastName(String lastName) {
        return repo.findByLastName(lastName);
    }

    @Override
    public IPatientModel findByMrn(String mrn) {
        return repo.findByMrn(mrn);
    }

    @Override
    public List<IPatientModel> findAll() {
        return repo.findAll();
    }
   @Override
   public boolean findDistinctByMrn(String mrn){
        IPatientModel patientModel = this.findByMrn(mrn);

        if(patientModel == null){
            return false;
        }else {
            if (mrn.equals(patientModel.getMrn())) return true;
            else return false;
        }
   }

    private final String FILE_PATH = "user.home";
//    @Override
//    public String uploadFileToDirectory(MultipartFile file) throws IOException {
//        String filePath = FILE_PATH+file.getOriginalFilename();
//
//        return filePath;
//
//    }

//    @Override
//    public IPatientModel findByImagePath(String imagePath) {
//        return null;
//    }

    //    @Override
//    public IPatientModel findByPatientId(Integer patientId) { return repo.findByPatientId(patientId); }
    @Override
    public void delete(Long id) {
        repo.deleteById(String.valueOf(id));
    }
}


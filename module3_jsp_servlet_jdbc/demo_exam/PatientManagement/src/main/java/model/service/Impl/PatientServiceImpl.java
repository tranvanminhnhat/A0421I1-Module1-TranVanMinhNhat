package model.service.Impl;

import model.bean.CaseRecord;
import model.bean.Patient;
import model.repository.Impl.PatientRepositoryImpl;
import model.repository.PatientRepository;
import model.service.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {
    PatientRepository patientRepository = new PatientRepositoryImpl();

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}

package model.service;

import model.bean.CaseRecord;
import model.bean.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> findAll();
}

package model.repository;

import model.bean.CaseRecord;
import model.bean.Patient;

import java.util.List;

public interface PatientRepository {
    List<Patient> findAll();
}

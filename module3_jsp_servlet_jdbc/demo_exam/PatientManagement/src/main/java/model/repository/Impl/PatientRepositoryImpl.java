package model.repository.Impl;

import model.bean.CaseRecord;
import model.bean.Patient;
import model.repository.PatientRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryImpl implements PatientRepository {
    BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_PATIENTS = "SELECT * FROM patient join case_record on case_record.patient_id = patient.patient_id;";


    @Override
    public List<Patient> findAll() {
        List<Patient> patientList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDatabase();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PATIENTS);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String case_record_id = resultSet.getString("case_record_id");
                String patient_id = resultSet.getString("patient_id");
                String patient_name = resultSet.getString("patient_name");
                String case_record_start_date = resultSet.getString("case_record_start_date");
                String case_record_end_date = resultSet.getString("case_record_end_date");
                String hospitalized_reason = resultSet.getString("hospitalized_reason");
                CaseRecord caseRecord = new CaseRecord(case_record_id, case_record_start_date, case_record_end_date, hospitalized_reason, patient_id);
                Patient patient = new Patient(patient_id, patient_name, caseRecord);
                patientList.add(patient);
            }
            preparedStatement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return patientList;
    }
}

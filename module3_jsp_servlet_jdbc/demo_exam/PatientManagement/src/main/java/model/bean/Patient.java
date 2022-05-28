package model.bean;

public class Patient {
    private String patient_id;
    private String patient_name;
    private CaseRecord caseRecord;

    public Patient() {
    }

    public Patient(String patient_id, String patient_name) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
    }

    public Patient(String patient_id, String patient_name, CaseRecord caseRecord) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.caseRecord = caseRecord;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }
}

package model.bean;

public class CaseRecord {
    private String case_record_id;
    private String case_record_start_date;
    private String case_record_end_date;
    private String hospitalized_reason;
    private String patient_id;

    public CaseRecord() {
    }

    public CaseRecord(String case_record_id, String case_record_start_date, String case_record_end_date, String hospitalized_reason, String patient_id) {
        this.case_record_id = case_record_id;
        this.case_record_start_date = case_record_start_date;
        this.case_record_end_date = case_record_end_date;
        this.hospitalized_reason = hospitalized_reason;
        this.patient_id = patient_id;
    }

    public String getCase_record_id() {
        return case_record_id;
    }

    public void setCase_record_id(String case_record_id) {
        this.case_record_id = case_record_id;
    }

    public String getCase_record_start_date() {
        return case_record_start_date;
    }

    public void setCase_record_start_date(String case_record_start_date) {
        this.case_record_start_date = case_record_start_date;
    }

    public String getCase_record_end_date() {
        return case_record_end_date;
    }

    public void setCase_record_end_date(String case_record_end_date) {
        this.case_record_end_date = case_record_end_date;
    }

    public String getHospitalized_reason() {
        return hospitalized_reason;
    }

    public void setHospitalized_reason(String hospitalized_reason) {
        this.hospitalized_reason = hospitalized_reason;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }
}

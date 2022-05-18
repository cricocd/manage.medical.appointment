package model;

public class HospitalAdministrationData {

    private String fullName;
    private String lastName;
    private String telephone;
    private String identificationType;
    private String doctorIdentificationId;
    private String patientIdentificationId;
    private String observation;
    private String successResult;
    private String menu;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getDoctorIdentificationId() {
        return doctorIdentificationId;
    }

    public void setDoctorIdentificationId(String doctorIdentificationId) {
        this.doctorIdentificationId = doctorIdentificationId;
    }

    public String getPatientIdentificationId() {
        return patientIdentificationId;
    }

    public void setPatientIdentificationId(String patientIdentificationId) {
        this.patientIdentificationId = patientIdentificationId;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getSuccessResult() {
        return successResult;
    }

    public void setSuccessResult(String successResult) {
        this.successResult = successResult;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}

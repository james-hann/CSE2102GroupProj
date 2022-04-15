import java.util.Scanner;

public class Patient {
    enum Insurance {
        PRIVATE,
        GOVERNMENT
    }
    enum Patient_type {
        PEDIATRIC,
        ADULT,
        GERIATRIC
    }
    private String last_name;
    private String first_name;
    private String address;
    private String phone_number;
    private String DOB;
    private Insurance insurance_type;
    private String insurance_t;
    private float copay;
    private Patient_type patient_type;
    private String patient_t;

    //Default constructor
//    public Patient() {
//        this.last_name = "N/A";
//        this.first_name = "N/A";
//        this.address = "N/A";
//        this.phone_number = "N/A";
//        this.DOB = "N/A";
//        this.insurance_type = "N/A";
//        this.copay = 0;
//        this.patient_type = "N/A";
//    }

    //constructor
    public Patient(String ln, String fn, String address, String phone_number, String DOB, Insurance insurance_type, float copay, Patient_type patient_type) {
        this.last_name = ln;
        this.first_name = fn;
        this.address = address;
        this.phone_number = phone_number;
        this.DOB = DOB;
        this.insurance_type = insurance_type;
        this.copay = copay;
        this.patient_type = patient_type;
    }

    public String getLastName() {return this.last_name;}
    public String getFirstName() {return this.first_name;}
    public String getAddress() {return this.address;}
    public String getPhoneNumber() {return this.phone_number;}
    public String getDOB() {return this.DOB;}
    public Insurance getInsuranceType() {return this.insurance_type;}
    public float getCopay() {return this.copay;}
    public Patient_type getPatientType() {return this.patient_type;}

    public void updateLastName(String ln) {this.last_name = ln;}
    public void updateFirstName(String fn) {this.first_name = fn;}
    public void updateAddress(String addr) {this.address = addr;}
    public void updatePhoneNumber(String pn) {this.phone_number = pn;}
    public void updateDOB(String date) {this.DOB = date;}
    public void updateInsuranceType(Insurance in_type) {this.insurance_type = in_type;}
    public void updateCopay(float cpay) {this.copay = cpay;}
    public void updatePatientType(Patient_type p_type) {this.patient_type = p_type;}

}

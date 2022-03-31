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
    private float copay;
    private Patient_type patient_type;

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

    public String get_type() {
        switch(insurance_type) {
            case PRIVATE:
                return "Private";
            case GOVERNMENT:
                return "Government";
            default:
                return "Invalid type"
        }
    }

    public String get_type() {
        switch(insurance_type) {
            case PRIVATE:
                return "Private";
            case GOVERNMENT:
                return "Government";
            default:
                return "Invalid type"
        }
    }

    //constructor
    public Patient(String init_ln, String init_fn, String init_address, String init_phone_number, String init_DOB, Insurance init_insurance_type, float init_copay, Patient_type init_patient_type) {
        this.last_name = init_ln;
        this.first_name = init_fn;
        this.address = init_address;
        this.phone_number = init_phone_number;
        this.DOB = init_DOB;
        this.insurance_type = init_insurance_type;
        this.copay = init_copay;
        this.patient_type = init_patient_type;
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
class MedicalConditions {
    private String physician;
    private String phys_phone_number;
    private String allergies;
    private String illness;

//    //Default constructor
//    public MedicalConditions() {
//        this.physician = "N/A";
//        this.phys_phone_number = "N/A";
//        this.allergies = "N/A";
//        this.illness = "N/A";
//    }

    //constructor
    public MedicalConditions(String init_physician, String init_phys_phone_number, String init_allergies, String init_illness) {
        this.physician = init_physician;
        this.phys_phone_number = init_phys_phone_number;
        this.allergies = init_allergies;
        this.illness = init_illness;
    }
}
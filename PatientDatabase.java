import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PatientDatabase {
    private Patient[] patient_list;
    private int num_patient;

    public void readFile(String filename) {
        Scanner patient_file = null;
        try {
            patient_file = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + filename);
            System.exit(0);
        }
        //for loop
    }

    public PatientDatabase(Patient[] patient_list, int num_patient) {
        this.patient_list = patient_list;
        this.num_patient = num_patient;
    }

    public void insertProfile(String ln, String fn, String address, String phone_number, String DOB, Patient.Insurance insurance_type, float copay, Patient.Patient_type patient_type) {
        Patient myPatient = new Patient(ln, fn, address, phone_number, DOB, insurance_type, copay, patient_type);
        this.patient_list[num_patient+1] = myPatient;
        this.num_patient++;
    }

    public void deleteProfile (String lastname, String DOB) {
        for (int i = 0; i<= this.num_patient; i++) {
            if (lastname == this.patient_list[i].getLastName() && DOB == this.patient_list[i].getDOB()) {
                //delete patient in this index
                //add the last patient to fill this spot and delete last patient as well
                //decrement count
            }
        }
    }

    public void finddisplayProfile (String lastname, String DOB) {
        for (int i = 0; i<= this.num_patient; i++) {
            if (lastname == this.patient_list[i].getLastName() && DOB == this.patient_list[i].getDOB()) {
                //display patient at this index
            }
        }
    }

    public void modifyProfile () {

    }
}

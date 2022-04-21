import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PatientDatabase {
    public int test = 1; //0 is the list implementation //1 is the ArrayList implementation
    if(test == 0){
        private Patient[] patient_list;
    }
    else if(test == 1){
        ArrayList<Patient> patient_list = new ArrayList<Patient>();
    }
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
        if(test == 0){
            this.patient_list[num_patient+1] = myPatient;
        }
        else if(test == 1){
            this.patient_list.add(myPatient);
        }
        this.num_patient++;
    }

    public void deleteProfile (String lastname, String DOB) {
        for (int i = 0; i<= this.num_patient; i++) {
            if(test == 0){
                if (lastname == this.patient_list[i].getLastName() && DOB == this.patient_list[i].getDOB()) {
                //delete patient in this index
                //add the last patient to fill this spot and delete last patient as well
                //decrement count
                //i is the element we want to delete
                //I think the below code might work
                this.patient_list[i].printAllPatientInfo; //this line checks what we should be deleting
                this.patient_list[i] = this.patient_list[-1]; //this overwrites the patient information we want to delete.
                this.patient_list[-1].updateFirstName(EndOfList) //this sets the last patient's first name to be end of list
                this.patient_list[-1].updateLastName(EndOfList) //this sets the last patient's last name to be end of list
                }
            }
            else if(test == 1){
                if (lastname == this.patient_list.get(i).getLastName() && DOB == this.patient_list.get(i).getDOB()) {
                    this.patient_list.remove(i)
            }
            }
        }
    }

    public void finddisplayProfile (String lastname, String DOB) {
        for (int i = 0; i<= this.num_patient; i++) {
            if(test == 0){
                if (lastname == this.patient_list[i].getLastName() && DOB == this.patient_list[i].getDOB()) {
                    //display patient at this index
                    this.patient_list[i].printAllPatientInfo();
                }
            }
            else if(test == 1){
                if (lastname == this.patient_list.get(i).getLastName() && DOB == this.patient_list.get(i).getDOB()) {
                    this.patient_list.get(i).printAllPatientInfo();
            }
        }
    }
    }
}

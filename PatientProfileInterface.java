import java.util.Scanner;
import java.util.ArrayList;

public class PatientProfileDatabase{

    public void enterNewPatient(){
        //TODO
    }

    public void deletePatient(){
        //TODO
    }

    public void findAndDisplayPatient(){
        //TODO
    }    
    public int findPatient() {
        Scanner lastNameScanner = new Scanner(System.in); //this creates a scanner object
        System.out.println("Enter the patient's last name: ");
        String lastName = lastNameScanner.nextLine();
        Scanner dobScanner = new Scanner(System.in); //this creates a scanner object
        System.out.println("Enter the patient's date of birth: ");
        String dob = dob.nextLine();
        for (int i = 0; i<= this.num_patient; i++) {
            if(test == 0){
                if (lastname == this.patient_list[i].getLastName() && dob == this.patient_list[i].getDOB()) {
                    return i;
                }
            }
            else if(test == 1){
                if (lastname == this.patient_list.get(i).getLastName() && dob == this.patient_list.get(i).getDOB()) {
                    return i;
            }
        }
    }
    }

    public void modifyProfile () {
        //I am a little confused on what the user should be able to modify.
        int patientIndex = findPatient(); //this will get the patient obejct that we want to update from the user

        Scanner updateTypeScanner = new Scanner(System.in); //this creates a scanner object
        System.out.println("What would you like to update for this patient: Type whichever words that are in quotation marks that you would like to update. Make sure you add spaces in between the words and you spell the words correctly. Type \"First Name\" if you would like to update the first name of the patient. Type \"Last Name\" if you would like to update the last name of the patient. Type \"Address\" if you would like to update the address of the patient. Type \"Phone Number\" if you would like to update the phone number of the patient. Type \"Insurance Type\" if you would like to update the insurance type of the patient. Type \"Copay\" if you would like to update the copay of the patient. Type \"Patient Type\" if you would like to update the patient type. Type \"physician info\" if you would like to update the name and phone number of the patient's physician. Type \"allergies\" if you would like to update the patient's allergies. Type \"conditions\" if you would like to update the patient's chronic conditions"); 
        String rawInput = updateTypeScanner.nextLine();
        String updateType = rawInput.toLowerCase(); //this turns all of the characters in the user input to lowercase letters.
        if(test == 1){
            if(updateType == "first name"){
                Scanner firstNameScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new first name for the patient: ");
                String newFirstName = firstNameScanner.nextLine();
                this.patient_list.get(patientIndex).updateFirstName(newFirstName);
            }
            if(updateType == "last name"){
                Scanner lastNameScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new last name for the patient: ");
                String newLastName = lastNameScanner.nextLine();
                this.patient_list.get(patientIndex).updateLastName(newLastName);
            }
            if(updateType == "address"){
                Scanner addressScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new address for the patient: ");
                String newAddress = addressScanner.nextLine();
                this.patient_list.get(patientIndex).updateAddress(newAddress);
            }
            if(updateType == "phone number"){
                Scanner phoneNumberScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new phone number for the patient: ");
                String newPhoneNumber = phoneNumberScanner.nextLine();
                this.patient_list.get(patientIndex).updatePhoneNumber(newPhoneNumber);
            }
            if(updateType == "insurance type"){
                Scanner insuranceTypeScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new insurance type for the patient: ");
                String newInsuranceType = insuranceTypeScanner.nextLine();
                this.patient_list.get(patientIndex).updateInsuranceType(newInsuranceType);
            }
            if(updateType == "copay"){
                Scanner copayScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new copay for the patient: ");
                String newCopay = copayScanner.nextLine();
                this.patient_list.get(patientIndex).updateCopay(newCopay);
            }
            if(updateType == "patient type"){
                Scanner patientTypeScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new patient type for the patient: ");
                String newPatientType = patientTypeScanner.nextLine();
                this.patient_list.get(patientIndex).updatePatientType(newPatientType);
            }
            if(updateType == "physician info"){
                Scanner nameScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new name for the patient's physician: ");
                String newName = nameScanner.nextLine();
                Scanner phoneNumberScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new phone number for the patient's physician: ");
                String newPhoneNumber = phoneNumberScanner.nextLine();
                this.patient_list.get(patientIndex).updatePhysician(newName);
                this.patient_list.get(patientIndex).updatePhys_phone_number(newPhoneNumber);
            }
            if(updateType == "allergies"){
                Scanner allergiesScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new list of allergies for the patient. This list should include all current allergies new and old that the patient still has: ");
                String newAllergies = allergiesScanner.nextLine();
                this.patient_list.get(patientIndex).updateAllergies(newAllergies);
            }
            if(updateType == "conditions"){
                Scanner conditionsScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the new list of chronic conditions for the patient. This should include all of the chronic conditions or illnesses new and old that the patient still has: ");
                String newConditions = conditionsScanner.nextLine();
                this.patient_list.get(patientIndex).updateIllness(newConditions);
            }
        }
    }

    public void searchDatabase(){
        Scanner infoTypeScanner = new Scanner(System.in); //this creates a scanner object
        System.out.println("What would you like to category would you like to search for: Type whichever words that are in quotation marks that you would like to search for. Make sure you add spaces in between the words and you spell the words correctly. Type \"physician\" if you would like to search for patients that see a specific doctor or physician. Type \"insurance\" if you would like to see patients that subscribe to a specific type of insurance. Type \"type\" if you would like to see a certain type of patient. Type \"allergy\" if you would like to see patients who have a specific allergy. Type \"illness\" if you would like to see patients who have a specific illness."); 
        String rawInput = infoTypeScanner.nextLine();
        String updateType = rawInput.toLowerCase(); //this turns all of the characters in the user input to lowercase letters.
        if(test == 1){
            if(updateType == "physician"){
                Scanner physicianScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the name of the doctor whose patients you would like to see: ");
                String physicianName = physicianScanner.nextLine();
                for (int i = 0; i<= this.num_patient; i++) {
                if (this.patient_list.get(i).getPhysician() == physicianName) {
                    print("Patient Name:");
                    print(this.patient_list.get(i).getFirstName());
                    print(this.patient_list.get(i).getLastName());
                }
            }
            }
            if(updateType == "insurance"){
                Scanner insuranceScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the name of the insurance whose patients you would like to see: ");
                String insurance = insuranceScanner.nextLine();
                for (int i = 0; i<= this.num_patient; i++) {
                if (this.patient_list.get(i).getInsuranceType() == insurance) {
                    print("Patient Name:");
                    print(this.patient_list.get(i).getFirstName());
                    print(this.patient_list.get(i).getLastName());
                }
            }
            }
            if(updateType == "type"){
                Scanner typeScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the type of patient you would like to see: ");
                String typeSearch = typeScanner.nextLine();
                for (int i = 0; i<= this.num_patient; i++) {
                if (this.patient_list.get(i).getPatientType() == typeSearch) {
                    print("Patient Name:");
                    print(this.patient_list.get(i).getFirstName());
                    print(this.patient_list.get(i).getLastName());
                }
            }
            }
            //Come back to this allegy if statement it is not going to work because you can have different combinations of the subset of the list of allergies.
            if(updateType == "allergy"){
                Scanner allergyScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the specific allergy that you would like to find which patients have it: ");
                String allergy = allergyScanner.nextLine();
                for (int i = 0; i<= this.num_patient; i++) {
                if (this.patient_list.get(i).getAllergies() == allergy) {
                    print("Patient Name:");
                    print(this.patient_list.get(i).getFirstName());
                    print(this.patient_list.get(i).getLastName());
                }
            }
            }
            //Come back to this. This also won't work becuase you can have several different combinations of illnesses
            if(updateType == "illness"){
                Scanner illnessScanner = new Scanner(System.in); //this creates a scanner object
                System.out.println("Enter the illness or condition that you would like to see the list of patients that have it: ");
                String illness = illnessScanner.nextLine();
                for (int i = 0; i<= this.num_patient; i++) {
                if (this.patient_list.get(i).getIllness() == illness) {
                    print("Patient Name:");
                    print(this.patient_list.get(i).getFirstName());
                    print(this.patient_list.get(i).getLastName());
                }
            }
            }
        }
    }
}

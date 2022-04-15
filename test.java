public class test {
    public static void main(String[] args) {
        Patient myPatient = new Patient("1", "2", "3", "4", "5", Patient.Insurance.PRIVATE, 7, Patient.Patient_type.ADULT);

        String last_name = myPatient.getLastName();
        String first_name = myPatient.getFirstName();
        String address = myPatient.getAddress();
        String phone_number = myPatient.getPhoneNumber();
        String DOB = myPatient.getDOB();
        Patient.Insurance insurance_type = myPatient.getInsuranceType();
        float copay = myPatient.getCopay();
        Patient.Patient_type patient_type = myPatient.getPatientType();

        System.out.println("=======Initial========");
        System.out.println(last_name+ "\t" + first_name + "\t" + address + "\t" + phone_number + "\t" + DOB + "\t" + insurance_type + "\t\t" + copay + "\t" + patient_type);

        myPatient.updateLastName("no");
        myPatient.updateFirstName("no");
        myPatient.updateAddress("no");
        myPatient.updatePhoneNumber("no");
        myPatient.updateDOB("no");
        myPatient.updateInsuranceType(Patient.Insurance.GOVERNMENT);
        myPatient.updateCopay(0);
        myPatient.updatePatientType(Patient.Patient_type.PEDIATRIC);

        last_name = myPatient.getLastName();
        first_name = myPatient.getFirstName();
        address = myPatient.getAddress();
        phone_number = myPatient.getPhoneNumber();
        DOB = myPatient.getDOB();
        insurance_type = myPatient.getInsuranceType();
        copay = myPatient.getCopay();
        patient_type = myPatient.getPatientType();

        System.out.println("======Updated======");
        System.out.println(last_name+ "\t" + first_name + "\t" + address + "\t" + phone_number + "\t" + DOB + "\t" + insurance_type + "\t" + copay + "\t" + patient_type);
    }
}

public class MedicalConditions {
    enum Allergy_type {
        FOOD,
        MEDICATION,
        SEASONAL,
        NONA,
        OTHER
    }

    enum Illness_type {
        DIABETES,
        CHD,
        ASTHMA,
        NONE,
        OTHER
    }
    private String physician;
    private String phys_phone_number;
    private Allergy_type allergies;
    private Illness_type illness;

//    //Default constructor
//    public MedicalConditions() {
//        this.physician = "N/A";
//        this.phys_phone_number = "N/A";
//        this.allergies = "N/A";
//        this.illness = "N/A";
//    }

    //constructor
    public MedicalConditions(String init_physician, String init_phys_phone_number, Allergy_type init_allergies, Illness_type init_illness) {
        this.physician = init_physician;
        this.phys_phone_number = init_phys_phone_number;
        this.allergies = init_allergies;
        this.illness = init_illness;
    }

    public String getPhysician() {return physician;}
    public String getPhys_phone_number() {return phys_phone_number;}
    public Allergy_type getAllergies() {return allergies;}
    public Illness_type getIllness() {return illness;}

    public void updatePhysician(String physician) {this.physician = physician;}
    public void updatePhys_phone_number(String phys_phone_number) {this.phys_phone_number = phys_phone_number;}
    public void updateAllergies(Allergy_type allergies) {this.allergies = allergies;}
    public void updateIllness(Illness_type illness) {this.illness = illness;}
}
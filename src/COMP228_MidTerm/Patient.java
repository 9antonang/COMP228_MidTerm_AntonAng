package COMP228_MidTerm;

// Patient class (single inheritance)
public class Patient extends Person {

    private final String patientNumber; 
    private int age;
    private String medicalDepartment;
    private double consultationFee;

    private static int patientCount = 0;

    public Patient(String personId, String name, String phoneNumber,
                   String patientNumber, int age, String medicalDepartment) {

        super(personId, name, phoneNumber);
        this.patientNumber = patientNumber;
        this.age = age;
        this.medicalDepartment = medicalDepartment;

        patientCount++;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    @Override
    public String getRoleDescription() {
        return "Patient";
    }

    // Overloaded registration (basic)
    public void registerPatient(String name, int age) {
        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        if (age <= 0 || age > 120) {
            System.out.println("Invalid age.");
            return;
        }

        setName(name);
        this.age = age;

        System.out.println("Patient registered (basic).");
    }

    // Overloaded registration (full)
    public void registerPatient(String name, int age, String department) {
        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        if (age <= 0 || age > 120) {
            System.out.println("Invalid age.");
            return;
        }
        if (department == null || department.isBlank()) {
            System.out.println("Department cannot be empty.");
            return;
        }

        setName(name);
        this.age = age;
        this.medicalDepartment = department;

        System.out.println("Patient registered (full).");
    }

    // show patient info
    public void displayPatientDetails() {
        System.out.println("----- PATIENT DETAILS -----");
        displayBasicDetails();
        System.out.println("Patient Number: " + patientNumber);
        System.out.println("Age: " + age);
        System.out.println("Department: " + medicalDepartment);
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("---------------------------");
    }

    public void setConsultationFee(double fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("Fee cannot be negative.");
        }
        this.consultationFee = fee;
    }

    // getters
    public int getAge() { return age; }
    public String getMedicalDepartment() { return medicalDepartment; }
    public double getConsultationFee() { return consultationFee; }
}

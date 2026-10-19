package COMP228_MidTerm;

public class MainDriver {
    public static void main(String[] args) {

        // Patients (shows single inheritance + overloading)
        Patient p1 = new Patient("P001", "Anton Ang", "555-1234",
                "PT100", 30, "Cardiology");

        Patient p2 = new Patient("P002", "Steph Curry", "555-5678",
                "PT101", 45, "Neurology");

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        // Doctor (shows overriding)
        Doctor d1 = new Doctor("D001", "Dr. James", "555-9999",
                "ST200", 8000, 50);

        System.out.println("----- DOCTOR DETAILS -----");
        d1.displayStaffDetails();
        System.out.println("Doctor Compensation: $" + d1.calculateMonthlyCompensation());

        // Nurse (shows hierarchical inheritance)
        Nurse n1 = new Nurse("N001", "Nurse Ty", "555-7777",
                "ST300", 5000, "Night", 300);

        System.out.println("----- NURSE DETAILS -----");
        n1.displayStaffDetails();
        System.out.println("Nurse Compensation: $" + n1.calculateMonthlyCompensation());

        // Specialist Doctor (shows multilevel inheritance + overriding)
        SpecialistDoctor sd1 = new SpecialistDoctor("D002", "Dr. Rose", "555-8888",
                "ST201", 12000, 70, "Diagnostics", 150);

        System.out.println("----- SPECIALIST DOCTOR DETAILS -----");
        sd1.displayStaffDetails();
        System.out.println("Specialist Compensation: $" + sd1.calculateMonthlyCompensation());

        // Static counters
        System.out.println("Total Persons: " + Person.getPersonCount());
        System.out.println("Total Patients: " + Patient.getPatientCount());
        System.out.println("Total Staff: " + MedicalStaff.getStaffCount());
    }
}

package COMP228_MidTerm;

// Abstract class for all medical staff
public abstract class MedicalStaff extends Person {

    private final String staffId;
    private double monthlySalary;

    private static int staffCount = 0;

    public MedicalStaff(String personId, String name, String phoneNumber,
                        String staffId, double monthlySalary) {

        super(personId, name, phoneNumber);
        this.staffId = staffId;
        this.monthlySalary = monthlySalary;

        staffCount++;
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public String getStaffId() { return staffId; }
    public double getMonthlySalary() { return monthlySalary; }
    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }

    // abstract compensation
    public abstract double calculateMonthlyCompensation();

    // show staff info
    public void displayStaffDetails() {
        displayBasicDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}

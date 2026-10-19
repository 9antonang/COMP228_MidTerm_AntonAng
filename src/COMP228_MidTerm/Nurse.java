package COMP228_MidTerm;

// Nurse class
public class Nurse extends MedicalStaff {

    private final String shiftType;
    private final double shiftAllowance;

    public Nurse(String personId, String name, String phoneNumber,
                 String staffId, double monthlySalary,
                 String shiftType, double shiftAllowance) {

        super(personId, name, phoneNumber, staffId, monthlySalary);
        this.shiftType = shiftType;
        this.shiftAllowance = shiftAllowance;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + shiftAllowance;
    }

    @Override
    public String getRoleDescription() {
        return "Nurse (" + shiftType + ")";
    }
}

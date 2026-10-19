package COMP228_MidTerm;

// Doctor class
public class Doctor extends MedicalStaff {

    private int patientsSeen;

    public Doctor(String personId, String name, String phoneNumber,
                  String staffId, double monthlySalary, int patientsSeen) {

        super(personId, name, phoneNumber, staffId, monthlySalary);
        this.patientsSeen = patientsSeen;
    }

    // overloaded fee calculation
    public double calculateConsultationFee(double baseFee) {
        return baseFee;
    }

    public double calculateConsultationFee(double baseFee, double surcharge) {
        return baseFee + surcharge;
    }

    @Override
    public double calculateMonthlyCompensation() {
        return getMonthlySalary() + (patientsSeen * 10);
    }

    @Override
    public String getRoleDescription() {
        return "Doctor";
    }
}

package COMP228_MidTerm;

// Specialist doctor class
public class SpecialistDoctor extends Doctor {

    private final String specialization;
    private final double specialistSurcharge;

    public SpecialistDoctor(String personId, String name, String phoneNumber,
                            String staffId, double monthlySalary, int patientsSeen,
                            String specialization, double specialistSurcharge) {

        super(personId, name, phoneNumber, staffId, monthlySalary, patientsSeen);
        this.specialization = specialization;
        this.specialistSurcharge = specialistSurcharge;
    }

    @Override
    public double calculateConsultationFee(double baseFee) {
        return baseFee + specialistSurcharge;
    }

    @Override
    public String getRoleDescription() {
        return "Specialist Doctor (" + specialization + ")";
    }
}

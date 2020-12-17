package api.regimen.dosage;

import api.regimen.medicine.medicineType.MedicineType;

public class Dosage {
    private double morning;
    private double afternoon;
    private MedicineType medicineType;

    public double getMorning() {
        return morning;
    }

    public void setMorning(double morning) {
        this.morning = morning;
    }

    public double getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(double afternoon) {
        this.afternoon = afternoon;
    }

    public MedicineType getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }
}

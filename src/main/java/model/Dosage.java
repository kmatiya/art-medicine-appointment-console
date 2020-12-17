package model;

import model.medicineType.MedicineType;

public class Dosage {
    private double morning;
    private double evening;
    private MedicineType medicineType;

    public double getMorning() {
        return morning;
    }

    public void setMorning(double morning) {
        this.morning = morning;
    }

    public double getEvening() {
        return evening;
    }

    public void setEvening(double evening) {
        this.evening = evening;
    }

    public MedicineType getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }
}

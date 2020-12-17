package api.regimen.medicine;

import api.regimen.dosage.Dosage;
import api.regimen.weight.WeightRange;

public class DosageAndWeight {
    private WeightRange weightRange;
    private Dosage dosage;

    public WeightRange getWeightRange() {
        return weightRange;
    }

    public void setWeightRange(WeightRange weightRange) {
        this.weightRange = weightRange;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }
}

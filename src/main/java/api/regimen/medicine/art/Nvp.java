package api.regimen.medicine.art;

import api.regimen.dosage.Dosage;
import api.regimen.medicine.DosageAndWeight;
import api.regimen.medicine.MedicineService;
import api.regimen.medicine.medicineType.MedicineType;
import api.regimen.weight.WeightRange;

import java.util.HashMap;
import java.util.List;

public class Nvp implements MedicineService {

    private  HashMap<String, List<DosageAndWeight>> medicineDosage;

    public Nvp()
    {
        medicineDosage = new HashMap<>();
        Dosage dosage = new Dosage();
        WeightRange weightRange = new WeightRange();
        dosage.setMorning(1);
        dosage.setAfternoon(1);
        dosage.setMedicineType(MedicineType.TABLET);
        weightRange.setMaxWeight(3.9);
        weightRange.setMinWeight(3);


    }

    @Override
    public HashMap<String,List<DosageAndWeight>> getDosageAndWeightRange() {
        return medicineDosage;
    }

    @Override
    public String getName() {
        return "NVP";
    }
}

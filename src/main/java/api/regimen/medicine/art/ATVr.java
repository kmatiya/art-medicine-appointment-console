package api.regimen.medicine.art;

import api.regimen.medicine.MedicineService;
import api.regimen.weight.WeightRangeMapper;
import api.util.DosageAndWeightMapper;
import model.DosageAndWeight;
import model.medicineType.MedicineType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ATVr implements MedicineService {

    private final HashMap<String, DosageAndWeight> medicineDosage;

    public ATVr()
    {
        medicineDosage = new HashMap<>();

        medicineDosage.put(WeightRangeMapper.LESS_THAN_THIRTY_FIVE, DosageAndWeightMapper.setDosageAndWeightOfMedicine(30,34.9,0,1,MedicineType.TABLET));
        medicineDosage.put(WeightRangeMapper.LESS_THAN_FORTY, DosageAndWeightMapper.setDosageAndWeightOfMedicine(35,39.9,0,1,MedicineType.TABLET));
        medicineDosage.put(WeightRangeMapper.ABOVE_FORTY, DosageAndWeightMapper.setDosageAndWeightOfMedicine(40,300,0,1,MedicineType.TABLET));
    }

    @Override
    public HashMap<String,DosageAndWeight> getDosageAndWeightRange() {
        return medicineDosage;
    }

    @Override
    public String getName() {
        return "ATV/r";
    }
}

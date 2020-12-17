package api.regimen.medicine.art;

import api.regimen.medicine.MedicineService;
import api.regimen.weight.WeightRangeMapper;
import api.util.DosageAndWeightMapper;
import metadata.MedicineNameMetaData;
import model.DosageAndWeight;
import model.medicineType.MedicineType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LPVrPellets implements MedicineService {

    private final HashMap<String, DosageAndWeight> medicineDosage;

    public LPVrPellets()
    {
        medicineDosage = new HashMap<>();

        medicineDosage.put(WeightRangeMapper.LESS_THAN_FOUR, DosageAndWeightMapper.setDosageAndWeightOfMedicine(3,3.9,2,2, MedicineType.PELLETS));
        medicineDosage.put(WeightRangeMapper.LESS_THAN_SIX, DosageAndWeightMapper.setDosageAndWeightOfMedicine(4,5.9,2,2,MedicineType.PELLETS));
        medicineDosage.put(WeightRangeMapper.LESS_THAN_TEN, DosageAndWeightMapper.setDosageAndWeightOfMedicine(6,9.9,3,3,MedicineType.PELLETS));
        medicineDosage.put(WeightRangeMapper.LESS_THAN_FOURTEEN, DosageAndWeightMapper.setDosageAndWeightOfMedicine(10,13.9,4,4,MedicineType.PELLETS));
        medicineDosage.put(WeightRangeMapper.LESS_THAN_TWENTY, DosageAndWeightMapper.setDosageAndWeightOfMedicine(14,19.9,5,5,MedicineType.PELLETS));
        medicineDosage.put(WeightRangeMapper.LESS_THAN_TWENTY_FIVE, DosageAndWeightMapper.setDosageAndWeightOfMedicine(20,24.9,6,6,MedicineType.PELLETS));
    }

    @Override
    public HashMap<String,DosageAndWeight> getDosageAndWeightRange() {
        return medicineDosage;
    }

    @Override
    public String getName() {
        return MedicineNameMetaData.LPV_r_PELLETS_IN_CAPS;
    }
}

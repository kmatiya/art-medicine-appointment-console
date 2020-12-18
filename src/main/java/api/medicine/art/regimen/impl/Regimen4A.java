package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.ABC3TC;
import api.medicine.art.medication.AZT3TC;
import api.medicine.art.medication.EFV;
import api.medicine.art.medication.NVP;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen4A implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen4A(){
        AZT3TC azt3TC = new AZT3TC();
        medicineServices.add(azt3TC);
        EFV efv = new EFV();
        medicineServices.add(efv);
    }
    @Override
    public String getName() {
        return RegimenNameMetaData.REGIMEN_4A;
    }

    @Override
    public ArrayList<MedicineService> getRegimenDrugCombination() {
        return medicineServices;
    }
}

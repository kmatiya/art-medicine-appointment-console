package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.ABC3TC;
import api.medicine.art.medication.LPVr;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen9A implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen9A(){

        ABC3TC abc3TC = new ABC3TC();
        medicineServices.add(abc3TC);
        LPVr lpVr = new LPVr();
        medicineServices.add(lpVr);
    }
    @Override
    public String getName() {
        return RegimenNameMetaData.REGIMEN_9A;
    }

    @Override
    public ArrayList<MedicineService> getRegimenDrugCombination() {
        return medicineServices;
    }
}

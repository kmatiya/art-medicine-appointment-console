package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.AZT3TC;
import api.medicine.art.medication.LPVr;
import api.medicine.art.medication.TDF3TC;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen11P implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen11P(){

        AZT3TC azt3TC = new AZT3TC();
        medicineServices.add(azt3TC);
        LPVr lpVr = new LPVr();
        medicineServices.add(lpVr);
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

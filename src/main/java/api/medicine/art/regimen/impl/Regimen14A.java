package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.AZT3TC;
import api.medicine.art.medication.DTG;
import api.medicine.art.medication.TDF3TCDTG;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen14A implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen14A(){

        AZT3TC azt3TC = new AZT3TC();
        medicineServices.add(azt3TC);
        DTG dtg = new DTG();
        medicineServices.add(dtg);
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

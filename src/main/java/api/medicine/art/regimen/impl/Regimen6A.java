package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.NVP;
import api.medicine.art.medication.TDF3TC;
import api.medicine.art.medication.TDF3TCEFV;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen6A implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen6A(){

        TDF3TC tdf3TC = new TDF3TC();
        medicineServices.add(tdf3TC);
        NVP nvp = new NVP();
        medicineServices.add(nvp);
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

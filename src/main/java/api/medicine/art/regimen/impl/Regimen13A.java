package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.DRV;
import api.medicine.art.medication.DTG;
import api.medicine.art.medication.R;
import api.medicine.art.medication.TDF3TCDTG;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen13A implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen13A(){

        TDF3TCDTG tdf3TCDTG = new TDF3TCDTG();
        medicineServices.add(tdf3TCDTG);
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

package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.AZT3TC;
import api.medicine.art.medication.DRV;
import api.medicine.art.medication.DTG;
import api.medicine.art.medication.LPVr;
import api.medicine.art.medication.R;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen12A implements RegimenService {

    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen12A(){

        DRV drv = new DRV();
        medicineServices.add(drv);
        R r = new R();
        medicineServices.add(r);
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

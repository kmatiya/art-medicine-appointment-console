package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.AZT3TCNVP;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;

import java.util.ArrayList;

public class Regimen2P implements RegimenService {

    private final AZT3TCNVP azt3TCNVP = new AZT3TCNVP();
    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen2P(){
        medicineServices.add(azt3TCNVP);
    }
    @Override
    public String getName() {
        return RegimenNameMetaData.REGIMEN_2P;
    }

    @Override
    public ArrayList<MedicineService> getRegimenDrugCombination() {
        return medicineServices;
    }
}

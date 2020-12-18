package api.medicine.art.regimen.impl;

import api.medicine.MedicineService;
import api.medicine.art.medication.ABC3TC;
import api.medicine.art.medication.NVP;
import api.medicine.art.regimen.RegimenService;
import metadata.RegimenNameMetaData;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

public class Regimen0P implements RegimenService {

    private final ABC3TC abc3TC = new ABC3TC();
    private final NVP nvp = new NVP();
    private final ArrayList<MedicineService> medicineServices = new ArrayList<>();

    public Regimen0P(){
        medicineServices.add(abc3TC);
        medicineServices.add(nvp);
    }

    @Override
    public String getName() {
        return RegimenNameMetaData.REGIMEN_0P;
    }

    @Override
    public ArrayList<MedicineService> getRegimenDrugCombination() {

        return medicineServices;
    }
}

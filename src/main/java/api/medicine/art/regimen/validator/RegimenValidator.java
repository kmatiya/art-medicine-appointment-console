package api.medicine.art.regimen.validator;

import api.medicine.MedicineService;
import api.medicine.art.regimen.RegimenService;

import java.util.ArrayList;

public interface RegimenValidator {
    boolean isRegimenNameValid(String regimen);
    boolean isWeightValid(double weight, ArrayList<MedicineService> drugCombination);
}

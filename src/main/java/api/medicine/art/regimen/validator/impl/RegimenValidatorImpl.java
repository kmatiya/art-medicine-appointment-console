package api.medicine.art.regimen.validator.impl;

import api.medicine.MedicineService;
import api.medicine.art.regimen.validator.RegimenValidator;

import java.util.ArrayList;

public class RegimenValidatorImpl implements RegimenValidator {

    @Override
    public boolean isRegimenNameValid(String regimen) {
        return false;
    }

    @Override
    public boolean isWeightValid(double weight, ArrayList<MedicineService> drugCombination) {
        return false;
    }
}

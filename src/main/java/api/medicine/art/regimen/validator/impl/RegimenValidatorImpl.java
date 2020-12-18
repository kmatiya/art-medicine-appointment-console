package api.medicine.art.regimen.validator.impl;

import api.medicine.art.regimen.validator.RegimenValidator;

public class RegimenValidatorImpl implements RegimenValidator {

    @Override
    public boolean isRegimenNameValid(String regimen) {
        return false;
    }

    @Override
    public boolean isWeightValid(double weight) {
        return false;
    }
}

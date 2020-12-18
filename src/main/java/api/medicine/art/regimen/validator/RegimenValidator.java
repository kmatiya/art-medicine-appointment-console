package api.medicine.art.regimen.validator;

import api.medicine.art.regimen.RegimenService;

public interface RegimenValidator {
    boolean isRegimenNameValid(String regimen);
    boolean isWeightValid(double weight);
}

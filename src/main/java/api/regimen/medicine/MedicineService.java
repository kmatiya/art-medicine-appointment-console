package api.regimen.medicine;

import model.DosageAndWeight;

import java.util.HashMap;
import java.util.List;

public interface MedicineService {
    HashMap<String,DosageAndWeight> getDosageAndWeightRange();
    String getName();
}

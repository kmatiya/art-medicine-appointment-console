package api.regimen.medicine;

import java.util.HashMap;
import java.util.List;

public interface MedicineService {
    HashMap<String,List<DosageAndWeight>> getDosageAndWeightRange();
    String getName();
}

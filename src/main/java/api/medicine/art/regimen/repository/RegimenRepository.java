package api.medicine.art.regimen.repository;

import model.Regimen;
import java.util.List;

public interface RegimenRepository {
    List<Regimen> getAllRegimens();
    Regimen getRegimen(String regimen);
}

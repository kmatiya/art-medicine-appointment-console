package api.appointment;

import api.medicine.MedicineService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public interface AppointmentCalculationService {
    List<Calendar> calculateNextAppointmentDate(Calendar calendar, int numberOfDrugs, String weightRange, ArrayList<MedicineService> getRegimenDrugCombinations);
}

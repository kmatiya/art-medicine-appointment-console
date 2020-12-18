package api.appointment.impl;

import api.appointment.AppointmentCalculationService;
import api.medicine.MedicineService;
import model.Dosage;
import model.DosageAndWeight;
import model.MedicineEndDate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AppointmentCalculationServiceImpl implements AppointmentCalculationService {
    public static final int MINIMUM_DAYS = 30;
    public static final int DIVIDER_MULTIPLIER = 2;
    @Override
    public List<MedicineEndDate> calculateNextAppointmentDate(Calendar calendar, int numberOfDrugs, String weightRange, ArrayList<MedicineService> getRegimenDrugCombinations) {
        for (MedicineService eachMedicine:getRegimenDrugCombinations) {
            int divider = numberOfDrugs / MINIMUM_DAYS;
            int daysToNextAppointment = numberOfDrugs - (divider * DIVIDER_MULTIPLIER);
            boolean checkIfCombinationExist = eachMedicine.getDosageAndWeightRange().containsKey(weightRange);
            if(!checkIfCombinationExist) {
                return null;
            }
            Dosage getDosage = eachMedicine.getDosageAndWeightRange().get(weightRange).getDosage();

            calendar.add(Calendar.DAY_OF_MONTH,daysToNextAppointment);

        }
        return null;
    }
}

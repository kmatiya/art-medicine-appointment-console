package api.appointment.impl;

import api.appointment.AppointmentCalculationService;
import api.medicine.MedicineService;
import model.Dosage;
import model.MedicineEndDate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AppointmentCalculationServiceImpl implements AppointmentCalculationService {
    @Override
    public List<MedicineEndDate> calculateNextAppointmentDate(Calendar calendar, int numberOfDrugs, String weightRange, ArrayList<MedicineService> getRegimenDrugCombinations) {
        List<MedicineEndDate> medicineEndDateList = new ArrayList<>();
        for (MedicineService eachMedicine:getRegimenDrugCombinations) {
            boolean checkIfCombinationExist = eachMedicine.getDosageAndWeightRange().containsKey(weightRange);
            if(!checkIfCombinationExist) {
                return null;
            }
            Dosage getDosage = eachMedicine.getDosageAndWeightRange().get(weightRange).getDosage();
            double sumOfDosage = getDosage.getEvening() + getDosage.getMorning();
            double daysToNextAppointment = numberOfDrugs / sumOfDosage;
            calendar.add(Calendar.DAY_OF_MONTH, (int) daysToNextAppointment);
            MedicineEndDate medicineEndDate = new MedicineEndDate();
            medicineEndDate.setMedicineName(eachMedicine.getName());
            medicineEndDate.setCalendar(calendar);
            medicineEndDateList.add(medicineEndDate);
        }
        return medicineEndDateList;
    }
}

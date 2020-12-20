package api.appointment.impl;

import api.appointment.AppointmentCalculationService;
import api.medicine.MedicineService;
import model.Dosage;
import model.MedicineEndDate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AppointmentCalculationServiceImpl implements AppointmentCalculationService {
    @Override
    public MedicineEndDate calculateNextAppointmentDate(Calendar calendar, int numberOfDrugs, String weightRange, MedicineService getRegimenDrugCombination) {

            boolean checkIfCombinationExist = getRegimenDrugCombination.getDosageAndWeightRange().containsKey(weightRange);
            if(!checkIfCombinationExist) {
                return null;
            }
            Dosage getDosage = getRegimenDrugCombination.getDosageAndWeightRange().get(weightRange).getDosage();
            double sumOfDosage = getDosage.getEvening() + getDosage.getMorning();
            double daysToNextAppointment = numberOfDrugs / sumOfDosage;
            calendar.add(Calendar.DAY_OF_MONTH, (int) daysToNextAppointment);
            MedicineEndDate medicineEndDate = new MedicineEndDate();
            medicineEndDate.setMedicineName(getRegimenDrugCombination.getName());
            Date appointmentDate = calendar.getTime();
            medicineEndDate.setAppointmentDate(appointmentDate);
        return medicineEndDate;
    }
}

import api.appointment.AppointmentCalculationService;
import api.appointment.impl.AppointmentCalculationServiceImpl;
import api.medicine.MedicineService;
import api.medicine.art.regimen.RegimenFactoryService;
import api.medicine.art.regimen.RegimenService;
import api.medicine.art.regimen.impl.RegimenFactoryImplementation;
import api.medicine.art.regimen.validator.RegimenValidator;
import api.medicine.art.regimen.validator.impl.RegimenValidatorImpl;
import metadata.RegimenNameMetaData;
import model.MedicineEndDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Regimen App Console");
        String regimen13A = RegimenNameMetaData.REGIMEN_0A;
        RegimenFactoryService regimenFactoryService = new RegimenFactoryImplementation();
        RegimenService regimenService = regimenFactoryService.getRegimen(regimen13A);
        RegimenValidator regimenValidator = new RegimenValidatorImpl();
        if(!regimenValidator.isRegimenNameValid(regimen13A)){
            System.out.println("Regimen is invalid.");
        }
        System.out.println("Regimen "+regimen13A+" is valid.");
        String weightRange = regimenValidator.isWeightValid(37, regimenService.getRegimenDrugCombination());
        if(weightRange == null){
            System.out.println("Weight is not valid.");
        }
        System.out.println("Weight is valid.");
        System.out.println("Drugs under regimen");
        for (MedicineService medicine: regimenService.getRegimenDrugCombination()) {

            System.out.println(medicine.getName());

        }
        AppointmentCalculationService appointmentCalculationService = new AppointmentCalculationServiceImpl();
        Calendar calendar=Calendar.getInstance();
        Date getDate = new Date();
        calendar.setTime(getDate);
        List<MedicineEndDate> medicineEndDateList =appointmentCalculationService.calculateNextAppointmentDate(calendar,30,weightRange,regimenService.getRegimenDrugCombination());
        for (MedicineEndDate eachMedicineEndDate: medicineEndDateList) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dateFormatted = dateFormat.format(eachMedicineEndDate.getAppointmentDate());
            System.out.println("Start date is "+getDate);
            System.out.println("Appointment date for "+eachMedicineEndDate.getMedicineName()+" is "+dateFormatted);
        }
    }
}
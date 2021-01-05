import api.appointment.AppointmentCalculationService;
import api.appointment.impl.AppointmentCalculationServiceImpl;
import api.medicine.MedicineService;
import api.medicine.art.regimen.RegimenFactoryService;
import api.medicine.art.regimen.RegimenService;
import api.medicine.art.regimen.impl.RegimenFactoryImplementation;
import api.medicine.art.regimen.repository.RegimenRepository;
import api.medicine.art.regimen.repository.impl.RegimenRepositoryImpl;
import api.medicine.art.regimen.validator.RegimenValidator;
import api.medicine.art.regimen.validator.impl.RegimenValidatorImpl;
import model.MedicineEndDate;
import model.Regimen;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Regimen App Console");
        RegimenRepository regimenRepository = new RegimenRepositoryImpl();
        List<Regimen> allRegimens = regimenRepository.getAllRegimens();
        for (Regimen eachRegimen : allRegimens){
            System.out.println(eachRegimen.getKey()+ "."+ eachRegimen.getName());
        }
        System.out.println("Please select regimen.");
        int regimenSelected =scanner.nextInt();
        Regimen getSelectedRegimen = allRegimens.get(regimenSelected);
        RegimenFactoryService regimenFactoryService = new RegimenFactoryImplementation();
        RegimenService regimenService = regimenFactoryService.getRegimen(getSelectedRegimen.getName());
        RegimenValidator regimenValidator = new RegimenValidatorImpl();
        if(!regimenValidator.isRegimenNameValid(getSelectedRegimen.getName())){
            System.out.println("Regimen is invalid.");
        }
        System.out.println("Regimen "+getSelectedRegimen.getName()+" is valid.");
        System.out.println("Medicine under regimen");
        Integer option = null;
        int count=0;
        if(regimenService.getRegimenDrugCombination().size() > 1){
            for (MedicineService medicineService: regimenService.getRegimenDrugCombination()) {
                System.out.println(count+". "+medicineService.getName());
                count++;
            }
        }
        int medicineSelected =scanner.nextInt();
        MedicineService medicineService = regimenService.getRegimenDrugCombination().get(medicineSelected);
        System.out.println("Please provide weight.");
        int weight =scanner.nextInt();
        String weightRange = regimenValidator.isWeightValid(weight, regimenService.getRegimenDrugCombination());
        if(weightRange == null){
            System.out.println("Weight is not valid.");
        }
        System.out.println("Weight is valid.");
        System.out.println("Drugs under regimen");
        List<MedicineService> medicineServiceList = regimenService.getRegimenDrugCombination();
        AppointmentCalculationService appointmentCalculationService = new AppointmentCalculationServiceImpl();
        Calendar calendar=Calendar.getInstance();
        Date getDate = new Date();
        calendar.setTime(getDate);
        MedicineEndDate medicineEndDate = appointmentCalculationService.calculateNextAppointmentDate(calendar,12,weightRange,medicineService);
        if(medicineEndDate != null){
            System.out.println(medicineEndDate.getMedicineName());
            System.out.println("Next appointment date for "+ medicineService.getName()+ " is "+ medicineEndDate.getAppointmentDate() +
                    " and number of drugs is "+medicineEndDate.getNumberOfDrugs());
        }
        else {
            System.out.println("Could not calculate regimen, regimen combination does not exist.");
        }
    }
}
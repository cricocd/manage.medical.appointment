package tasks;

import model.HospitalAdministrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.HospitalHomeSection;
import java.util.List;

public class EnterHomeMenu implements Task {

    private HospitalHomeSection hospitalHomeSection;
    private List<HospitalAdministrationData> hospitalData;
    private String menu;

    public EnterHomeMenu(String menu) {
        this.menu = menu;
    }

    public static OpenHospitalPage andSelectOption(String addDoctor) {
        return Tasks.instrumented(OpenHospitalPage.class, addDoctor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(menu.equals(hospitalData.get(0).getMenu())){
            actor.wasAbleTo(Click.on(HospitalHomeSection.ADD_DOCTOR_BUTTOM));
        }else if(menu.equals(hospitalData.get(0).getMenu())){
            actor.wasAbleTo(Click.on(HospitalHomeSection.ADD_PATIENT_BUTTOM));
        }else if(menu.equals(hospitalData.get(0).getMenu())){
            actor.wasAbleTo(Click.on(HospitalHomeSection.SCHEDULE_APPOINTMENT_BUTTOM));
        }
    }
}

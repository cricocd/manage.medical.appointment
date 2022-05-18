package tasks;

import model.HospitalAdministrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.HospitalHomeSection;
import java.util.List;
import static userinterface.AddDoctorSection.*;
import static userinterface.HospitalHomeSection.ADD_DOCTOR_BUTTOM;

public class AddDoctor implements Task {

    private List<HospitalAdministrationData> hospitalData;
    private HospitalHomeSection hospitalHomeSection;

    public AddDoctor(List<HospitalAdministrationData> hospitalData) {
        this.hospitalData = hospitalData;
    }

    public static AddDoctor withThe(List<HospitalAdministrationData> information) {
        return Tasks.instrumented(AddDoctor.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_DOCTOR_BUTTOM),
                Enter.theValue(hospitalData.get(0).getFullName()).into(FULLNAME_INPUT),
                Enter.theValue(hospitalData.get(0).getLastName()).into(LASTNAME_INPUT),
                Enter.theValue(hospitalData.get(0).getTelephone()).into(TELEPHONE_INPUT),
                Click.on(IDENTIFICATION_TYPE_SELECT),
                SelectFromOptions.byVisibleText(hospitalData.get(0).getIdentificationType()).from(IDENTIFICATION_TYPE_SELECT),
                Enter.theValue(hospitalData.get(0).getDoctorIdentificationId()).into(DOCTOR_IDENTIFICATION_INPUT),
                Click.on(SAVE_BUTTOM)
                );
    }


};

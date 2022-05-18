package tasks;

import model.HospitalAdministrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;
import static userinterface.AddPatientSection.*;
import static userinterface.HospitalHomeSection.ADD_PATIENT_BUTTOM;

public class AddPatient implements Task {

    private List<HospitalAdministrationData> hospitalData;

    public AddPatient(List<HospitalAdministrationData> information){
        this.hospitalData = information;
    }

    public static AddPatient withThe(List<HospitalAdministrationData> information) {
        return Tasks.instrumented(AddPatient.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_PATIENT_BUTTOM),
                Enter.theValue(hospitalData.get(0).getFullName()).into(FULLNAME_INPUT),
                Enter.theValue(hospitalData.get(0).getLastName()).into(LASTNAME_INPUT),
                Enter.theValue(hospitalData.get(0).getTelephone()).into(TELEPHONE_INPUT),
                Click.on(IDENTIFICATION_TYPE_SELECT),
                SelectFromOptions.byVisibleText(hospitalData.get(0).getIdentificationType()).from(IDENTIFICATION_TYPE_SELECT),
                Enter.theValue(hospitalData.get(0).getPatientIdentificationId()).into(PATIENT_IDENTIFICATION_INPUT),
                Click.on(PREPAID_CHECKBOX),
                Click.on(SAVE_BUTTOM)
                );
    }
}

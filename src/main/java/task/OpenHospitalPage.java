package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.HospitalHomeSection;

public class OpenHospitalPage implements Task {

    private HospitalHomeSection hospitalHomeSection;

    public static OpenHospitalPage andEnter() {
        return Tasks.instrumented(OpenHospitalPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(hospitalHomeSection)
        );
    }
}

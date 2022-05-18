package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterface.HospitalHomeSection;
import static net.serenitybdd.screenplay.actions.Open.browserOn;

public class OpenHospitalPage implements Task {

    private HospitalHomeSection hospitalHomeSection;

    public static OpenHospitalPage andEnter() {
        return Tasks.instrumented(OpenHospitalPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                browserOn(hospitalHomeSection)
        );
    }
}

package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.HospitalAdministrationData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.OperationCompleted;
import tasks.*;

import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ManageMedicalAppointmentStepDefinitions {


    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }


    @Given("^the user enters in the hospital administration system$")
    public void theUserEntersInTheHospitalAdministrationSystem() {
        theActorCalled("Dylan").wasAbleTo(OpenHospitalPage.andEnter());
    }

    @Given("^Dylan needs (.*)$")
    public void dylanNeedsAddsANewDoctor(String menu) {
        theActorInTheSpotlight().wasAbleTo(EnterHomeMenu.andSelectOption(menu));
    }

    @When("^he add the doctor in the hospital administration system$")
    public void heAddTheDoctorInTheHospitalAdministrationSystem(List<HospitalAdministrationData> information) {
        theActorInTheSpotlight().attemptsTo(AddDoctor.withThe(information));
    }


    @When("^he add the patient in the hospital administration system$")
    public void heAddThePatientInTheHospitalAdministrationSystem(List<HospitalAdministrationData> information) {
        theActorInTheSpotlight().attemptsTo(AddPatient.withThe(information));

    }

    @When("^he make the appointment scheduling in the hospital administration system$")
    public void heMakeTheAppointmentSchedulingInTheHospitalAdministrationSystem(List<HospitalAdministrationData> information) {
        theActorInTheSpotlight().attemptsTo(ScheduleAppointment.withThe(information));
    }

    @Then("^he looks in the screen for the message of (.*)$")
    public void heLooksInTheScreenForTheMessageOfDatosGuardadosCorrectamente(String successfulResult) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(OperationCompleted.isEqualToThe(successfulResult)));
    }

}

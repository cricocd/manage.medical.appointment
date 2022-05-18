package task;

import model.HospitalAdministrationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.AppointmentSchedulingSection;
import userinterface.HospitalHomeSection;
import java.util.List;

public class ScheduleAppointment implements Task {

    private List<HospitalAdministrationData> hospitalData;

    public ScheduleAppointment(List<HospitalAdministrationData> information){
        this.hospitalData = information;
    }

    public static ScheduleAppointment withThe(List<HospitalAdministrationData> information) {
        return Tasks.instrumented(ScheduleAppointment.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HospitalHomeSection.SCHEDULE_APPOINTMENT_BUTTOM),
                Click.on(AppointmentSchedulingSection.DATEPICKER_INPUT),
                Click.on(AppointmentSchedulingSection.NEXT_BUTTOM),
                Click.on(AppointmentSchedulingSection.DAY_MONTH_BUTTOM),
                Enter.theValue(hospitalData.get(0).getPatientIdentificationId()).into(AppointmentSchedulingSection.PATIENT_IDENTIFICATION_INPUT),
                Enter.theValue(hospitalData.get(0).getDoctorIdentificationId()).into(AppointmentSchedulingSection.DOCTOR_IDENTIFICATION_INPUT),
                Enter.theValue(hospitalData.get(0).getObservation()).into(AppointmentSchedulingSection.OBSERVATION_TEXT),
                Click.on(AppointmentSchedulingSection.SAVE_BUTTOM)
                );
    }
}

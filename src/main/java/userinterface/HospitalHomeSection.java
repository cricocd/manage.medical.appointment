package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/home")

public class HospitalHomeSection extends PageObject {

    public static final Target ADD_DOCTOR_BUTTOM = Target.the("where we can add a new doctor").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[1]"));
    public static final Target ADD_PATIENT_BUTTOM = Target.the("where we can add a new doctor").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[2]"));
    public static final Target SCHEDULE_APPOINTMENT_BUTTOM = Target.the("where we can schedule a new appointment").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[2]/div/div/div/div/div[1]/div/a[6]"));
    public static final Target SUCCESS_RESULT_TEXT = Target.the("where we can check the successful result").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
}

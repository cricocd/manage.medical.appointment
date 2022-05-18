package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/addPatient")

public class AppointmentSchedulingSection extends PageObject {

    public static final Target DATEPICKER_INPUT = Target.the("where we can open the datepicker").located(
            By.xpath("//input[@id=\"datepicker\"]")
    );
    public static final Target NEXT_BUTTOM = Target.the("where we can change the month of the datepicker").located(
            By.xpath("//div[@id=\"ui-datepicker-div\"]/div/a[2]/span")
    );
    public static final Target DAY_MONTH_BUTTOM = Target.the("where we can select a day of datepicker").located(
            By.xpath("//div[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")
    );
    public static final Target PATIENT_IDENTIFICATION_INPUT = Target.the("where we can write the patient identification ").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")
    );
    public static final Target DOCTOR_IDENTIFICATION_INPUT = Target.the("where we can write the doctor identification").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")
    );
    public static final Target OBSERVATION_TEXT = Target.the("where we can write the observations").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea")
    );
    public static final Target SAVE_BUTTOM = Target.the("where we can save the information").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/a")
    );
}

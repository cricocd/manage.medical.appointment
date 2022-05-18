package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/addPatient")

public class AddPatientSection extends PageObject {

    public static final Target FULLNAME_INPUT = Target.the("where we can write the fullname").located(
            By.name("name")
    );
    public static final Target LASTNAME_INPUT = Target.the("where we can write the lastname").located(
            By.name("last_name")
    );
    public static final Target TELEPHONE_INPUT = Target.the("where we can write the telephone").located(
            By.name("telephone")
    );
    public static final Target IDENTIFICATION_TYPE_SELECT = Target.the("where we can select the identification type").located(
            By.name("identification_type")
    );
    public static final Target PATIENT_IDENTIFICATION_INPUT = Target.the("where we can write the patient identification").located(
            By.name("identification")
    );
    public static final Target PREPAID_CHECKBOX = Target.the("where we can check the prepaid health").located(
            By.name("prepaid")
    );
    public static final Target SAVE_BUTTOM = Target.the("where we can save the information").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/a")
    );
}

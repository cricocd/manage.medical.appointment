package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/addDoctor")

public class AddDoctorSection extends PageObject {

    public static final Target FULLNAME_INPUT = Target.the("where we can write the fullname").located(
            By.id("name")
    );
    public static final Target LASTNAME_INPUT = Target.the("where we can write the lastname").located(
            By.id("last_name")
    );
    public static final Target TELEPHONE_INPUT = Target.the("where we can write the telephone").located(
            By.id("telephone")
    );
    public static final Target IDENTIFICATION_TYPE_SELECT = Target.the("where we can select the identification type").located(
            By.id("identification_type")
    );
    public static final Target DOCTOR_IDENTIFICATION_INPUT = Target.the("where we can write the doctor identification").located(
            By.xpath("//input[@id=\"identification\"]")
    );
    public static final Target SAVE_BUTTOM = Target.the("where we can save the information").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/a")
    );
}



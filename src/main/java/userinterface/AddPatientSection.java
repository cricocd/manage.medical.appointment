package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/addPatient")

public class AddPatientSection extends PageObject {

    public static final Target FULLNAME_INPUT = Target.the("where we can write the fullname").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[1]/input")
    );
    public static final Target LASTNAME_INPUT = Target.the("where we can write the lastname").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")
    );
    public static final Target TELEPHONE_INPUT = Target.the("where we can write the telephone").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")
    );
    public static final Target IDENTIFICATION_TYPE_SELECT = Target.the("where we can select the identification type").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select[1]")
    );
    public static final Target PATIENT_IDENTIFICATION_INPUT = Target.the("where we can write the patient identification").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[5]/input")
    );
    public static final Target PREPAID_CHECKBOX = Target.the("where we can check the prepaid health").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/div[6]/label/input")
    );
    public static final Target SAVE_BUTTOM = Target.the("where we can save the information").located(
            By.xpath("//div[@id=\"page-wrapper\"]/div/div[3]/div/a")
    );
}

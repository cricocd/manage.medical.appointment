package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterface.HospitalHomeSection.SUCCESS_RESULT_TEXT;

public class OperationCompleted implements Question<Boolean> {

    private String successfulResult;

    public OperationCompleted(String successfulResult) {
        this.successfulResult = successfulResult;
    }

    public static OperationCompleted isEqualToThe(String question) {
        return new OperationCompleted(question);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String addDoctorResult = Text.of(SUCCESS_RESULT_TEXT).viewedBy(actor).asString();
        if(successfulResult.equals(addDoctorResult)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}

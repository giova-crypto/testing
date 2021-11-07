package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SignUp implements Task {
    public static SignUp theForm() {
       return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("marcus").into(UtestSignUpPage.FIRST_NAME),
                Enter.theValue("fletcher").into(UtestSignUpPage.LAST_NAME),
                Enter.theValue("marcusfletch@mail.co").into(UtestSignUpPage.EMAIL),
                SelectFromOptions.byVisibleText("1998").from(UtestSignUpPage.BIRTH_YEAR),
                SelectFromOptions.byVisibleText("June").from(UtestSignUpPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText("21").from(UtestSignUpPage.BIRTH_DAY),
                Click.on(UtestSignUpPage.BUTTON_GO_LOCATION)

        );
    }
}

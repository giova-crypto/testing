package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestHomePage utestHomePage;
    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(utestHomePage),Click.on(UtestHomePage.JOIN_BUTTON));


    }
}

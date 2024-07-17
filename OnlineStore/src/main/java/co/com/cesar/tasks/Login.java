package co.com.cesar.tasks;

import co.com.cesar.interactions.Swipe;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.cesar.userinterfaces.LoginPage.*;
import static co.com.cesar.utils.Constants.PASSWORD;
import static co.com.cesar.utils.Constants.USERNAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DENY_LOCATION, isVisible())
                        .forNoMoreThan(36)
                        .seconds(),
                Click.on(DENY_LOCATION),
                Click.on(CITY),
                Click.on(CITY_VALUE),
                Click.on(CONTINUE_BUTTON),

                WaitUntil.the(MODAL_IMAGE, isVisible())
                        .forNoMoreThan(30)
                        .seconds(),
                Swipe.horizontalTo(900, 950, 450),
                WaitUntil.the(LOGIN_OPTION, isVisible())
                        .forNoMoreThan(30)
                        .seconds(),
                Click.on(LOGIN_OPTION),
                Click.on(USERNAME_INPUT),
                Enter.theValue(USERNAME).into(USERNAME_INPUT),
                Click.on(PASSWORD_INPUT),
                Enter.theValue(PASSWORD).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }


    public static Login onThePage() {
        return Instrumented.instanceOf(Login.class).withProperties();
    }
}

package co.com.cesar.tasks;

import co.com.cesar.interactions.Swipe;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Point;

import static co.com.cesar.userinterfaces.MainPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ChooseMovie implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Point firstMovie = MOVIE_OPTION.of("1").resolveFor(actor).getLocation();
        Point lastMovie = MOVIE_OPTION.of("3").resolveFor(actor).getLocation();
        actor.attemptsTo(
                Swipe.horizontalTo(lastMovie.getX() + 300, firstMovie.getX(), firstMovie.getY() + 100),
                Swipe.horizontalTo(lastMovie.getX() + 300, firstMovie.getX(), firstMovie.getY() + 100),
                Swipe.horizontalTo(lastMovie.getX() + 300, firstMovie.getX(), firstMovie.getY() + 100),
                Swipe.horizontalTo(lastMovie.getX() + 300, firstMovie.getX(), firstMovie.getY() + 100),
                Click.on(MOVIE_OPTION.of("2")),
                Click.on(MOVIE_TIME.of("21:10 PM")),
                WaitUntil.the(LOADING_IMAGE, isNotVisible())
                        .forNoMoreThan(30)
                        .seconds(),
                Click.on(SEAT_FORMAT_QUANTITY),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(LOADING_IMAGE, isNotVisible())
                        .forNoMoreThan(30)
                        .seconds(),
                Click.on(SEAT_OPTION.of("33")),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(LOADING_IMAGE, isNotVisible())
                        .forNoMoreThan(60)
                        .seconds(),
                Click.on(COMBO_FOOD),
                Click.on(CONTINUE_BUTTON),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(LOADING_IMAGE, isNotVisible())
                        .forNoMoreThan(60)
                        .seconds(),
                Click.on(CITY_INPUT),
                Enter.theValue("NEIRA").into(CITY_INPUT_EDIT),
                Click.on(DOCUMENT_INPUT),
                Click.on(CITY_INPUT2)
                );

    }

    public static ChooseMovie using() {
        return Instrumented.instanceOf(ChooseMovie.class).withProperties();
    }
}

package co.com.cesar.tasks;

import co.com.cesar.models.CreditCard;
import co.com.cesar.utils.Constants;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.cesar.userinterfaces.MainPage.*;
import static co.com.cesar.userinterfaces.PaymentPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class DoPayment implements Task {

    private CreditCard creditCard;

    public DoPayment(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Constants.waitFor(5);
        actor.attemptsTo(
                Click.on(TERMS_AND_CONDITIONS),
                Click.on(CONTINUE_BUTTON),
                Click.on(CREDIT_CARD_OPTION),

                Click.on(CREDIT_CARD_OWNER_NAME),
                Enter.theValue(creditCard.getName()).into(CREDIT_CARD_OWNER_NAME),

                Click.on(CREDIT_CARD_NUMBER),
                Enter.theValue(creditCard.getNumber()).into(CREDIT_CARD_NUMBER),

                Click.on(CREDIT_CARD_EXPIRATION_DATE),
                Enter.theValue(creditCard.getExpirationDate()).into(CREDIT_CARD_EXPIRATION_DATE),

                Click.on(CREDIT_CARD_CVV),
                Enter.theValue(creditCard.getSecurityCode()).into(CREDIT_CARD_CVV),

                Click.on(PAY_BUTTON),

                WaitUntil.the(LOADING_IMAGE, isNotVisible())
                        .forNoMoreThan(120)
                        .seconds()
        );
    }

    public static DoPayment with(CreditCard creditCard) {
        return Instrumented.instanceOf(DoPayment.class).withProperties(creditCard);
    }
}

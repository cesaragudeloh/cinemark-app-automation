package co.com.cesar.stepdefinitions;


import co.com.cesar.data.CreditCardData;
import co.com.cesar.tasks.ChooseMovie;
import co.com.cesar.tasks.DoPayment;
import co.com.cesar.tasks.Login;
import co.com.cesar.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.cesar.userinterfaces.PurchaseSuccessfulPage.QR_CODE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class BuyTicketStep {


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user enters at the web site")
    public void theUserEntersAtTheWebSite()  {
        theActorCalled("César").wasAbleTo(
                Login.onThePage()
        );
    }

    @When("the user purchases a movie ticket")
    public void theUserPurchasesAMovieTicket() {
        theActorInTheSpotlight().attemptsTo(
                ChooseMovie.using(),
                DoPayment.with(CreditCardData.getTCVisa())
        );

    }

    @Then("the purchase is successful and the QR code is displayed")
    public void thePurchaseIsSuccessfulAndTheQRCodeIsDisplayed() throws InterruptedException {
        Constants.waitFor(5);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(QR_CODE).isDisplayed()
        );
    }

}

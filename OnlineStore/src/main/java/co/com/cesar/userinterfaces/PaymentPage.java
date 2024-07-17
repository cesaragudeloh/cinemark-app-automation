package co.com.cesar.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {

    public static final Target CREDIT_CARD_OPTION = Target.the("Credit Card Option").locatedBy("//android.view.View[@content-desc='Tarjeta crédito/débito']");
    public static final Target CREDIT_CARD_OWNER_NAME = Target.the("Credit Card Owner Name").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText[1]");
    public static final Target CREDIT_CARD_NUMBER = Target.the("Credit Card Number").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    public static final Target CREDIT_CARD_EXPIRATION_DATE = Target.the("Credit Card Expiration Date").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.widget.EditText[3]");
    public static final Target CREDIT_CARD_CVV = Target.the("Credit Card CVV").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[4]/android.widget.EditText[4]");
    public static final Target CREDIT_CARD_INSTALLMENTS_OPTION = Target.the("Credit Card Installments Value").locatedBy("//android.widget.Button[@content-desc='Numero de cuotas * 6']");
    public static final Target CREDIT_CARD_INSTALLMENTS_VALUE = Target.the("Credit Card Installments Value").locatedBy("Numero de cuotas *\\n1");

    public static final Target PAY_BUTTON = Target.the("Pay Button").located(AppiumBy.accessibilityId("PAGAR"));

    public PaymentPage(){
        throw new IllegalStateException("Utility class");
    }

}

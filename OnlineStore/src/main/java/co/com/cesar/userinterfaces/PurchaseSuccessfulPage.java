package co.com.cesar.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PurchaseSuccessfulPage {

    public static final Target QR_CODE = Target.the("QR Code").located(AppiumBy.accessibilityId("qr code"));

    public PurchaseSuccessfulPage(){
        throw new IllegalStateException("Utility class");
    }

}

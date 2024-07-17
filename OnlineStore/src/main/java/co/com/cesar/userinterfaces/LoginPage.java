package co.com.cesar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.AppiumBy;

public class LoginPage{



    public static final Target DENY_LOCATION = Target.the("Allow Location").located(AppiumBy.accessibilityId("CONTINUAR SIN LOCALIZACIÓN"));
    public static final Target CITY = Target.the("City").located(AppiumBy.accessibilityId("Ciudad *"));
    public static final Target CITY_VALUE = Target.the("City value").located(AppiumBy.accessibilityId("Bogota"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue Button").located(AppiumBy.accessibilityId("CONTINUAR"));
    public static final Target MODAL_IMAGE = Target.the("Modal window").locatedBy("//android.widget.ImageView");
    public static final Target LOGIN_OPTION = Target.the("Login Option").locatedBy("//android.widget.Button");
    public static final Target USERNAME_INPUT = Target.the("Username input").locatedBy("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    public static final Target PASSWORD_INPUT = Target.the("Password input").locatedBy("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    public static final Target LOGIN_BUTTON = Target.the("Login Button").located(AppiumBy.accessibilityId("INICIAR SESIÓN"));

    public LoginPage(){
        throw new IllegalStateException("Utility class");
    }

}

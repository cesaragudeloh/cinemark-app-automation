package co.com.cesar.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

    public static final Target MOVIE_OPTION = Target.the("Movie Option").locatedBy("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[8]/android.view.View/android.view.View[{0}]");
    public static final Target MOVIE_TIME = Target.the("Movie Time").locatedBy("//android.view.View[@content-desc='{0}']");
    public static final Target LOADING_IMAGE = Target.the("Loading Image").locatedBy("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public static final Target SEAT_FORMAT_QUANTITY = Target.the("Seat Format").locatedBy("//android.view.View[@content-desc=\"PK TTCONFI\n" +
            "Package con ticket y confiteria\n" +
            "$ 3.200\n" +
            "0\"]/android.widget.Button[2]");
    public static final Target CONTINUE_BUTTON = Target.the("Continue Button").located(AppiumBy.accessibilityId("CONTINUAR"));
    public static final Target SEAT_OPTION = Target.the("Seat Option").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View/android.view.View[{0}]");


    public static final Target COMBO_FOOD = Target.the("Combo Food").locatedBy("//android.view.View[@content-desc=\" combo tu y yo app ip\n" +
            "$ 47.900\n" +
            "1 Crispeta de 230 gr, 2 Gaseosa de 798 ml. \n" +
            "0\"]/android.view.View");
    public static final Target CITY_INPUT = Target.the("City Input").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText[4]");
    public static final Target CITY_INPUT_EDIT = Target.the("City Input for edit").locatedBy("//android.widget.ScrollView/android.widget.EditText[4]");
    public static final Target CITY_INPUT2 = Target.the("City Input").locatedBy("//android.widget.EditText[@text=\"NEIRA\"]");
    public static final Target CITY_VALUE = Target.the("City Value").locatedBy("//android.view.View[@content-desc=\"NEIRA, CALDAS\"]");
    public static final Target DOCUMENT_INPUT = Target.the("Document Input").locatedBy("//android.widget.EditText[@text='4687974511']");
    public static final Target TERMS_AND_CONDITIONS = Target.the("Terms and Conditions Check").locatedBy("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]");



    public MainPage() {
        throw new IllegalStateException("Utility class");
    }

}

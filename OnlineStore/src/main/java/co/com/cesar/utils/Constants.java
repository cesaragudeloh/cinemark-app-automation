package co.com.cesar.utils;

public class Constants {

    public static final String USERNAME = "automationtestbc@yopmail.com";
    public static final String PASSWORD = "Colombia2024#";


    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

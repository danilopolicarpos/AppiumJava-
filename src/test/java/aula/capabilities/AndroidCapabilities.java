package aula.capabilities;

        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.MobileElement;
        import io.appium.java_client.android.AndroidDriver;
        import java.net.MalformedURLException;
        import java.net.URL;

        import org.openqa.selenium.remote.DesiredCapabilities;



public class AndroidCapabilities {


    private static AppiumDriver<MobileElement> driver;

    public static AppiumDriver<MobileElement> createDriver() {

        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("automationName", "uiautomator2");
            desiredCapabilities.setCapability("deviceName", "emulador");
            desiredCapabilities.setCapability("avd", "oreo");
            desiredCapabilities.setCapability("fullReset", "true");
            desiredCapabilities.setCapability("app", "/Users/danilopolicarpo/dev/AppiumJava-/app-debug.apk");
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        }catch (MalformedURLException e){
            System.out.println( e.getMessage() );

        }

        return driver;
    }

    public static AppiumDriver<MobileElement> getDriver()  {
        if (driver == null){
            return createDriver();
        }
        return  driver;
    }


    public static void closeDriver(){
        driver.quit();
    }



}

import java.net.URL;
import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.MobileElement;
        import org.openqa.selenium.remote.DesiredCapabilities;

        import java.net.URL;

public class CalculatorTest {
    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        }catch(Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }


    public static void openCalculator() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "OnePlus 6");
        capabilities.setCapability("udid", "fe433725");
        capabilities.setCapability("platformVersion", "8.1.0");
        capabilities.setCapability("appPackage", "com.oneplus.calculator");
        capabilities.setCapability("appActivity", "com.oneplus.calculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,capabilities);

        System.out.println("application started");




    }
}

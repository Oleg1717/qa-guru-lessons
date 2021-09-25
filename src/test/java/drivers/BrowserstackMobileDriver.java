package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.ConfigHelper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    public static URL getBrowserstackUrl() {
        try {
            return new URL(ConfigHelper.bsConfig.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        // Set your access credentials
        desiredCapabilities.setCapability("browserstack.user", ConfigHelper.bsConfig.user());
        desiredCapabilities.setCapability("browserstack.key", ConfigHelper.bsConfig.key());

        // Set URL of the application under test
        desiredCapabilities.setCapability("app", ConfigHelper.bsConfig.app());

        // Specify device and os_version for testing
        desiredCapabilities.setCapability("device", ConfigHelper.deviceConfig.device());
        desiredCapabilities.setCapability("os_version", ConfigHelper.deviceConfig.osVersion());

        // Set other BrowserStack capabilities
        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "Java Android");
        desiredCapabilities.setCapability("name", "first_test");

        return new AndroidDriver<AndroidElement>(getBrowserstackUrl(), desiredCapabilities);
    }
}

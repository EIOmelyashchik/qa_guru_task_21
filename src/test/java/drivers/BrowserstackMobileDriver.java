package drivers;

import com.codeborne.selenide.WebDriverProvider;
import helpers.BrowserStackHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static config.ProjectData.browserStackConfig;

public class BrowserstackMobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("browserstack.user", "ekaterina_KhxCM7");
        desiredCapabilities.setCapability("browserstack.key", "8UzG1HMqvfpSD4BqcAZh");

        desiredCapabilities.setCapability("project", "qa_guru_21");
        desiredCapabilities.setCapability("build", "Android");
        desiredCapabilities.setCapability("name", "Wiki tests");
        desiredCapabilities.setCapability("autoGrantPermissions", "true");

        desiredCapabilities.setCapability("device", browserStackConfig.device());
        desiredCapabilities.setCapability("os_version", browserStackConfig.osVersion());
        desiredCapabilities.setCapability("app", browserStackConfig.app());

        return new AndroidDriver(BrowserStackHelper.getBrowserstackUrl(), desiredCapabilities);
    }
}

package np.qa.lesson13.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import np.qa.lesson13.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Boolean remoteState = Boolean.parseBoolean(
                System.getProperty("remoteState", "true"));

        if (remoteState.equals(true)) {
            String user = System.getProperty("user");
            String pass = System.getProperty("pass");
            String remoteUrl = System.getProperty("remoteUrl", "selenoid.autotests.cloud/wd/hub");
            Configuration.remote = "https://" + user + ":" + pass + "@" + remoteUrl;
            Configuration.browser = System.getProperty("browser");
            Configuration.browserVersion = System.getProperty("browserVersion");
        }

        Configuration.baseUrl = "https://ru.wikipedia.org";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }

}

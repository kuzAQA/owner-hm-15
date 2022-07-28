package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @BeforeAll
    static void setUp() {
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();

        if(config.getRemoteUrl() != null) {
            Configuration.remote = config.getRemoteUrl();
        }
    }

    @BeforeEach
    void openPage() {
        open(config.getBaseUrl());
    }

    @AfterEach
    void closeDriver() {
        Selenide.closeWebDriver();
    }
}

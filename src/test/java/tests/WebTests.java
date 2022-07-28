package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTests extends TestBase{
    @Test
    @Tag("web")
    void webConfigTest() {
        open("https://github.com");
        String actualTitle = title();
        String expectedTitle = "GitHub: Where the world builds software · GitHub";

        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}

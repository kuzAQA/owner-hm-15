package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTests {
    @Test
    @Tag(value = "api")
    void apiConfigTest() {
        System.getProperty("baseUrl", "api");
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.getBaseUrl()).isEqualTo("https://reqres.io");
        assertThat(config.getToken()).isEqualTo("h1HQB1091xAf123");
    }
}

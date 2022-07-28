package tests;

import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTests {
    @Test
    @Tag(value = "mobile")
    void androidTest() {
        System.setProperty("device", "xiaomi");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.getPlatformName()).isEqualTo("Android");
        assertThat(config.getPlatformVersion()).isEqualTo("27.0");
        assertThat(config.getDeviceName()).isEqualTo("Xiaomi Redmi Note 5");
    }

    @Test
    @Tag(value = "mobile")
    void iphone12Test() {
        System.setProperty("device", "iphone12");
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.getPlatformName()).isEqualTo("iOS");
        assertThat(config.getPlatformVersion()).isEqualTo("15.0");
        assertThat(config.getDeviceName()).isEqualTo("Apple iPhone 12 Pro");
    }
}

package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${device}.properties"
})
public interface MobileConfig extends Config{

    @Key("platform.name")
    String getPlatformName();

    @Key("platform.version")
    String getPlatformVersion();

    @Key("device.name")
    String getDeviceName();
}

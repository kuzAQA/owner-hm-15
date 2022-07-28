package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${env}.properties")
public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserVersion")
    @DefaultValue("103.0")
    String browserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")
    String getRemoteUrl();
}

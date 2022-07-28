package config;

import org.aeonbits.owner.Config;

@Config.Sources(value = {
        "classpath:api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("token")
    String getToken();
}

package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/Users/User/auth/api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("apiKey")
    String apiKey();

    @Key("apiHost")
    String apiHost();

}

package demowebshop.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/app.properties"})
public interface AppConfig extends Config {

    @Key("base.url")
    String baseUrl();

    @Key("api.base.url")
    String apiBaseUrl();

    @Key("login")
    String login();

    @Key("password")
    String password();
}

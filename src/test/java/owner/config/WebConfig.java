package owner.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/${driverType}.properties"})
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();
}

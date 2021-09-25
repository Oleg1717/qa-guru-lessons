package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    public static BrowserstackConfig bsConfig = ConfigFactory
            .create(BrowserstackConfig.class, System.getProperties());

    public static DeviceConfig deviceConfig = ConfigFactory
            .create(DeviceConfig.class, System.getProperties());
}

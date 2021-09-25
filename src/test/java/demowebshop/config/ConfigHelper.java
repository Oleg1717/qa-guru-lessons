package demowebshop.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {

    private static AppConfig getAppConfig() {
        return ConfigFactory.newInstance()
                .create(AppConfig.class, System.getProperties());
    }

    public static String getBaseUrl(){
        return getAppConfig().baseUrl();
    }

    public static String getLogin(){
        return getAppConfig().login();
    }

    public static String getPassword(){
        return getAppConfig().password();
    }

    public static String getApiBaseUrl(){
        return getAppConfig().apiBaseUrl();
    }
}

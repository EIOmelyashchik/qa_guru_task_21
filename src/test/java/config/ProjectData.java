package config;

import org.aeonbits.owner.ConfigFactory;

public class ProjectData {
    public static final BrowserStackConfig browserStackConfig =
            ConfigFactory.create(BrowserStackConfig.class, System.getProperties());
    public static final AppiumConfig appiumConfig =
            ConfigFactory.create(AppiumConfig.class, System.getProperties());
    public static final DeviceHostConfig deviceHostConfig =
            ConfigFactory.create(DeviceHostConfig.class, System.getProperties());

    public static DeviceHost deviceFarm() {
        return DeviceHost.valueOf(deviceHostConfig.deviceHost().toUpperCase());
    }
}

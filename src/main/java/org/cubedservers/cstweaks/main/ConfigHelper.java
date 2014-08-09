package org.cubedservers.cstweaks.main;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * Created by pixlepix on 8/9/14.
 */
public class ConfigHelper {

    public static String databaseIp;

    public static String user;

    public static String pass;
    Configuration configuration;

    private static final String CATEGORY_GENERAL = "GENERAL";

    public void preInitConfig(FMLPreInitializationEvent event){
        configuration = new Configuration(event.getSuggestedConfigurationFile());
        new ConfigCategory(CATEGORY_GENERAL);
        databaseIp = configuration.get(CATEGORY_GENERAL, "MongoDB ip", "iomgaming.org").getString();

        databaseIp = configuration.get(CATEGORY_GENERAL, "MongoDB user", "user").getString();

        databaseIp = configuration.get(CATEGORY_GENERAL, "MongoDB pass", "pass").getString();
    }

}

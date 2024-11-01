package com.main;

import com.logic.Configuration;
import com.logic.ConfigurationProxy;

public class Main {
    public static void main(String[] args) {
        // Usuario sin permisos de administrador
        Configuration userConfig = new ConfigurationProxy("user");
        userConfig.accessSettings();

        // Usuario con permisos de administrador
        Configuration adminConfig = new ConfigurationProxy("admin");
        adminConfig.accessSettings();
    }
}

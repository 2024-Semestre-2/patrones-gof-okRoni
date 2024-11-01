package com.logic;

public class ConfigurationProxy implements Configuration {
    private AdminConfiguration adminConfig;
    private String userRole;

    public ConfigurationProxy(String userRole) {
        this.userRole = userRole;
        this.adminConfig = new AdminConfiguration();
    }

    @Override
    public void accessSettings() {
        if ("admin".equals(userRole)) { // Verificamos si el usuario es administrador
            adminConfig.accessSettings();
        } else {
            System.out.println("Acceso denegado!!");
        }
    }
}


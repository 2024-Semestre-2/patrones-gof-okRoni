package com.logic;

public class AdminConfiguration implements Configuration {
    @Override
    public void accessSettings() {
        System.out.println("Acceso concedido!!");
    }
}

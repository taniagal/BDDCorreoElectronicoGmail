package com.sura.policycenter.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public final class Localizador {

    private static Config localizadorConfig = ConfigFactory.load("localizadores");

    private Localizador() {
    }

    public static String obtenerPropiedad(String clave) {
        return localizadorConfig.getString(clave);
    }
}

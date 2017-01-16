package com.sura.guidewire.policycenter.utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

    protected static final int CONSTANTE_10000000 = 10000000;
    protected static final int CONSTANTE_99999999 = 99999999;
    protected static final int CONSTANTE_900000000 = 900000000;
    protected static final int CONSTANTE_999999999 = 999999999;

    private Utils(){
    }

    public static String sumarDiasALaFechaActual(int dias) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return df.format(calendar.getTime());
    }

    /**
     * Crea numero de cedula
     *
     * @return numero de cedula de 8 digitos
     */
    public static String cedulaRandom() {
        int cedula = (int) Math.floor(Math.random() * (CONSTANTE_10000000 - CONSTANTE_99999999) + CONSTANTE_99999999);
        return Integer.toString(cedula);
    }

    /**
     * Crea un numero de nit
     *
     * @return numero de nit de 9 digitos
     */
    public static String nitRandom() {
        int nit = (int) Math.floor(Math.random() * (CONSTANTE_900000000 - CONSTANTE_999999999) + CONSTANTE_999999999);
        return Integer.toString(nit);
    }
}

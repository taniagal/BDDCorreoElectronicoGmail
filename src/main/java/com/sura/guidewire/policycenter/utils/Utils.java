package com.sura.guidewire.policycenter.utils;


import net.serenitybdd.core.pages.WebElementFacade;

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

    /**
     * Retorna un numero para hacer operaciones matematicas.
     * El formato que recibe este metodo es |$1.000.000.000,00 (COP)|
     * El formato que retorna para ser operado es |1000000000|.
     *
     * @param :  Elemento que contiene el texto del numero
     * @Return:  Numero (double) para hacer operaciones matematicas
     * */
    public static double convierteTextoEnNumero(WebElementFacade valorTextoParaConvertirANumero) {
        String[] cadenaSinCaracteres = valorTextoParaConvertirANumero.getText().split(",");
        return Double.parseDouble(cadenaSinCaracteres[0].substring(1).replaceAll("\\.", ""));
    }

    /**
     * Retorna un texto con caracteres de un label GW ($ y ,00 (COP).
     * El formato de numero que recibe este metodo es |1000000000|
     * El formato de texto que retorna este metodo es |$10.000.000,00 (COP)|.
     *
     * @param :  Numero (Tipo: double) que sera convertido
     * @Return:  Texto con caracteres especiales ($ y ,00 (COP))
     * */

    public static String convierteNumeroEnTexto(double numeroParaConvertirEnCadena) {
        java.text.NumberFormat nuevoFormato = java.text.NumberFormat.getInstance();
        String signoPesos = "$";
        String caracteresCompletarTexto = ",00 (COP)";
        String valorConFormatoNumero = nuevoFormato.format(numeroParaConvertirEnCadena);
        return signoPesos + valorConFormatoNumero + caracteresCompletarTexto;
    }

    public static String quitaCaracteresACadena(WebElementFacade texto) {
        String[] cadenaSinCaracteres = texto.getText().split("\\)");
        return cadenaSinCaracteres[0].replace("Ver póliza (N.° ","");
    }
}
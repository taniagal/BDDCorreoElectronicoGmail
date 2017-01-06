package com.sura.guidewire.policycenter.utils;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.LoggerFactory;

import java.util.*;

public final class GwNavegacionUtil {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    private GwNavegacionUtil(){
    }

    @SuppressWarnings("SameParameterValue")
    public static Boolean existenOpcionesPorMenuHastaSegundoNivel(WebDriver driver, Keys keyNav, String tipoElementoMenu, ExamplesTable opcionesPorMenu, Boolean darClick) {
        LOGGER.error("GuidewireUtil.existenOpcionesPorMenu");
        String menu = "";

        try {
            for (String menuPrimerNivel : obtenerNombreColumnasDeExamplesTable(opcionesPorMenu)) {

                menu = "MENU -> " + menuPrimerNivel;
                LOGGER.error(menu);
                WebElement elementoMenu = obtenerMenuPorTextoContenido(driver, menuPrimerNivel, tipoElementoMenu);
                elementoMenu.click();
                elementoMenu.sendKeys(keyNav);
                recorrerOpciones(driver, tipoElementoMenu, opcionesPorMenu, menuPrimerNivel, darClick);

            }
            return Boolean.TRUE;

        } catch (Exception e) {
            LOGGER.info(""+e);
            return Boolean.FALSE;
        }
    }

    private static void recorrerOpciones(WebDriver driver, String tipoElementoMenu, ExamplesTable opcionesPorMenu, String menuPrimerNivel, Boolean darClick){
        String menu;
        for (Map<String, String> row : opcionesPorMenu.getRows()) {
            menu = "MENU -> " + menuPrimerNivel + " -> " + row.get(menuPrimerNivel);
            LOGGER.error(menu);
            WebElement elementoSubMenu = obtenerMenuPorTextoContenido(driver, row.get(menuPrimerNivel), tipoElementoMenu);
            if(darClick && elementoSubMenu != null){
                elementoSubMenu.click();
            }

        }
    }


    private static Set<String> obtenerNombreColumnasDeExamplesTable(ExamplesTable examplesTable){
        LOGGER.error("GuidewireUtil.obtenerNombreColumnasDeExamplesTable");

        Set<String> nombreColumnasTablaHS = new HashSet<>();
        Parameters row = examplesTable.getRowAsParameters(0);
        Iterator<String> menu = row.values().keySet().iterator();

        while (menu.hasNext()) {
            String key =  menu.next();
            nombreColumnasTablaHS.add(key);
        }

        return nombreColumnasTablaHS;

    }


    private static WebElement obtenerMenuPorTextoContenido(WebDriver driver, String textoDelMenu, String tipoElementoMenu){
        LOGGER.error("GuidewireUtil.obtenerMenuPorTextoContenido");

        if ("LINK".equals(tipoElementoMenu)) {
            LOGGER.error("LINK");
            return driver.findElement(By.xpath(".//a[contains(.,'" + textoDelMenu + "')]"));
        } else {
            return null;
        }

    }

    public static List<String> obtenerTablaDeEjemplosDeUnaColumna(ExamplesTable tablaUnaColumna){
        List<String> valores = new ArrayList<>();

        Parameters row = tablaUnaColumna.getRowAsParameters(0);
        Iterator<String> opcion = row.values().keySet().iterator();

        while (opcion.hasNext()) {
            String key = opcion.next();
            valores.add(key);
        }
        for (Map<String, String> enc : tablaUnaColumna.getRows()) {
            valores.add(enc.get(valores.get(0)));

        }
        return valores;
    }

}

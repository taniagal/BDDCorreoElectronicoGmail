package com.sura.serinitybdd.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sura.common.exception.SuraExceptionTechnical;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.StepInterceptor;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

public class GwNavegacionUtil {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @SuppressWarnings("SameParameterValue")
    public static Boolean existenOpcionesPorMenuHastaSegundoNivel(WebDriver driver, Keys keyNav, String tipoElementoMenu, ExamplesTable opcionesPorMenu, Boolean darClick) {
        String menu = "";

        try {
            HashSet<String> nombreColumnasTablaHS = obtenerNombreColumnasDeExamplesTable(opcionesPorMenu);
            for (String menuPrimerNivel : obtenerNombreColumnasDeExamplesTable(opcionesPorMenu)) {

                menu = "MENU -> " + menuPrimerNivel;
                LOGGER.error(menu);
                WebElement elementoMenu = obtenerMenuPorTextoContenido(driver, menuPrimerNivel, tipoElementoMenu);
                elementoMenu.click();
                elementoMenu.sendKeys(keyNav);
                recorrerOpciones(driver, tipoElementoMenu, opcionesPorMenu, menuPrimerNivel, darClick);

            }
            return Boolean.TRUE;

        } catch (SuraExceptionTechnical e) {
            LOGGER.error("GuidewireUtil.existenOpcionesPorMenu");
            return Boolean.FALSE;
        }
    }

    private static void recorrerOpciones(WebDriver driver, String tipoElementoMenu, ExamplesTable opcionesPorMenu, String menuPrimerNivel, Boolean darClick) throws SuraExceptionTechnical {
        String menu;
        for (Map<String, String> row : opcionesPorMenu.getRows()) {
            menu = "MENU -> " + menuPrimerNivel + " -> " + row.get(menuPrimerNivel);
            LOGGER.error(menu);
            WebElement elementoSubMenu = obtenerMenuPorTextoContenido(driver, row.get(menuPrimerNivel), tipoElementoMenu);
            if(darClick){
                elementoSubMenu.click();

            }

        }
    }


    private static HashSet<String> obtenerNombreColumnasDeExamplesTable(ExamplesTable examplesTable) throws SuraExceptionTechnical {
        LOGGER.error("GuidewireUtil.obtenerNombreColumnasDeExamplesTable");

        HashSet<String> nombreColumnasTablaHS = new HashSet<>();
        Parameters row = examplesTable.getRowAsParameters(0);
        Iterator<String> menu = row.values().keySet().iterator();

        while (menu.hasNext()) {
            String key = (String) menu.next();
            nombreColumnasTablaHS.add(key);
        }

        return nombreColumnasTablaHS;

    }


    private static WebElement obtenerMenuPorTextoContenido(WebDriver driver, String textoDelMenu, String tipoElementoMenu) throws SuraExceptionTechnical {
        LOGGER.error("GuidewireUtil.obtenerMenuPorTextoContenido");

        if ("LINK".equals(tipoElementoMenu)) {
            LOGGER.error("LINK");
            return driver.findElement(By.xpath(".//a[contains(.,'" + textoDelMenu + "')]"));
        } else {
            return null;
        }

    }

    public static void esperarElementoSeaClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static List<String> obtenerTablaDeEjemplosDeUnaColumna(ExamplesTable tablaUnaColumna) throws SuraExceptionTechnical {
        List<String> valores = new ArrayList<>();

        Parameters row = tablaUnaColumna.getRowAsParameters(0);
        Iterator<String> opcion = row.values().keySet().iterator();

        while (opcion.hasNext()) {
            String key = (String) opcion.next();
            valores.add(key);
        }
        for (Map<String, String> enc : tablaUnaColumna.getRows()) {
            valores.add(enc.get(valores.get(0)).toString());

        }
        return valores;
    }

}

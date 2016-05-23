package com.sura.serinitybdd.util;

import net.serenitybdd.core.annotations.findby.By;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * Created by Andrés Alarcón - QVisión on 2016/05/13.
 */
public class GwNavegacionUtil {

    @SuppressWarnings("SameParameterValue")
    public static Boolean existenOpcionesPorMenuHastaSegundoNivel(WebDriver driver, Keys keyNav, String tipoElementoMenu, ExamplesTable opcionesPorMenu, Boolean darClick) {
        System.out.println("GuidewireUtil.existenOpcionesPorMenu");
        String menu = "";

        try {
            HashSet<String> nombreColumnasTablaHS = obtenerNombreColumnasDeExamplesTable(opcionesPorMenu);
            for (String menuPrimerNivel : obtenerNombreColumnasDeExamplesTable(opcionesPorMenu)) {

                menu = "MENU -> " + menuPrimerNivel;
                System.out.println(menu);
                WebElement elementoMenu = obtenerMenuPorTextoContenido(driver, menuPrimerNivel, tipoElementoMenu);
                elementoMenu.click();
                elementoMenu.sendKeys(keyNav);
                recorrerOpciones(driver, tipoElementoMenu, opcionesPorMenu, menuPrimerNivel, darClick);

            }
            return Boolean.TRUE;

        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    private static void recorrerOpciones(WebDriver driver, String tipoElementoMenu, ExamplesTable opcionesPorMenu, String menuPrimerNivel, Boolean darClick) throws Exception {
        String menu;
        for (Map<String, String> row : opcionesPorMenu.getRows()) {
            menu = "MENU -> " + menuPrimerNivel + " -> " + row.get(menuPrimerNivel);
            System.out.println(menu);
            WebElement elementoSubMenu = obtenerMenuPorTextoContenido(driver, row.get(menuPrimerNivel), tipoElementoMenu);
            if(darClick){
                elementoSubMenu.click();

            }

        }
    }


    private static HashSet<String> obtenerNombreColumnasDeExamplesTable(ExamplesTable examplesTable) throws Exception {
        System.out.println("GuidewireUtil.obtenerNombreColumnasDeExamplesTable");

        HashSet<String> nombreColumnasTablaHS = new HashSet<>();
        Parameters row = examplesTable.getRowAsParameters(0);
        Iterator<String> menu = row.values().keySet().iterator();

        while (menu.hasNext()) {
            String key = (String) menu.next();
            nombreColumnasTablaHS.add(new String(key));
        }

        return nombreColumnasTablaHS;

    }


    private static WebElement obtenerMenuPorTextoContenido(WebDriver driver, String textoDelMenu, String tipoElementoMenu) throws Exception {
        System.out.println("GuidewireUtil.obtenerMenuPorTextoContenido");

        switch (tipoElementoMenu) {
            case "LINK":
                System.out.println("LINK");
                return driver.findElement(By.xpath(".//a[contains(.,'" + textoDelMenu + "')]"));
            default:
                return null;
        }

    }

    public static void esperarElementoSeaClickable(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 60).ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static List<String> obtenerTablaDeEjemplosDeUnaColumna(ExamplesTable tablaUnaColumna) throws Exception {
        List<String> valores = new ArrayList<>();

        Parameters row = tablaUnaColumna.getRowAsParameters(0);
        Iterator<String> opcion = row.values().keySet().iterator();

        while (opcion.hasNext()) {
            String key = (String) opcion.next();
            valores.add(new String(key));
        }
        for (Map<String, String> enc : tablaUnaColumna.getRows()) {
            valores.add(new String(enc.get(valores.get(0)).toString()));

        }
        return valores;
    }

}

package com.sura.guidewire.policycenter.pages.poliza;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;


public class BuscarPlacasPage {
    public static void main(String args[]){
      BuscarPlacasPage buscar=new BuscarPlacasPage();
      System.out.println(buscar.valoresCeldas);
    }


    ArrayList<String> valoresCeldas = new ArrayList<>();
    public void recorrerExcel() {
        File archivoExcel = new File("C:\\Users\\tanigral\\Desktop\\poliza\\InstruccionesPrevias.xlsx");
        Workbook libro = null;
        try {
            libro = WorkbookFactory.create(new FileInputStream(archivoExcel));
            XSSFSheet hoja = (XSSFSheet) libro.getSheetAt(0);
            Iterator<Row> filas = hoja.rowIterator();
            Row filasRecorridas;
            while (filas.hasNext()) {
                filasRecorridas = filas.next();
                Iterator<Cell> celdas = filasRecorridas.cellIterator();
                Cell celdasRecorridas;
                while (celdas.hasNext()) {
                    celdasRecorridas = celdas.next();
                    String valorCeldas = celdasRecorridas.getStringCellValue();
                    valoresCeldas.add(valorCeldas);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (archivoExcel != null) {
                    libro.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void buscarPlaca() {
        Iterator<String> recorrerValores = valoresCeldas.iterator();
        int cont = 0;
        String dato;
        Workbook libro = null;
        FileOutputStream salida = null;
        File archivoExcel = new File("C:\\Users\\tanigral\\Desktop\\poliza\\InstruccionesPrevias.xlsx");
        while (recorrerValores.hasNext()) {
            dato = recorrerValores.next();
            cont = cont + 1;
            try {
                libro = WorkbookFactory.create(new FileInputStream(archivoExcel));
                XSSFSheet hoja = (XSSFSheet) libro.getSheetAt(0);
                hoja.getRow(0).createCell(2).setCellValue("");
                hoja.getRow(1).createCell(2).setCellValue("");
                salida = new FileOutputStream(archivoExcel);
                libro.write(salida);
                salida.close();


            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (archivoExcel != null) {
                        libro.close();

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

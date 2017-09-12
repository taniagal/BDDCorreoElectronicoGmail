package com.sura.guidewire.policycenter.pages.poliza;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by tanigral on 06/09/2017.
 */
public class ProbarExcelPage {

    public static void main (String args[]){
       ProbarExcelPage probar=new ProbarExcelPage();
       probar.leerNumeroPoliza();

   }
    ArrayList<Double> listaPolizas=new ArrayList<>();
    public void leerNumeroPoliza() {
        File archivoExcel = new File("C:\\Users\\tanigral\\Desktop\\poliza\\InstruccionesPrevias.xlsx"); //ruta del archivo xls o
        Workbook libroExcel=null;
        try{
            libroExcel = WorkbookFactory.create(new FileInputStream(archivoExcel));
            XSSFSheet hoja= (XSSFSheet) libroExcel.getSheetAt(0);
            Iterator<Row> iteradorFilas=hoja.iterator();
            Row filas;

            while(iteradorFilas.hasNext()){
                filas=iteradorFilas.next();
                Iterator<Cell> iteradorColumnas=filas.cellIterator();
                Cell columnas;
                while(iteradorColumnas.hasNext()){
                    columnas=iteradorColumnas.next();

                    double columnas2=columnas.getNumericCellValue();
                    listaPolizas.add(columnas2);

                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                if (archivoExcel != null) {
                    libroExcel.close();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

package com.sura.guidewire.policycenter.pages.poliza;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EscribirEnExcelPage {
    public void escribirExcel(){
        File archivo=new File("C:\\Users\\tanigral\\Desktop\\poliza\\InstruccionesPrevias.xlsx");
        Workbook libro=null;
        try{
            libro= WorkbookFactory.create(new FileInputStream(archivo));
            XSSFSheet hoja= (XSSFSheet) libro.getSheetAt(0);
            HSSFSheet copiaHoja= (HSSFSheet) libro.createSheet("Copia");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                libro.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}

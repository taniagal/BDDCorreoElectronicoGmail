package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class BuscarPlacaPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscarPolizaInicial;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab:Search_PolicySearch-textEl']")
    private WebElementFacade btnPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:PolicyNumberCriterion-inputEl']")
    private WebElementFacade txtPoliza;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV:0:PolicyNumber']")
    private WebElementFacade btnSeleccionarPoliza;
    @FindBy(xpath = "html/body/div[1]/div[2]/div/span/div/div[1]/div[3]/div/table/tbody/tr[3]/td/div/span")
    private WebElementFacade mnuVehiculos;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Vehicles:PolicyFile_PersonalAuto_VehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade placa;

 public BuscarPlacaPage(WebDriver driver){
     super(driver);
 }
 ArrayList<String> cantidadPolizas=new ArrayList<>();
    public  void buscarPlaca() {
    File archivoModificar=new File("C:\\Users\\tanigral\\Desktop\\poliza\\Morosas.xlsx");
    Workbook libroModificar=null;
    try{
        libroModificar=WorkbookFactory.create(archivoModificar);
        Sheet hojaModificar= libroModificar.getSheetAt(0);
        Iterator<Row> filaModificar=hojaModificar.rowIterator();
        Row filaEncontrada;
        while(filaModificar.hasNext()){
            filaEncontrada=filaModificar.next();
            Iterator<Cell> celdaEncontrada=filaEncontrada.cellIterator();
            while(celdaEncontrada.hasNext()){
                Cell celda=celdaEncontrada.next();
                String celdaString=(celda.getStringCellValue());
                cantidadPolizas.add((celdaString));
            }
        }
        for(int i=0;i<cantidadPolizas.size();i++){
            btnBuscarPolizaInicial.click();
            ingresarDato(txtPoliza,cantidadPolizas.get(i));
            btnBuscar.click();
            btnSeleccionarPoliza.click();
            mnuVehiculos.click();
            String placas=placa.getText();
            Row filas=hojaModificar.createRow(i);

            if(filas==null){
                filas=hojaModificar.createRow(i);
            }
            Cell celdas=filas.createCell(1);
            if(celdas==null){
                celdas=filas.createCell(1);
            }
            celdas.setCellValue(placas);
            FileOutputStream salida=new FileOutputStream("C:\\Users\\tanigral\\Desktop\\poliza\\Morosas (4).xls");
            libroModificar.write(salida);
            salida.close();
        }

    }
catch(Exception e){
        e.printStackTrace();

}
    finally{
    try{
        libroModificar.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }

    }
    }



package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;


public class InstruccionesPreviasPage extends PageUtil {

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
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions-btnIconEl']")
    private WebElementFacade mnuAcciones;
    @FindBy(xpath = ".//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_Create:PolicyFileMenuActions_PreRenewalDirection-textEl']")
    private WebElementFacade btnInstruccionesPrevias;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Edit-btnInnerEl']")
    private WebElementFacade btnEditar;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:PreRenewalDirection-inputEl']")
    private WebElementFacade conboInstruccion;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Text-inputEl']")
    private WebElementFacade txtTexto;
    @FindBy(xpath = ".//*[@id='PreRenewalDirectionPage:PreRenewalDirectionScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;
    @FindBy(xpath = "html/body/div[6]/div/ul/li[4]")
    private WebElementFacade itemNegocioEstatal;


    ArrayList<String> listaPolizas=new ArrayList<>();

    public InstruccionesPreviasPage(WebDriver driver) {
        super(driver);
    }

    public void consultarPoliza() {
        File archivoExcel = new File("C:\\Users\\tanigral\\Desktop\\poliza\\Instrucc2.xlsx"); //ruta del archivo xls o
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
                    String columnas2=columnas.getStringCellValue();
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

    public void marcarPoliza() throws InterruptedException {
        Iterator<String> recorrerAarray=listaPolizas.iterator();
        for(int i=0;i<listaPolizas.size();i++) {
            btnBuscarPolizaInicial.click();
            txtPoliza.click();
            ingresarDato(txtPoliza, String.valueOf(listaPolizas.get(i)));
            btnBuscar.click();
            btnSeleccionarPoliza.click();
           // waitFor("Resumen de la póliza");
            mnuAcciones.click();
           waitForTextToAppear("Instrucciones previas a la renovación");
            btnInstruccionesPrevias.click();
            btnEditar.click();
            seleccionarItem(conboInstruccion,"Negocio estatal");
            ingresarDato(txtTexto,"instruccion previa");
            btnActualizar.waitUntilClickable().click();
            Thread.sleep(20000);
        }
       /* for(Double lista:listaPolizas){
            System.out.println(lista.toString());

        }*/
   /*for(int i=0;i<listaPolizas.size();i++){
        ingresarDato(txtPoliza, String.valueOf(listaPolizas.get(i)));
       // System.out.println(listaPolizas.get(i));
    }
  int cont=0;
  /*while(recorrerAarray.hasNext()){
       System.out.println(recorrerAarray.next());
       ingresarDato(txtPoliza,recorrerAarray.next());
      cont=cont+1;
   }*/
    }

}





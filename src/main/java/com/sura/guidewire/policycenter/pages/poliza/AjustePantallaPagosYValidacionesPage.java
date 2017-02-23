package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.Parametros;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class AjustePantallaPagosYValidacionesPage extends PageUtil{
    private MultiplesAsesoresPage multiplesAsesoresPage;
    private  static final String CONSTANTE_NO ="NO";
    private static final String ENCABEZADO_PAGO = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:ttlBar']";
    private static final String ENCABEZADO_EDIFICIO_Y_UBICACIONES = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:ttlBar']";
    private static final String ENCABEZADO_COTIZACION = ".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']";
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:FloatType_Ext-inputEl']")
    private WebElementFacade listaTipodeMercancia;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:JobWizardToolbarButtonSet:QuoteOrReview']")
    private WebElementFacade btnCotizar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:BillingMethod-inputEl']")
    private WebElementFacade labelMetodoFacturacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:PlanInputSet:PaymentMethod-inputEl']")
    private WebElementFacade labelTipoPlan;
    @FindBy(xpath =".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:FinalAudit-inputEl']")
    private  WebElementFacade labelNecesitaAuditoriaFinalInput;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:FinalAudit-bodyEl']")
    private  WebElementFacade labelNecesitaAuditoriaFinal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:BillingAdjustmentsDV:PlanInputSet:PremiumReportPlan-inputEl']")
    private WebElementFacade listplanInformacionPrima;
    public AjustePantallaPagosYValidacionesPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarArticuloFlotante(Parametros parametros) {
        multiplesAsesoresPage.esperarObjetoClikeableServidor(ENCABEZADO_EDIFICIO_Y_UBICACIONES);
        seleccionarItem(listaTipodeMercancia,parametros.getTipo());
        clickearElemento(btnCotizar);
        multiplesAsesoresPage.esperarObjetoClikeableServidor(ENCABEZADO_COTIZACION);
    }

    public void validacionDatosDePantalla(Parametros parametros) {
        if(parametros.getAuditoria().equals(CONSTANTE_NO)){
            validarSiEsEditableDato(labelNecesitaAuditoriaFinalInput,parametros.getAuditoria());
        }
        validarDatosDePantalla(parametros);
    }

    public void validarDatosDePantalla(Parametros parametros){
        boolean resultado = true;
        String txtmetodoFacturacion = labelMetodoFacturacion.getText();
        String tipoPlan = labelTipoPlan.getText();
        switch (parametros.getTipo()) {
            case Parametros.AUTOMATICO:
                if(!(txtmetodoFacturacion.equals(parametros.getMetodoFacturacion()) && tipoPlan.equals(parametros.getTipoPlan()))){
                    MatcherAssert.assertThat("El metodo de facturacion y el tipo de plan no son iguales.", resultado);
                }
                break;
            case Parametros.DECLARATIVO:
                if(!(txtmetodoFacturacion.equals(parametros.getMetodoFacturacion()) && tipoPlan.equals(parametros.getTipoPlan()))){
                    MatcherAssert.assertThat("El metodo de facturacion y el tipo de plan no son iguales.", resultado);
                }
                break;
            default:
                break;
        }

    }
    public void  validarSiEsEditableDato(WebElementFacade elemento, String valor){

        boolean validarDato = elemento.getAttribute("class").contains("x-form-field x-form-text");
        if (!(validarDato && elemento.getTextValue().equals(valor)  )) {
            MatcherAssert.assertThat("El campo es editable.", validarDato);
        }
    }

    public void seleccionarPlanInformacionPrimas(Parametros parametros) {
        seleccionarItem(listplanInformacionPrima,parametros.getPlanDeInformacion());
        multiplesAsesoresPage.esperarObjetoClikeableServidor(ENCABEZADO_PAGO);

    }
}

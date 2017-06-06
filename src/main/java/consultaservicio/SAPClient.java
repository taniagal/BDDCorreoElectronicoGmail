package consultaservicio;


import com.sura.guidewire.policycenter.resources.PageUtil;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import servicios.*;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.SOAPFaultException;
import java.net.MalformedURLException;
import java.net.URL;

public class SAPClient extends PageUtil {
    private static final String WS_URL = "file:src/main/java/servicios/SI_os_WS_ConsultasDocCxCService.wsdl";
    private static final int CONSTANTE_30 = 60;

    public SAPClient(WebDriver driver) {
        super(driver);
    }

    public static void consultaPolizaEnSap(String numeroPoliza) throws MalformedURLException {
        SIOsWSConsultasDocCxCService service;
        DTNegConsultasDocCxCReq dtNegConsultasDocCxCReq;
        int intentos = CONSTANTE_0;

        try {
            service = new SIOsWSConsultasDocCxCService(new URL(WS_URL), new QName("http://suramericana.servicioscompartidos.contabilidad.cxc", "SI_os_WS_ConsultasDocCxCService"));
            SIOsWSConsultasDocCxC port = service.getHTTPPort();
            BindingProvider bp = (BindingProvider) port;
            bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "coregw_sap");
            bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "qaspisap01");
            dtNegConsultasDocCxCReq = new DTNegConsultasDocCxCReq();
            dtNegConsultasDocCxCReq.setCdconsulta("ZC5");
            dtNegConsultasDocCxCReq.setCdcompania("01");
            dtNegConsultasDocCxCReq.setCdramo("040");
            dtNegConsultasDocCxCReq.setNmpoliza(numeroPoliza);
            dtNegConsultasDocCxCReq.setCdestadoDocumento("P;A;L");
            DTNegConsultasDocCxCRes response = port.siOsWSConsultasDocCxC(dtNegConsultasDocCxCReq);
            while (response.getDatosConsultasDocCxC().size() == CONSTANTE_0 && intentos <= CONSTANTE_30) {
                PageUtil.esperarHasta(TIEMPO_3000);
                response = port.siOsWSConsultasDocCxC(dtNegConsultasDocCxCReq);
                intentos++;
            }
            if (response.getDatosConsultasDocCxC().size() != CONSTANTE_0) {
                for (DTNegRespuestaConsultasCxC dTNegRespuestaConsultasCxC : response.getDatosConsultasDocCxC()) {
                    String[] campo = new String[CONSTANTE_2];
                    campo[CONSTANTE_0] = dTNegRespuestaConsultasCxC.getNmrecibo();
                    campo[CONSTANTE_1] = dTNegRespuestaConsultasCxC.getNmpoliza();
                    System.out.println("Valores retornados: ");
                    for (int datos = CONSTANTE_0; datos <= CONSTANTE_1; datos++) {
                        MatcherAssert.assertThat(campo[datos], Matchers.is(Matchers.not(Matchers.isEmptyString())));
                        System.out.println(campo[datos]);
                    }
                }
            } else {
                MatcherAssert.assertThat("Sin resultados en la consulta " + response.getDatosConsultasDocCxC().isEmpty(), response.getDatosConsultasDocCxC().isEmpty(), Is.is(Matchers.equalTo(false)));
            }
        } catch (P2ApplicationException e) {
            LOGGER.error("Error en la conexion" + e);
            System.out.println(e.getFaultInfo().getStandard().getFaultText());
            e.printStackTrace();
        } catch (SOAPFaultException e) {
            System.out.println(e.getMessage());
        }

    }
}
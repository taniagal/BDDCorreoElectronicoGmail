package consultaservicio;


import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import servicios.*;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;

public class SAPClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private static final String WS_URL = "file:src/main/java/servicios/SI_os_WS_ConsultasDocCxCService.wsdl";

    public void consultaPolizaEnSap(String numeroPoliza) throws MalformedURLException {
        SIOsWSConsultasDocCxCService service;
        DTNegConsultasDocCxCReq dtNegConsultasDocCxCReq;
        RespuestaServicio respuestaServicio = new RespuestaServicio();

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
            for (DTNegRespuestaConsultasCxC dTNegRespuestaConsultasCxC : response.getDatosConsultasDocCxC()) {
                System.out.println(dTNegRespuestaConsultasCxC.getNmrecibo());
                System.out.println(dTNegRespuestaConsultasCxC.getCdmedioPago());
            }
        } catch (P2ApplicationException e) {
            respuestaServicio.setResultado(1);
            LOGGER.error("Error en la conexion" + e);
            System.out.println(e.getFaultInfo().getStandard().getFaultText());
            e.printStackTrace();
        }
    }
}

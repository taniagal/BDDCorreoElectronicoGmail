package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.AbrirAppPage;
import com.sura.policycenter.selenium.pages.EscritorioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jorghome on 04/05/2016.
 */
public class PruebaMenuSteps extends ScenarioSteps {

    Guidewire gw = new Guidewire(getDriver());
    AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());
    EscritorioPage escritorioPage = new EscritorioPage(getDriver());

    public PruebaMenuSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void open() {
        abrirAppPage.open();
    }

    @Step
    public void login(String usuario, String contrasenia) {
        gw.login(usuario, contrasenia);
    }

    @Step
    public void assertion(String element) {
        escritorioPage.assertion(element);
    }

    @Step
    public void navegarTabBar() {
        /*escritorioPage.navegarTabBar("escritorio", "mis actividades", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("escritorio", "mis cuentas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("escritorio", "mis envios", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("escritorio", "mis renovaciones", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("escritorio", "mis otras transacciones de poliza", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("escritorio", "mis colas", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones escritorio", "nuevo envio", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones escritorio", "nueva cuenta", "", "");
        gw.threadWait(2000);*/
        escritorioPage.navegarTabBar("cuenta", "nueva cuenta", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "nueva nota", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "documentos nuevos", "ligar con un documento existente", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "documentos nuevos", "crear un documento nuevo de una plantilla", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "nuevo correo electronico", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "nuevo envio", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "correo nuevo", "revisar nuevo correo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "entrevista", "reunirse con el agente/agencia");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "entrevista", "reunirse con el asegurado");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "cancelar una poliza dividida");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "cotizacion requerida");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "diario por 30 dias");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "diario por 60 dias");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "diario por 90 dias");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "notificacion de poliza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "recordatorio general (diario)");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "revisar agente");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "revisar periodo de 30 dias de aseguranza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "revisar periodo de 45 dias de aseguranza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "revisar periodo de 60 dias de aseguranza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "revision de rendimiento");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "recordatorio", "verificacion de cobertura");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "crear agente nuevo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener auditoria - personal interno");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener auditoria - servicion externo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener cotizacion de reaseguro");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener datos de oficina");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener informacion de riesgos - agente");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener informes de vehiculo motorizado");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener inspeccion - control de siniestro");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener auditoria - servicio externo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "obtener reportes de credito");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "revision legal");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "actividad nueva", "solicitud", "tasar y cotizar la poliza de forma manual");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "transferir polizas a esta cuenta", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "reescribir polizas en esta cuenta", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones cuenta", "combinar cuenta con esta cuenta", "", "");
        gw.threadWait(2000);
        /*escritorioPage.navegarTabBar("poliza", "nuevo envio", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "archivo de cuenta", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "subgerente", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "grupo", "item grupo 1", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "nueva nota", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "documentos nuevos", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "documentos nuevos", "ligar con un documento existente", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "documentos nuevos", "crear un documento nuevo de una plantilla", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "correo nuevo", "revisar nuevo correo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "entrevista", "reunirse con el agente/agencia");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "entrevista", "reunirse con el asegurado");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "cancelar una poliza dividida");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "cotizacion requerida");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "diario por 30 dias");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "diario por 60 dias");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "diario por 90 dias");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "notificacion de poliza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "nueva asignacion de auditoria");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "poliza revision mitad de plazo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "recordatorio general (diario)");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "reescribir a cuenta nueva");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "renovacion de revision de poliza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "revisar agente");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "revisar periodo de 30 dias de aseguranza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "revisar periodo de 45 dias de aseguranza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "revisar periodo de 60 dias de aseguranza");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "revision de rendimiento");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "verificar cobertura");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "recordatorio", "indice fuera de rango");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "revision de asegurador", "revisar y aprobar");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "crear agente nuevo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener auditoria - personal interno");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener auditoria - servicio externo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener cotizacion de reaseguro");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener datos de oficina");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener informacion de riesgos - agente");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener informes de vehiculo motorizado");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener inspeccion - control de siniestro");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener inspeccion - servicio externo");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "obtener reportes de credito");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "revision legal");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "actividad nueva", "solicitud", "tasar y cotizar la poliza de forma manual");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "copiar envio", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones poliza", "archivar/desactivar", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("contacto", "nuevo contacto", "nueva compania");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("contacto", "nuevo contacto", "nueva persona");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("contacto", "buscar", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones contacto", "nueva cuenta", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("buscar", "polizas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("buscar", "cuentas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("buscar", "codigos de agente", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("buscar", "actividades", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("buscar", "contactos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("equipo", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "usuarios");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "grupos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "roles");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "regiones");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "organizaciones");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "codigos de agente");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "perfiles de autoridad");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "atributos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "usuarios y seguridad", "grupos de afinidad");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "configuracion comercial", "patrones de actividad");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "configuracion comercial", "dias festivos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "configuracion comercial", "patrones de formulario de poliza");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "configuracion comercial", "retenciones de polizas");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "supervision", "mensajes");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "supervision", "colas de mensajes");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "supervision", "flujos de trabajo");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "supervision", "estadisticas de flujo de trabajo");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "utilidades", "importar datos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "utilidades", "exportar datos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "utilidades", "parametros de secuencia");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "utilidades", "formatos de exportacion de hojas de calculo");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("acciones administracion", "utilidades", "cambio de datos");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones administracion", "usuario nuevo", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones administracion", "grupo nuevo", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones administracion", "organizacion nueva", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones administracion", "codigo de agente nuevo", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones administracion", "nuevo grupo de afinidad", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarAcciones("acciones administracion", "verificar si el patron de formulario de poliza contiene errores", "", "");
        gw.threadWait(2000);*/

    }

    @Step
    public void logout() {
        gw.logout();
    }
}

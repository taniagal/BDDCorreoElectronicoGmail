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
        escritorioPage.navegarTabBar("escritorio", "mis actividades", "");
        gw.threadWait(2000);
        /*escritorioPage.navegarTabBar("Escritorio", "Estados de aprobacion", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis incidentes", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis moras", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Desembolsos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Pagos en espera", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis elementos de agencia", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Cargos retenidos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Cuenta", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Poliza", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Agente", "", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Cuentas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Polizas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Contactos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Facturas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Pagos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Agentes", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Transacciones", "");
        gw.threadWait(2000);;
        escritorioPage.navegarTabBar("Buscar", "Actividades", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Tickets de problemas", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Procesos de mora", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Desembolsos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Pagos salientes de agente", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Solicitudes de pago", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Elementos en espera de factura directa", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Usuarios");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Grupos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Funciones");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Zonas de seguridad");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Perfil de limite de autoridad");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Patrones de actividad");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de factura a la agencia");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de facturacion");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Patrones de cargo");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Agencias de cobro");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de comision");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de mora");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Dias festivos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de asignacion de pago");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de pagos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de devolucion de prima");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Colas de mensajes");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Flujos de trabajo");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Estadisticas de flujo de trabajo");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Importar datos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Exportar datos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Parametros de secuencia");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Cambio de datos");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de facturacion", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de pago", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de comision", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de mora", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de factura a la agencia", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de devolucion de prima", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de asignacion de pagos", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nueva agencia de cobro", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Inmediato");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Transferencia directa");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Prorrata");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Recapturar");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo usuario", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nueva funcion", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo grupo", "");
        gw.threadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo perfil de limite de autoridad", "");*/
    }

    @Step
    public void logout() {
        gw.logout();
    }
}

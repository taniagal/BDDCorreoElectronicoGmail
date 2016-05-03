package com.sura.billing.selenium.steps;

import com.sura.billing.selenium.pages.AbrirAppPage;
import com.sura.billing.selenium.pages.EscritorioPage;
import com.sura.guidewire.selenium.Guidewire;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jorghome on 22/04/2016.
 */
public class BillingSteps extends ScenarioSteps {

    Guidewire gw = new Guidewire(getDriver());
    AbrirAppPage abrirAppPage = new AbrirAppPage(getDriver());
    EscritorioPage escritorioPage = new EscritorioPage(getDriver());

    public BillingSteps(Pages pages) {
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
    @Manual
    public void navegarItemDiasFestivos() {
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Dias festivos");
    }

    @Step
    public void assertionFestivo(String msj2){
        escritorioPage.asercionFestivo(msj2);
    }

    @Step
    public void navegarTabBar() {
        escritorioPage.navegarTabBar("Escritorio", "Mis actividades", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Estados de aprobacion", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis incidentes", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis moras", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Desembolsos", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Pagos en espera", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis elementos de agencia", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Escritorio", "Cargos retenidos", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Cuenta", "", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Poliza", "", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Agente", "", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Cuentas", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Polizas", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Contactos", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Facturas", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Pagos", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Agentes", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Transacciones", "");
        gw.ThreadWait(2000);;
        escritorioPage.navegarTabBar("Buscar", "Actividades", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Tickets de problemas", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Procesos de mora", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Desembolsos", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Pagos salientes de agente", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Solicitudes de pago", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Buscar", "Elementos en espera de factura directa", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Usuarios");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Grupos");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Funciones");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Zonas de seguridad");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Perfil de limite de autoridad");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Patrones de actividad");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de factura a la agencia");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de facturacion");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Patrones de cargo");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Agencias de cobro");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de comision");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de mora");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Dias festivos");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de asignacion de pago");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de pagos");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de devolucion de prima");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Colas de mensajes");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Flujos de trabajo");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Estadisticas de flujo de trabajo");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Importar datos");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Exportar datos");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Parametros de secuencia");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Cambio de datos");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de facturacion", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de pago", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de comision", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de mora", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de factura a la agencia", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de devolucion de prima", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de asignacion de pagos", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nueva agencia de cobro", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Inmediato");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Transferencia directa");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Prorrata");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Recapturar");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo usuario", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nueva funcion", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo grupo", "");
        gw.ThreadWait(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo perfil de limite de autoridad", "");
    }

    @Step
    public void logout() {
        gw.logout();
    }

}

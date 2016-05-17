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
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Estados de aprobacion", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis incidentes", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis moras", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Desembolsos", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Pagos en espera", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Mis elementos de agencia", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Escritorio", "Cargos retenidos", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Cuenta", "", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Poliza", "", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Agente", "", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Cuentas", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Polizas", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Contactos", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Facturas", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Pagos", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Agentes", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Transacciones", "");
        waitABit(2000);;
        escritorioPage.navegarTabBar("Buscar", "Actividades", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Tickets de problemas", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Procesos de mora", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Desembolsos", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Pagos salientes de agente", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Solicitudes de pago", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Buscar", "Elementos en espera de factura directa", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Usuarios");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Grupos");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Funciones");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Zonas de seguridad");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Usuarios y seguridad", "Perfil de limite de autoridad");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Patrones de actividad");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de factura a la agencia");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de facturacion");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Patrones de cargo");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Agencias de cobro");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de comision");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de mora");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Dias festivos");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de asignacion de pago");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de pagos");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Configuracion comercial", "Planes de devolucion de prima");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Colas de mensajes");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Flujos de trabajo");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Supervision", "Estadisticas de flujo de trabajo");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Importar datos");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Exportar datos");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Parametros de secuencia");
        waitABit(2000);
        escritorioPage.navegarTabBar("Administracion", "Utilidades", "Cambio de datos");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de facturacion", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de pago", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de comision", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de mora", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de factura a la agencia", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de devolucion de prima", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo plan de asignacion de pagos", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nueva agencia de cobro", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Inmediato");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Transferencia directa");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Prorrata");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo patron de cargo", "Recapturar");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo usuario", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nueva funcion", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo grupo", "");
        waitABit(2000);
        escritorioPage.navegarTabBar("Acciones", "Nuevo perfil de limite de autoridad", "");
    }

    @Step
    public void logout() {
        gw.logout();
    }

}

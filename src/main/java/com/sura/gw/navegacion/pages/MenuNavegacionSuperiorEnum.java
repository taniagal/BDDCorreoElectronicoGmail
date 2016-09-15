package com.sura.gw.navegacion.pages;


public enum MenuNavegacionSuperiorEnum {
    ESCRITORIO(".//*[@id='TabBar:DesktopTab']"),
    CUENTA(".//*[@id='TabBar:AccountTab']"),
    POLIZA(".//*[@id='TabBar:PolicyTab']"),
    CONTACTO(".//*[@id='TabBar:ContactTab']"),
    BUSCAR(".//*[@id='TabBar:SearchTab']"),
    EQUIPO(".//*[@id='TabBar:TeamTab']"),
    ADMINISTRACION(".//*[@id='TabBar:AdminTab']");

    private String xpath;

    MenuNavegacionSuperiorEnum(String xpath) {
        this.xpath = xpath;
    }

    public String xpath() {
        return xpath;
    }
}

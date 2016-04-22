package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by eliaalch on 21/04/2016.
 */
public class ParticipantesDeCuentaPage extends Guidewire {

    public ParticipantesDeCuentaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_AccountFile_Roles']/div")
    WebElementFacade mnuParticipantes;

    @FindBy(xpath=".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:ttlBar']")
    WebElementFacade lblParticipantesCuenta;

    @FindBy(xpath=".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:ttlBar']")
    WebElementFacade btnEditarParticipantes;

    @FindBy(xpath=".//*[@id='gridcolumn-1255-titleEl']")
    WebElementFacade grdClmnRol;

    @FindBy(xpath=".//*[@id='gridcolumn-1256-titleEl']")
    WebElementFacade grdClmnUsuarioAsig;

    @FindBy(xpath=".//*[@id='gridcolumn-1257-titleEl']")
    WebElementFacade grdClmnGrupoAsig;

    @FindBy(xpath=".//*[@id='ext-gen2180']")
    WebElementFacade grdRolValor;

    @FindBy(xpath=".//*[@id='gridview-1258-record-ext-record-93']/td[3]/div")
    WebElementFacade grdUsrAsigValor;

    @FindBy(xpath=".//*[@id='gridview-1258-record-ext-record-93']/td[4]/div")
    WebElementFacade grdUsrGrupoValor;

    @FindBy(xpath=".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Update-btnInnerEl']")
    WebElementFacade btnActualizar;

    @FindBy(xpath=".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Cancel']")
    WebElementFacade btnCancelar;

    @FindBy(xpath = ".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Add']")
    WebElementFacade btnAgregar;

    @FindBy(xpath =".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:Remove']")
    WebElementFacade btnQuitar;

    @FindBy(xpath =".//*[@id='ext-gen1853']/div/img")
    WebElementFacade chkRegistroUno;

    @FindBy(xpath =".//*[@id='AccountFile_Roles:AccountFile_RolesScreen:AccountRolesLV:0:AssignedUser:UserBrowseMenuItem']")
    WebElementFacade btnSelecUsuario;

    @FindBy(xpath =".//*[@id='gridview-1259-record-ext-record-130']/td[3]/div")
    WebElementFacade grdUsuarioAsigEdit;

    @FindBy(xpath =".//*[@id='ext-gen2119']")
    WebElementFacade grdGrupoAsigEdit;
}

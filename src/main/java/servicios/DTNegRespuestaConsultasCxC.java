
package servicios;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data Type del Negocio con los Datos de Salida de las Consultas de Cuentas por Cobrar
 * 
 * <p>Java class for DT_NegRespuestaConsultasCxC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DT_NegRespuestaConsultasCxC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fegeneracion_dcto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fecontabilizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nmmes_registro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdmoneda" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pttasa_cambio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fetasa_cambio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="nmrecibo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dscomentarios" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ptneto_documento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="snrecibo_con_imp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poiva_real" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdoficina_radica" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmdias_cond_pago" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="feini_vigencia_dcto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="snrecibo_bloqueado" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdmedio_pago" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fefin_vigencia_dcto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cdoperacion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdtipo_rete_ica" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poind_rete_ica" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdtipo_rete_iva" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poind_rete_iva" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdtipo_rete_fuente" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="poind_rete_fuente" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmpoliza" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdramo_principal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdasesor_lider" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdcanal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmaplicacion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdsubramo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdtipo_coaseguro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pttotal_abonado" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ptsaldo_documento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdtipo_documento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdestado_documento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdbeneficiario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdtipo_id_beneficiario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dsbeneficiario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdforma_pago" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_NegRespuestaConsultasCxC", propOrder = {
    "fegeneracionDcto",
    "fecontabilizacion",
    "nmmesRegistro",
    "cdmoneda",
    "pttasaCambio",
    "fetasaCambio",
    "nmrecibo",
    "dscomentarios",
    "ptnetoDocumento",
    "snreciboConImp",
    "poivaReal",
    "cdoficinaRadica",
    "nmdiasCondPago",
    "feiniVigenciaDcto",
    "snreciboBloqueado",
    "cdmedioPago",
    "fefinVigenciaDcto",
    "cdoperacion",
    "cdtipoReteIca",
    "poindReteIca",
    "cdtipoReteIva",
    "poindReteIva",
    "cdtipoReteFuente",
    "poindReteFuente",
    "nmpoliza",
    "cdramoPrincipal",
    "cdasesorLider",
    "cdcanal",
    "nmaplicacion",
    "cdsubramo",
    "cdtipoCoaseguro",
    "pttotalAbonado",
    "ptsaldoDocumento",
    "cdtipoDocumento",
    "cdestadoDocumento",
    "cdbeneficiario",
    "cdtipoIdBeneficiario",
    "dsbeneficiario",
    "cdformaPago"
})
public class DTNegRespuestaConsultasCxC {

    @XmlElement(name = "fegeneracion_dcto")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fegeneracionDcto;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecontabilizacion;
    @XmlElement(name = "nmmes_registro")
    protected String nmmesRegistro;
    protected String cdmoneda;
    @XmlElement(name = "pttasa_cambio")
    protected BigDecimal pttasaCambio;
    @XmlElement(name = "fetasa_cambio")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fetasaCambio;
    protected String nmrecibo;
    protected String dscomentarios;
    @XmlElement(name = "ptneto_documento")
    protected BigDecimal ptnetoDocumento;
    @XmlElement(name = "snrecibo_con_imp")
    protected String snreciboConImp;
    @XmlElement(name = "poiva_real")
    protected String poivaReal;
    @XmlElement(name = "cdoficina_radica")
    protected String cdoficinaRadica;
    @XmlElement(name = "nmdias_cond_pago")
    protected BigDecimal nmdiasCondPago;
    @XmlElement(name = "feini_vigencia_dcto")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar feiniVigenciaDcto;
    @XmlElement(name = "snrecibo_bloqueado")
    protected String snreciboBloqueado;
    @XmlElement(name = "cdmedio_pago")
    protected String cdmedioPago;
    @XmlElement(name = "fefin_vigencia_dcto")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fefinVigenciaDcto;
    protected String cdoperacion;
    @XmlElement(name = "cdtipo_rete_ica")
    protected String cdtipoReteIca;
    @XmlElement(name = "poind_rete_ica")
    protected String poindReteIca;
    @XmlElement(name = "cdtipo_rete_iva")
    protected String cdtipoReteIva;
    @XmlElement(name = "poind_rete_iva")
    protected String poindReteIva;
    @XmlElement(name = "cdtipo_rete_fuente")
    protected String cdtipoReteFuente;
    @XmlElement(name = "poind_rete_fuente")
    protected String poindReteFuente;
    protected String nmpoliza;
    @XmlElement(name = "cdramo_principal")
    protected String cdramoPrincipal;
    @XmlElement(name = "cdasesor_lider")
    protected String cdasesorLider;
    protected String cdcanal;
    protected BigInteger nmaplicacion;
    protected String cdsubramo;
    @XmlElement(name = "cdtipo_coaseguro")
    protected String cdtipoCoaseguro;
    @XmlElement(name = "pttotal_abonado")
    protected BigDecimal pttotalAbonado;
    @XmlElement(name = "ptsaldo_documento")
    protected BigDecimal ptsaldoDocumento;
    @XmlElement(name = "cdtipo_documento")
    protected String cdtipoDocumento;
    @XmlElement(name = "cdestado_documento")
    protected String cdestadoDocumento;
    protected String cdbeneficiario;
    @XmlElement(name = "cdtipo_id_beneficiario")
    protected String cdtipoIdBeneficiario;
    protected String dsbeneficiario;
    @XmlElement(name = "cdforma_pago")
    protected String cdformaPago;

    /**
     * Gets the value of the fegeneracionDcto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFegeneracionDcto() {
        return fegeneracionDcto;
    }

    /**
     * Sets the value of the fegeneracionDcto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFegeneracionDcto(XMLGregorianCalendar value) {
        this.fegeneracionDcto = value;
    }

    /**
     * Gets the value of the fecontabilizacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecontabilizacion() {
        return fecontabilizacion;
    }

    /**
     * Sets the value of the fecontabilizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecontabilizacion(XMLGregorianCalendar value) {
        this.fecontabilizacion = value;
    }

    /**
     * Gets the value of the nmmesRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmesRegistro() {
        return nmmesRegistro;
    }

    /**
     * Sets the value of the nmmesRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmesRegistro(String value) {
        this.nmmesRegistro = value;
    }

    /**
     * Gets the value of the cdmoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdmoneda() {
        return cdmoneda;
    }

    /**
     * Sets the value of the cdmoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdmoneda(String value) {
        this.cdmoneda = value;
    }

    /**
     * Gets the value of the pttasaCambio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPttasaCambio() {
        return pttasaCambio;
    }

    /**
     * Sets the value of the pttasaCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPttasaCambio(BigDecimal value) {
        this.pttasaCambio = value;
    }

    /**
     * Gets the value of the fetasaCambio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFetasaCambio() {
        return fetasaCambio;
    }

    /**
     * Sets the value of the fetasaCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFetasaCambio(XMLGregorianCalendar value) {
        this.fetasaCambio = value;
    }

    /**
     * Gets the value of the nmrecibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmrecibo() {
        return nmrecibo;
    }

    /**
     * Sets the value of the nmrecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmrecibo(String value) {
        this.nmrecibo = value;
    }

    /**
     * Gets the value of the dscomentarios property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscomentarios() {
        return dscomentarios;
    }

    /**
     * Sets the value of the dscomentarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscomentarios(String value) {
        this.dscomentarios = value;
    }

    /**
     * Gets the value of the ptnetoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtnetoDocumento() {
        return ptnetoDocumento;
    }

    /**
     * Sets the value of the ptnetoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtnetoDocumento(BigDecimal value) {
        this.ptnetoDocumento = value;
    }

    /**
     * Gets the value of the snreciboConImp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnreciboConImp() {
        return snreciboConImp;
    }

    /**
     * Sets the value of the snreciboConImp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnreciboConImp(String value) {
        this.snreciboConImp = value;
    }

    /**
     * Gets the value of the poivaReal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoivaReal() {
        return poivaReal;
    }

    /**
     * Sets the value of the poivaReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoivaReal(String value) {
        this.poivaReal = value;
    }

    /**
     * Gets the value of the cdoficinaRadica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdoficinaRadica() {
        return cdoficinaRadica;
    }

    /**
     * Sets the value of the cdoficinaRadica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdoficinaRadica(String value) {
        this.cdoficinaRadica = value;
    }

    /**
     * Gets the value of the nmdiasCondPago property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNmdiasCondPago() {
        return nmdiasCondPago;
    }

    /**
     * Sets the value of the nmdiasCondPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNmdiasCondPago(BigDecimal value) {
        this.nmdiasCondPago = value;
    }

    /**
     * Gets the value of the feiniVigenciaDcto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeiniVigenciaDcto() {
        return feiniVigenciaDcto;
    }

    /**
     * Sets the value of the feiniVigenciaDcto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeiniVigenciaDcto(XMLGregorianCalendar value) {
        this.feiniVigenciaDcto = value;
    }

    /**
     * Gets the value of the snreciboBloqueado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnreciboBloqueado() {
        return snreciboBloqueado;
    }

    /**
     * Sets the value of the snreciboBloqueado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnreciboBloqueado(String value) {
        this.snreciboBloqueado = value;
    }

    /**
     * Gets the value of the cdmedioPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdmedioPago() {
        return cdmedioPago;
    }

    /**
     * Sets the value of the cdmedioPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdmedioPago(String value) {
        this.cdmedioPago = value;
    }

    /**
     * Gets the value of the fefinVigenciaDcto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFefinVigenciaDcto() {
        return fefinVigenciaDcto;
    }

    /**
     * Sets the value of the fefinVigenciaDcto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFefinVigenciaDcto(XMLGregorianCalendar value) {
        this.fefinVigenciaDcto = value;
    }

    /**
     * Gets the value of the cdoperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdoperacion() {
        return cdoperacion;
    }

    /**
     * Sets the value of the cdoperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdoperacion(String value) {
        this.cdoperacion = value;
    }

    /**
     * Gets the value of the cdtipoReteIca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtipoReteIca() {
        return cdtipoReteIca;
    }

    /**
     * Sets the value of the cdtipoReteIca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtipoReteIca(String value) {
        this.cdtipoReteIca = value;
    }

    /**
     * Gets the value of the poindReteIca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoindReteIca() {
        return poindReteIca;
    }

    /**
     * Sets the value of the poindReteIca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoindReteIca(String value) {
        this.poindReteIca = value;
    }

    /**
     * Gets the value of the cdtipoReteIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtipoReteIva() {
        return cdtipoReteIva;
    }

    /**
     * Sets the value of the cdtipoReteIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtipoReteIva(String value) {
        this.cdtipoReteIva = value;
    }

    /**
     * Gets the value of the poindReteIva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoindReteIva() {
        return poindReteIva;
    }

    /**
     * Sets the value of the poindReteIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoindReteIva(String value) {
        this.poindReteIva = value;
    }

    /**
     * Gets the value of the cdtipoReteFuente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtipoReteFuente() {
        return cdtipoReteFuente;
    }

    /**
     * Sets the value of the cdtipoReteFuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtipoReteFuente(String value) {
        this.cdtipoReteFuente = value;
    }

    /**
     * Gets the value of the poindReteFuente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoindReteFuente() {
        return poindReteFuente;
    }

    /**
     * Sets the value of the poindReteFuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoindReteFuente(String value) {
        this.poindReteFuente = value;
    }

    /**
     * Gets the value of the nmpoliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmpoliza() {
        return nmpoliza;
    }

    /**
     * Sets the value of the nmpoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmpoliza(String value) {
        this.nmpoliza = value;
    }

    /**
     * Gets the value of the cdramoPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdramoPrincipal() {
        return cdramoPrincipal;
    }

    /**
     * Sets the value of the cdramoPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdramoPrincipal(String value) {
        this.cdramoPrincipal = value;
    }

    /**
     * Gets the value of the cdasesorLider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdasesorLider() {
        return cdasesorLider;
    }

    /**
     * Sets the value of the cdasesorLider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdasesorLider(String value) {
        this.cdasesorLider = value;
    }

    /**
     * Gets the value of the cdcanal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdcanal() {
        return cdcanal;
    }

    /**
     * Sets the value of the cdcanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdcanal(String value) {
        this.cdcanal = value;
    }

    /**
     * Gets the value of the nmaplicacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNmaplicacion() {
        return nmaplicacion;
    }

    /**
     * Sets the value of the nmaplicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNmaplicacion(BigInteger value) {
        this.nmaplicacion = value;
    }

    /**
     * Gets the value of the cdsubramo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdsubramo() {
        return cdsubramo;
    }

    /**
     * Sets the value of the cdsubramo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdsubramo(String value) {
        this.cdsubramo = value;
    }

    /**
     * Gets the value of the cdtipoCoaseguro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtipoCoaseguro() {
        return cdtipoCoaseguro;
    }

    /**
     * Sets the value of the cdtipoCoaseguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtipoCoaseguro(String value) {
        this.cdtipoCoaseguro = value;
    }

    /**
     * Gets the value of the pttotalAbonado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPttotalAbonado() {
        return pttotalAbonado;
    }

    /**
     * Sets the value of the pttotalAbonado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPttotalAbonado(BigDecimal value) {
        this.pttotalAbonado = value;
    }

    /**
     * Gets the value of the ptsaldoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtsaldoDocumento() {
        return ptsaldoDocumento;
    }

    /**
     * Sets the value of the ptsaldoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtsaldoDocumento(BigDecimal value) {
        this.ptsaldoDocumento = value;
    }

    /**
     * Gets the value of the cdtipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtipoDocumento() {
        return cdtipoDocumento;
    }

    /**
     * Sets the value of the cdtipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtipoDocumento(String value) {
        this.cdtipoDocumento = value;
    }

    /**
     * Gets the value of the cdestadoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdestadoDocumento() {
        return cdestadoDocumento;
    }

    /**
     * Sets the value of the cdestadoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdestadoDocumento(String value) {
        this.cdestadoDocumento = value;
    }

    /**
     * Gets the value of the cdbeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdbeneficiario() {
        return cdbeneficiario;
    }

    /**
     * Sets the value of the cdbeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdbeneficiario(String value) {
        this.cdbeneficiario = value;
    }

    /**
     * Gets the value of the cdtipoIdBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtipoIdBeneficiario() {
        return cdtipoIdBeneficiario;
    }

    /**
     * Sets the value of the cdtipoIdBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtipoIdBeneficiario(String value) {
        this.cdtipoIdBeneficiario = value;
    }

    /**
     * Gets the value of the dsbeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsbeneficiario() {
        return dsbeneficiario;
    }

    /**
     * Sets the value of the dsbeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsbeneficiario(String value) {
        this.dsbeneficiario = value;
    }

    /**
     * Gets the value of the cdformaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdformaPago() {
        return cdformaPago;
    }

    /**
     * Sets the value of the cdformaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdformaPago(String value) {
        this.cdformaPago = value;
    }

}

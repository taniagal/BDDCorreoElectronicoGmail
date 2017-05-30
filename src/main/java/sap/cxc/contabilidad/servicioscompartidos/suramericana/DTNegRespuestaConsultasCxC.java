
package cxc.contabilidad.servicioscompartidos.suramericana;

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
 * <p>Clase Java para DT_NegRespuestaConsultasCxC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad fegeneracionDcto.
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
     * Define el valor de la propiedad fegeneracionDcto.
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
     * Obtiene el valor de la propiedad fecontabilizacion.
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
     * Define el valor de la propiedad fecontabilizacion.
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
     * Obtiene el valor de la propiedad nmmesRegistro.
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
     * Define el valor de la propiedad nmmesRegistro.
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
     * Obtiene el valor de la propiedad cdmoneda.
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
     * Define el valor de la propiedad cdmoneda.
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
     * Obtiene el valor de la propiedad pttasaCambio.
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
     * Define el valor de la propiedad pttasaCambio.
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
     * Obtiene el valor de la propiedad fetasaCambio.
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
     * Define el valor de la propiedad fetasaCambio.
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
     * Obtiene el valor de la propiedad nmrecibo.
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
     * Define el valor de la propiedad nmrecibo.
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
     * Obtiene el valor de la propiedad dscomentarios.
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
     * Define el valor de la propiedad dscomentarios.
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
     * Obtiene el valor de la propiedad ptnetoDocumento.
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
     * Define el valor de la propiedad ptnetoDocumento.
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
     * Obtiene el valor de la propiedad snreciboConImp.
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
     * Define el valor de la propiedad snreciboConImp.
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
     * Obtiene el valor de la propiedad poivaReal.
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
     * Define el valor de la propiedad poivaReal.
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
     * Obtiene el valor de la propiedad cdoficinaRadica.
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
     * Define el valor de la propiedad cdoficinaRadica.
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
     * Obtiene el valor de la propiedad nmdiasCondPago.
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
     * Define el valor de la propiedad nmdiasCondPago.
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
     * Obtiene el valor de la propiedad feiniVigenciaDcto.
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
     * Define el valor de la propiedad feiniVigenciaDcto.
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
     * Obtiene el valor de la propiedad snreciboBloqueado.
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
     * Define el valor de la propiedad snreciboBloqueado.
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
     * Obtiene el valor de la propiedad cdmedioPago.
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
     * Define el valor de la propiedad cdmedioPago.
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
     * Obtiene el valor de la propiedad fefinVigenciaDcto.
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
     * Define el valor de la propiedad fefinVigenciaDcto.
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
     * Obtiene el valor de la propiedad cdoperacion.
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
     * Define el valor de la propiedad cdoperacion.
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
     * Obtiene el valor de la propiedad cdtipoReteIca.
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
     * Define el valor de la propiedad cdtipoReteIca.
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
     * Obtiene el valor de la propiedad poindReteIca.
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
     * Define el valor de la propiedad poindReteIca.
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
     * Obtiene el valor de la propiedad cdtipoReteIva.
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
     * Define el valor de la propiedad cdtipoReteIva.
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
     * Obtiene el valor de la propiedad poindReteIva.
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
     * Define el valor de la propiedad poindReteIva.
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
     * Obtiene el valor de la propiedad cdtipoReteFuente.
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
     * Define el valor de la propiedad cdtipoReteFuente.
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
     * Obtiene el valor de la propiedad poindReteFuente.
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
     * Define el valor de la propiedad poindReteFuente.
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
     * Obtiene el valor de la propiedad nmpoliza.
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
     * Define el valor de la propiedad nmpoliza.
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
     * Obtiene el valor de la propiedad cdramoPrincipal.
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
     * Define el valor de la propiedad cdramoPrincipal.
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
     * Obtiene el valor de la propiedad cdasesorLider.
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
     * Define el valor de la propiedad cdasesorLider.
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
     * Obtiene el valor de la propiedad cdcanal.
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
     * Define el valor de la propiedad cdcanal.
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
     * Obtiene el valor de la propiedad nmaplicacion.
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
     * Define el valor de la propiedad nmaplicacion.
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
     * Obtiene el valor de la propiedad cdsubramo.
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
     * Define el valor de la propiedad cdsubramo.
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
     * Obtiene el valor de la propiedad cdtipoCoaseguro.
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
     * Define el valor de la propiedad cdtipoCoaseguro.
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
     * Obtiene el valor de la propiedad pttotalAbonado.
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
     * Define el valor de la propiedad pttotalAbonado.
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
     * Obtiene el valor de la propiedad ptsaldoDocumento.
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
     * Define el valor de la propiedad ptsaldoDocumento.
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
     * Obtiene el valor de la propiedad cdtipoDocumento.
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
     * Define el valor de la propiedad cdtipoDocumento.
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
     * Obtiene el valor de la propiedad cdestadoDocumento.
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
     * Define el valor de la propiedad cdestadoDocumento.
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
     * Obtiene el valor de la propiedad cdbeneficiario.
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
     * Define el valor de la propiedad cdbeneficiario.
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
     * Obtiene el valor de la propiedad cdtipoIdBeneficiario.
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
     * Define el valor de la propiedad cdtipoIdBeneficiario.
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
     * Obtiene el valor de la propiedad dsbeneficiario.
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
     * Define el valor de la propiedad dsbeneficiario.
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
     * Obtiene el valor de la propiedad cdformaPago.
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
     * Define el valor de la propiedad cdformaPago.
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

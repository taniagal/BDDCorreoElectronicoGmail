
package cxc.contabilidad.servicioscompartidos.suramericana;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data Type del Negocio para el Request de las Consultas de CxC por Documento
 * 
 * <p>Clase Java para DT_NegConsultasDocCxCReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_NegConsultasDocCxCReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdconsulta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdcompania">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdramo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmpoliza" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmrecibo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cdestado_documento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmaplicacion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="feini_vigencia_dcto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cdoperacion_fuente" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
@XmlType(name = "DT_NegConsultasDocCxCReq", propOrder = {
    "cdconsulta",
    "cdcompania",
    "cdramo",
    "nmpoliza",
    "nmrecibo",
    "cdestadoDocumento",
    "nmaplicacion",
    "feiniVigenciaDcto",
    "cdoperacionFuente"
})
public class DTNegConsultasDocCxCReq {

    @XmlElement(required = true)
    protected String cdconsulta;
    @XmlElement(required = true)
    protected String cdcompania;
    @XmlElement(required = true)
    protected String cdramo;
    protected String nmpoliza;
    protected String nmrecibo;
    @XmlElement(name = "cdestado_documento")
    protected String cdestadoDocumento;
    protected String nmaplicacion;
    @XmlElement(name = "feini_vigencia_dcto")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar feiniVigenciaDcto;
    @XmlElement(name = "cdoperacion_fuente")
    protected String cdoperacionFuente;

    /**
     * Obtiene el valor de la propiedad cdconsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdconsulta() {
        return cdconsulta;
    }

    /**
     * Define el valor de la propiedad cdconsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdconsulta(String value) {
        this.cdconsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad cdcompania.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdcompania() {
        return cdcompania;
    }

    /**
     * Define el valor de la propiedad cdcompania.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdcompania(String value) {
        this.cdcompania = value;
    }

    /**
     * Obtiene el valor de la propiedad cdramo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdramo() {
        return cdramo;
    }

    /**
     * Define el valor de la propiedad cdramo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdramo(String value) {
        this.cdramo = value;
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
     * Obtiene el valor de la propiedad nmaplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmaplicacion() {
        return nmaplicacion;
    }

    /**
     * Define el valor de la propiedad nmaplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmaplicacion(String value) {
        this.nmaplicacion = value;
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
     * Obtiene el valor de la propiedad cdoperacionFuente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdoperacionFuente() {
        return cdoperacionFuente;
    }

    /**
     * Define el valor de la propiedad cdoperacionFuente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdoperacionFuente(String value) {
        this.cdoperacionFuente = value;
    }

}

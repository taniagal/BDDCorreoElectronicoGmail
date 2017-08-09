
package servicios;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data Type del Negocio para el Request de las Consultas de CxC por Documento
 * 
 * <p>Java class for DT_NegConsultasDocCxCReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the cdconsulta property.
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
     * Sets the value of the cdconsulta property.
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
     * Gets the value of the cdcompania property.
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
     * Sets the value of the cdcompania property.
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
     * Gets the value of the cdramo property.
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
     * Sets the value of the cdramo property.
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
     * Gets the value of the nmaplicacion property.
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
     * Sets the value of the nmaplicacion property.
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
     * Gets the value of the cdoperacionFuente property.
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
     * Sets the value of the cdoperacionFuente property.
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

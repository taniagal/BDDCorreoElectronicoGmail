
package com.suramericana.assets.exceptions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExchangeFaultData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExchangeFaultData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultDetail" type="{http://exceptions.assets.suramericana.com}ExchangeLogData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeFaultData", propOrder = {
    "faultText",
    "faultUrl",
    "faultDetail"
})
public class ExchangeFaultData {

    @XmlElement(required = true)
    protected String faultText;
    protected String faultUrl;
    protected List<ExchangeLogData> faultDetail;

    /**
     * Obtiene el valor de la propiedad faultText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultText() {
        return faultText;
    }

    /**
     * Define el valor de la propiedad faultText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultText(String value) {
        this.faultText = value;
    }

    /**
     * Obtiene el valor de la propiedad faultUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultUrl() {
        return faultUrl;
    }

    /**
     * Define el valor de la propiedad faultUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultUrl(String value) {
        this.faultUrl = value;
    }

    /**
     * Gets the value of the faultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeLogData }
     * 
     * 
     */
    public List<ExchangeLogData> getFaultDetail() {
        if (faultDetail == null) {
            faultDetail = new ArrayList<ExchangeLogData>();
        }
        return this.faultDetail;
    }

}

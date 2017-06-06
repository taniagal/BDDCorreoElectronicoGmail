
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data Type del Lado del Negocio para el Response de la Consulta de Cuentas por Cobrar por Documento
 * 
 * <p>Java class for DT_NegConsultasDocCxCRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DT_NegConsultasDocCxCRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosConsultasDocCxC" type="{http://suramericana.servicioscompartidos.contabilidad.cxc}DT_NegRespuestaConsultasCxC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_NegConsultasDocCxCRes", propOrder = {
    "datosConsultasDocCxC"
})
public class DTNegConsultasDocCxCRes {

    protected List<DTNegRespuestaConsultasCxC> datosConsultasDocCxC;

    /**
     * Gets the value of the datosConsultasDocCxC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosConsultasDocCxC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosConsultasDocCxC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTNegRespuestaConsultasCxC }
     * 
     * 
     */
    public List<DTNegRespuestaConsultasCxC> getDatosConsultasDocCxC() {
        if (datosConsultasDocCxC == null) {
            datosConsultasDocCxC = new ArrayList<DTNegRespuestaConsultasCxC>();
        }
        return this.datosConsultasDocCxC;
    }

}

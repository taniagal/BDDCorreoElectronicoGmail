
package cxc.contabilidad.servicioscompartidos.suramericana;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxc.contabilidad.servicioscompartidos.suramericana package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTNegConsultasDocCxCRes_QNAME = new QName("http://suramericana.servicioscompartidos.contabilidad.cxc", "MT_NegConsultasDocCxCRes");
    private final static QName _MTNegConsultasDocCxCReq_QNAME = new QName("http://suramericana.servicioscompartidos.contabilidad.cxc", "MT_NegConsultasDocCxCReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxc.contabilidad.servicioscompartidos.suramericana
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTNegConsultasDocCxCRes }
     * 
     */
    public DTNegConsultasDocCxCRes createDTNegConsultasDocCxCRes() {
        return new DTNegConsultasDocCxCRes();
    }

    /**
     * Create an instance of {@link DTNegConsultasDocCxCReq }
     * 
     */
    public DTNegConsultasDocCxCReq createDTNegConsultasDocCxCReq() {
        return new DTNegConsultasDocCxCReq();
    }

    /**
     * Create an instance of {@link DTNegRespuestaConsultasCxC }
     * 
     */
    public DTNegRespuestaConsultasCxC createDTNegRespuestaConsultasCxC() {
        return new DTNegRespuestaConsultasCxC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTNegConsultasDocCxCRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://suramericana.servicioscompartidos.contabilidad.cxc", name = "MT_NegConsultasDocCxCRes")
    public JAXBElement<DTNegConsultasDocCxCRes> createMTNegConsultasDocCxCRes(DTNegConsultasDocCxCRes value) {
        return new JAXBElement<DTNegConsultasDocCxCRes>(_MTNegConsultasDocCxCRes_QNAME, DTNegConsultasDocCxCRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTNegConsultasDocCxCReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://suramericana.servicioscompartidos.contabilidad.cxc", name = "MT_NegConsultasDocCxCReq")
    public JAXBElement<DTNegConsultasDocCxCReq> createMTNegConsultasDocCxCReq(DTNegConsultasDocCxCReq value) {
        return new JAXBElement<DTNegConsultasDocCxCReq>(_MTNegConsultasDocCxCReq_QNAME, DTNegConsultasDocCxCReq.class, null, value);
    }

}

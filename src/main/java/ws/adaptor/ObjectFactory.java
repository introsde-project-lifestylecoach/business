
package ws.adaptor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.adaptor package. 
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

    private final static QName _GetBmiResponse_QNAME = new QName("http://webservice.adaptor.lifecoach/", "getBmiResponse");
    private final static QName _GetBmi_QNAME = new QName("http://webservice.adaptor.lifecoach/", "getBmi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.adaptor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBmi }
     * 
     */
    public GetBmi createGetBmi() {
        return new GetBmi();
    }

    /**
     * Create an instance of {@link GetBmiResponse }
     * 
     */
    public GetBmiResponse createGetBmiResponse() {
        return new GetBmiResponse();
    }

    /**
     * Create an instance of {@link Bmi }
     * 
     */
    public Bmi createBmi() {
        return new Bmi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaptor.lifecoach/", name = "getBmiResponse")
    public JAXBElement<GetBmiResponse> createGetBmiResponse(GetBmiResponse value) {
        return new JAXBElement<GetBmiResponse>(_GetBmiResponse_QNAME, GetBmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.adaptor.lifecoach/", name = "getBmi")
    public JAXBElement<GetBmi> createGetBmi(GetBmi value) {
        return new JAXBElement<GetBmi>(_GetBmi_QNAME, GetBmi.class, null, value);
    }

}

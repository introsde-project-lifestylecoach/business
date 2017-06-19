
package lifecoach.localdb.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lifecoach.localdb.webservice package. 
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

    private final static QName _Measure_QNAME = new QName("http://webservice.localdb.lifecoach/", "measure");
    private final static QName _Goal_QNAME = new QName("http://webservice.localdb.lifecoach/", "goal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lifecoach.localdb.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link GoalType }
     * 
     */
    public GoalType createGoalType() {
        return new GoalType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link Person.HealthProfile }
     * 
     */
    public Person.HealthProfile createPersonHealthProfile() {
        return new Person.HealthProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Measure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "measure")
    public JAXBElement<Measure> createMeasure(Measure value) {
        return new JAXBElement<Measure>(_Measure_QNAME, Measure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Goal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.localdb.lifecoach/", name = "goal")
    public JAXBElement<Goal> createGoal(Goal value) {
        return new JAXBElement<Goal>(_Goal_QNAME, Goal.class, null, value);
    }

}

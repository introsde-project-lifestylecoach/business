
package ws.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getBmiResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getBmiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bmi" type="{http://webservice.adaptor.lifecoach/}bmi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBmiResponse", propOrder = {
    "bmi"
})
public class GetBmiResponse {

    protected Bmi bmi;

    /**
     * Recupera il valore della proprietà bmi.
     * 
     * @return
     *     possible object is
     *     {@link Bmi }
     *     
     */
    public Bmi getBmi() {
        return bmi;
    }

    /**
     * Imposta il valore della proprietà bmi.
     * 
     * @param value
     *     allowed object is
     *     {@link Bmi }
     *     
     */
    public void setBmi(Bmi value) {
        this.bmi = value;
    }

}

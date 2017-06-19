
package lifecoach.storage.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readGoal complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readGoal", propOrder = {
    "personId",
    "measureTypeId",
    "goalId"
})
public class ReadGoal {

    protected int personId;
    protected String measureTypeId;
    protected int goalId;

    /**
     * Recupera il valore della proprietà personId.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Imposta il valore della proprietà personId.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Recupera il valore della proprietà measureTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureTypeId() {
        return measureTypeId;
    }

    /**
     * Imposta il valore della proprietà measureTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureTypeId(String value) {
        this.measureTypeId = value;
    }

    /**
     * Recupera il valore della proprietà goalId.
     * 
     */
    public int getGoalId() {
        return goalId;
    }

    /**
     * Imposta il valore della proprietà goalId.
     * 
     */
    public void setGoalId(int value) {
        this.goalId = value;
    }

}

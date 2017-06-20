
package lifecoach.adaptor.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per bmi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bmi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bmi_risk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bmi_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bmi_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bmr_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ideal_weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whr_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bmi", propOrder = {
    "bmiRisk",
    "bmiStatus",
    "bmiValue",
    "bmrValue",
    "idealWeight",
    "whrStatus"
})
public class Bmi {

    @XmlElement(name = "bmi_risk")
    protected String bmiRisk;
    @XmlElement(name = "bmi_status")
    protected String bmiStatus;
    @XmlElement(name = "bmi_value")
    protected double bmiValue;
    @XmlElement(name = "bmr_value")
    protected double bmrValue;
    @XmlElement(name = "ideal_weight")
    protected String idealWeight;
    @XmlElement(name = "whr_status")
    protected String whrStatus;

    /**
     * Recupera il valore della proprietà bmiRisk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmiRisk() {
        return bmiRisk;
    }

    /**
     * Imposta il valore della proprietà bmiRisk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmiRisk(String value) {
        this.bmiRisk = value;
    }

    /**
     * Recupera il valore della proprietà bmiStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmiStatus() {
        return bmiStatus;
    }

    /**
     * Imposta il valore della proprietà bmiStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmiStatus(String value) {
        this.bmiStatus = value;
    }

    /**
     * Recupera il valore della proprietà bmiValue.
     * 
     */
    public double getBmiValue() {
        return bmiValue;
    }

    /**
     * Imposta il valore della proprietà bmiValue.
     * 
     */
    public void setBmiValue(double value) {
        this.bmiValue = value;
    }

    /**
     * Recupera il valore della proprietà bmrValue.
     * 
     */
    public double getBmrValue() {
        return bmrValue;
    }

    /**
     * Imposta il valore della proprietà bmrValue.
     * 
     */
    public void setBmrValue(double value) {
        this.bmrValue = value;
    }

    /**
     * Recupera il valore della proprietà idealWeight.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdealWeight() {
        return idealWeight;
    }

    /**
     * Imposta il valore della proprietà idealWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdealWeight(String value) {
        this.idealWeight = value;
    }

    /**
     * Recupera il valore della proprietà whrStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhrStatus() {
        return whrStatus;
    }

    /**
     * Imposta il valore della proprietà whrStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhrStatus(String value) {
        this.whrStatus = value;
    }

}

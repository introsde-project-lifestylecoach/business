
package ws.adaptor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getBmi complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getBmi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="waist" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="hip" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBmi", propOrder = {
    "weight",
    "height",
    "sex",
    "age",
    "waist",
    "hip"
})
public class GetBmi {

    protected float weight;
    protected float height;
    @XmlSchemaType(name = "unsignedShort")
    protected int sex;
    protected int age;
    protected float waist;
    protected float hip;

    /**
     * Recupera il valore della proprietà weight.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Imposta il valore della proprietà weight.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    /**
     * Recupera il valore della proprietà height.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprietà height.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprietà sex.
     * 
     */
    public int getSex() {
        return sex;
    }

    /**
     * Imposta il valore della proprietà sex.
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

    /**
     * Recupera il valore della proprietà age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Imposta il valore della proprietà age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Recupera il valore della proprietà waist.
     * 
     */
    public float getWaist() {
        return waist;
    }

    /**
     * Imposta il valore della proprietà waist.
     * 
     */
    public void setWaist(float value) {
        this.waist = value;
    }

    /**
     * Recupera il valore della proprietà hip.
     * 
     */
    public float getHip() {
        return hip;
    }

    /**
     * Imposta il valore della proprietà hip.
     * 
     */
    public void setHip(float value) {
        this.hip = value;
    }

}

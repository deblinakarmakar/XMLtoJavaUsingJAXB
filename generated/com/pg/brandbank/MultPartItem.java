//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.02 at 12:11:05 PM EDT 
//


package generated.com.pg.brandbank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultPartItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultPartItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ingredients" type="{http://www.brandbank.com/2007/12}IngredientsType" minOccurs="0"/>
 *         &lt;element name="Nutrition" type="{http://www.brandbank.com/2007/12}NutritionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultPartItem", propOrder = {
    "partName",
    "partNo",
    "ingredients",
    "nutrition"
})
public class MultPartItem {

    @XmlElement(name = "PartName")
    protected String partName;
    @XmlElement(name = "PartNo")
    protected String partNo;
    @XmlElement(name = "Ingredients")
    protected IngredientsType ingredients;
    @XmlElement(name = "Nutrition")
    protected NutritionType nutrition;

    /**
     * Gets the value of the partName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Sets the value of the partName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartName(String value) {
        this.partName = value;
    }

    /**
     * Gets the value of the partNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNo(String value) {
        this.partNo = value;
    }

    /**
     * Gets the value of the ingredients property.
     * 
     * @return
     *     possible object is
     *     {@link IngredientsType }
     *     
     */
    public IngredientsType getIngredients() {
        return ingredients;
    }

    /**
     * Sets the value of the ingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link IngredientsType }
     *     
     */
    public void setIngredients(IngredientsType value) {
        this.ingredients = value;
    }

    /**
     * Gets the value of the nutrition property.
     * 
     * @return
     *     possible object is
     *     {@link NutritionType }
     *     
     */
    public NutritionType getNutrition() {
        return nutrition;
    }

    /**
     * Sets the value of the nutrition property.
     * 
     * @param value
     *     allowed object is
     *     {@link NutritionType }
     *     
     */
    public void setNutrition(NutritionType value) {
        this.nutrition = value;
    }

}

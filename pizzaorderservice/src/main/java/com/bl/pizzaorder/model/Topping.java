//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 11:43:39 PM EDT 
//


package com.bl.pizzaorder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toppingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pizzaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "toppingId",
    "pizzaId",
    "name"
})
@XmlRootElement(name = "topping")
public class Topping {

    protected int toppingId;
    protected int pizzaId;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the toppingId property.
     * 
     */
    public int getToppingId() {
        return toppingId;
    }

    /**
     * Sets the value of the toppingId property.
     * 
     */
    public void setToppingId(int value) {
        this.toppingId = value;
    }

    /**
     * Gets the value of the pizzaId property.
     * 
     */
    public int getPizzaId() {
        return pizzaId;
    }

    /**
     * Sets the value of the pizzaId property.
     * 
     */
    public void setPizzaId(int value) {
        this.pizzaId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}

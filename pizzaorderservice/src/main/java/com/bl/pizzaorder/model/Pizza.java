//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.04 at 11:43:39 PM EDT 
//


package com.bl.pizzaorder.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="pizzaId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://www.example.org/pizzaorder}topping" maxOccurs="unbounded"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pizzaType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pizzaId",
    "orderId",
    "topping",
    "size",
    "pizzaType"
})
@XmlRootElement(name = "pizza")
public class Pizza {

    protected int pizzaId;
    protected int orderId;
    @XmlElement(required = true)
    protected List<Topping> topping;
    @XmlElement(required = true)
    protected String size;
    @XmlElement(required = true)
    protected String pizzaType;

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
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the topping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Topping }
     * 
     * 
     */
    public List<Topping> getTopping() {
        if (topping == null) {
            topping = new ArrayList<Topping>();
        }
        return this.topping;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the pizzaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPizzaType() {
        return pizzaType;
    }

    /**
     * Sets the value of the pizzaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPizzaType(String value) {
        this.pizzaType = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.07 at 02:36:24 PM EDT 
//


package com.uciext.ws.hw3.service.model.catalog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uciext.ws.hw3.service.model.catalog package. 
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

    private final static QName _Price_QNAME = new QName("", "price");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _LastModifiedDate_QNAME = new QName("", "lastModifiedDate");
    private final static QName _Quantity_QNAME = new QName("", "quantity");
    private final static QName _Sku_QNAME = new QName("", "sku");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uciext.ws.hw3.service.model.catalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "price")
    public JAXBElement<Double> createPrice(Double value) {
        return new JAXBElement<Double>(_Price_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastModifiedDate")
    public JAXBElement<String> createLastModifiedDate(String value) {
        return new JAXBElement<String>(_LastModifiedDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "quantity")
    public JAXBElement<Double> createQuantity(Double value) {
        return new JAXBElement<Double>(_Quantity_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sku")
    public JAXBElement<String> createSku(String value) {
        return new JAXBElement<String>(_Sku_QNAME, String.class, null, value);
    }

}


package com.uciext.ws.hw3.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "placeOrder", namespace = "http://uciext.ws.hw3/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeOrder", namespace = "http://uciext.ws.hw3/wsdl")
public class PlaceOrder {

    @XmlElement(name = "order", namespace = "http://uciext.ws.hw3/wsdl")
    private com.uciext.ws.hw3.service.model.order.Order order;

    /**
     * 
     * @return
     *     returns Order
     */
    public com.uciext.ws.hw3.service.model.order.Order getOrder() {
        return this.order;
    }

    /**
     * 
     * @param order
     *     the value for the order property
     */
    public void setOrder(com.uciext.ws.hw3.service.model.order.Order order) {
        this.order = order;
    }

}

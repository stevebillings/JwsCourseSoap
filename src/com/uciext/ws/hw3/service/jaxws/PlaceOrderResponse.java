
package com.uciext.ws.hw3.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "placeOrderResponse", namespace = "http://uciext.ws.hw3/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeOrderResponse", namespace = "http://uciext.ws.hw3/wsdl")
public class PlaceOrderResponse {

    @XmlElement(name = "return", namespace = "")
    private com.uciext.ws.hw3.service.model.orderConfirm.OrderConfirm _return;

    /**
     * 
     * @return
     *     returns OrderConfirm
     */
    public com.uciext.ws.hw3.service.model.orderConfirm.OrderConfirm getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.uciext.ws.hw3.service.model.orderConfirm.OrderConfirm _return) {
        this._return = _return;
    }

}

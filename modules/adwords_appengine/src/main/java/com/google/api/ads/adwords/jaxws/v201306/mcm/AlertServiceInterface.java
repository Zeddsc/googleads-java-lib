
package com.google.api.ads.adwords.jaxws.v201306.mcm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to retrieve alerts relating to managed accounts (such as a
 *       credit card expiring soon or a campaign ending). Each returned
 *       {@linkplain Alert alert} encapsulates a client ID with the alert severity,
 *       type, and any additional details.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AlertServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201306")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201306.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201306.mcm.ObjectFactory.class
})
public interface AlertServiceInterface {


    /**
     * 
     *         Gets the list of alerts matching the specified clients and time period.
     *         
     *         @param selector selects the alerts for which to search.
     *         @return a page of alerts.
     *         @throws ApiException if an error occurs
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201306.mcm.AlertPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201306")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.mcm.AlertServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.mcm.AlertServiceInterfacegetResponse")
    public AlertPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201306")
        AlertSelector selector)
        throws ApiException
    ;

}

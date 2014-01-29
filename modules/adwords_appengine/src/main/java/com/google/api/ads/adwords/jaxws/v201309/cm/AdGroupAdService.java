
package com.google.api.ads.adwords.jaxws.v201309.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdGroupAdService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201309", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201309/AdGroupAdService?wsdl")
public class AdGroupAdService
    extends Service
{

    private final static URL ADGROUPADSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADGROUPADSERVICE_EXCEPTION;
    private final static QName ADGROUPADSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201309", "AdGroupAdService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201309/AdGroupAdService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADGROUPADSERVICE_WSDL_LOCATION = url;
        ADGROUPADSERVICE_EXCEPTION = e;
    }

    public AdGroupAdService() {
        super(__getWsdlLocation(), ADGROUPADSERVICE_QNAME);
    }

    public AdGroupAdService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdGroupAdServiceInterface
     */
    @WebEndpoint(name = "AdGroupAdServiceInterfacePort")
    public AdGroupAdServiceInterface getAdGroupAdServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201309", "AdGroupAdServiceInterfacePort"), AdGroupAdServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdGroupAdServiceInterface
     */
    @WebEndpoint(name = "AdGroupAdServiceInterfacePort")
    public AdGroupAdServiceInterface getAdGroupAdServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201309", "AdGroupAdServiceInterfacePort"), AdGroupAdServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADGROUPADSERVICE_EXCEPTION!= null) {
            throw ADGROUPADSERVICE_EXCEPTION;
        }
        return ADGROUPADSERVICE_WSDL_LOCATION;
    }

}


package com.google.api.ads.dfp.jaxws.v201311;

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
@WebServiceClient(name = "ContentBundleService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201311/ContentBundleService?wsdl")
public class ContentBundleService
    extends Service
{

    private final static URL CONTENTBUNDLESERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTENTBUNDLESERVICE_EXCEPTION;
    private final static QName CONTENTBUNDLESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201311", "ContentBundleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201311/ContentBundleService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTENTBUNDLESERVICE_WSDL_LOCATION = url;
        CONTENTBUNDLESERVICE_EXCEPTION = e;
    }

    public ContentBundleService() {
        super(__getWsdlLocation(), CONTENTBUNDLESERVICE_QNAME);
    }

    public ContentBundleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ContentBundleServiceInterface
     */
    @WebEndpoint(name = "ContentBundleServiceInterfacePort")
    public ContentBundleServiceInterface getContentBundleServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201311", "ContentBundleServiceInterfacePort"), ContentBundleServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContentBundleServiceInterface
     */
    @WebEndpoint(name = "ContentBundleServiceInterfacePort")
    public ContentBundleServiceInterface getContentBundleServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201311", "ContentBundleServiceInterfacePort"), ContentBundleServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTENTBUNDLESERVICE_EXCEPTION!= null) {
            throw CONTENTBUNDLESERVICE_EXCEPTION;
        }
        return CONTENTBUNDLESERVICE_WSDL_LOCATION;
    }

}

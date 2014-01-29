
package com.google.api.ads.adwords.jaxws.v201306.cm;

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
@WebServiceClient(name = "BudgetService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201306/BudgetService?wsdl")
public class BudgetService
    extends Service
{

    private final static URL BUDGETSERVICE_WSDL_LOCATION;
    private final static WebServiceException BUDGETSERVICE_EXCEPTION;
    private final static QName BUDGETSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201306", "BudgetService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201306/BudgetService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BUDGETSERVICE_WSDL_LOCATION = url;
        BUDGETSERVICE_EXCEPTION = e;
    }

    public BudgetService() {
        super(__getWsdlLocation(), BUDGETSERVICE_QNAME);
    }

    public BudgetService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns BudgetServiceInterface
     */
    @WebEndpoint(name = "BudgetServiceInterfacePort")
    public BudgetServiceInterface getBudgetServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201306", "BudgetServiceInterfacePort"), BudgetServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BudgetServiceInterface
     */
    @WebEndpoint(name = "BudgetServiceInterfacePort")
    public BudgetServiceInterface getBudgetServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201306", "BudgetServiceInterfacePort"), BudgetServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BUDGETSERVICE_EXCEPTION!= null) {
            throw BUDGETSERVICE_EXCEPTION;
        }
        return BUDGETSERVICE_WSDL_LOCATION;
    }

}

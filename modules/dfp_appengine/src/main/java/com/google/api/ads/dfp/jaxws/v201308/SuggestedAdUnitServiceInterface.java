
package com.google.api.ads.dfp.jaxws.v201308;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       This service provides operations for retrieving and approving {@link SuggestedAdUnit} objects.
 *       
 *       <p>Publishers may create ad tags that lack a corresponding ad unit defined in DFP, in
 *       order to gather information about potential ads without needing to create dummy ad units and
 *       make them available for targeting in line items.  Any undefined ad unit to receive more than ten
 *       serving requests in the past week is treated as a 'suggested ad unit'. These can be queried by
 *       the client and selectively approved.  Approval causes a new ad unit to be created based on the
 *       suggested ad unit. Unapproved suggested ad units cease to exist whenever their corresponding ad
 *       tag has been served fewer than ten times in the past seven days.
 *       
 *       <p>This service is only available to Premium publishers.  Before use, suggested ad units must be
 *       enabled for the client's network.  This can be done in the UI: in the Inventory tab, click
 *       "Network settings" in the left-hand panel, then enable the checkbox "Get suggestions for new ad
 *       units."  If suggested ad units are not enabled, then {@link #getSuggestedAdUnitsByStatement}
 *       will always return an empty page.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SuggestedAdUnitServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SuggestedAdUnitServiceInterface {


    /**
     * 
     *         Returns the SuggestedAdUnit uniquely identified by the given ID.
     *         
     *         @param suggestedAdUnitId the ID of the {@code SuggestedAdUnit}, which must already exist.
     *       
     * 
     * @param suggestedAdUnitId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnit
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getSuggestedAdUnit", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitServiceInterfacegetSuggestedAdUnit")
    @ResponseWrapper(localName = "getSuggestedAdUnitResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitServiceInterfacegetSuggestedAdUnitResponse")
    public SuggestedAdUnit getSuggestedAdUnit(
        @WebParam(name = "suggestedAdUnitId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        String suggestedAdUnitId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link SuggestedAdUnitPage} of {@link SuggestedAdUnit} objects that
     *         satisfy the filter query.  There is a system-enforced limit of 1000 on the number of suggested
     *         ad units that are suggested at any one time.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         <p><strong>Note:</strong> After API version 201311, the {@code id} field will only be
     *         numerical.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of suggested ad units
     *         @return the suggested ad units that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getSuggestedAdUnitsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitServiceInterfacegetSuggestedAdUnitsByStatement")
    @ResponseWrapper(localName = "getSuggestedAdUnitsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitServiceInterfacegetSuggestedAdUnitsByStatementResponse")
    public SuggestedAdUnitPage getSuggestedAdUnitsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link SuggestedAdUnit} objects that match the given
     *         {@link Statement#query}.  The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SuggestedAdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code numRequests}</td>
     *         <td>{@link SuggestedAdUnit#numRequests}</td>
     *         </tr>
     *         </table>
     *         
     *         @param suggestedAdUnitAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of suggested ad units
     *         @return the result of the action performed
     *       
     * 
     * @param suggestedAdUnitAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitUpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "performSuggestedAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitServiceInterfaceperformSuggestedAdUnitAction")
    @ResponseWrapper(localName = "performSuggestedAdUnitActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.SuggestedAdUnitServiceInterfaceperformSuggestedAdUnitActionResponse")
    public SuggestedAdUnitUpdateResult performSuggestedAdUnitAction(
        @WebParam(name = "suggestedAdUnitAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        SuggestedAdUnitAction suggestedAdUnitAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}

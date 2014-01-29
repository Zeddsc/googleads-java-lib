
package com.google.api.ads.dfp.jaxws.v201308;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for retrieving, submitting and reverting the {@link ReconciliationReport}
 *       objects.
 *       <p>
 *       A {@link ReconciliationReport} is a group of {@link ReconciliationReportRow} objects.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReconciliationReportServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReconciliationReportServiceInterface {


    /**
     * 
     *         Returns the {@link ReconciliationReport} object uniquely identified by given ID.
     *         
     *         @param reconciliationReportId the ID of the reconciliation report, which must already exist
     *         @return the {@code ReconciliationReport} uniquely identified by the given ID
     *       
     * 
     * @param reconciliationReportId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ReconciliationReport
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getReconciliationReport", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfacegetReconciliationReport")
    @ResponseWrapper(localName = "getReconciliationReportResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfacegetReconciliationReportResponse")
    public ReconciliationReport getReconciliationReport(
        @WebParam(name = "reconciliationReportId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Long reconciliationReportId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link ReconciliationReportPage} of {@link ReconciliationReport} objects that satisfy
     *         the given {@link Statement#query}. The following fields are supported for filtering.
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDate}</td>
     *         <td>{@link ReconciliationReport#startDate}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to
     *         filter a set of reconciliation reports
     *         @return the reconciliation reports that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getReconciliationReportsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfacegetReconciliationReportsByStatement")
    @ResponseWrapper(localName = "getReconciliationReportsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfacegetReconciliationReportsByStatementResponse")
    public ReconciliationReportPage getReconciliationReportsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ReconciliationReport}.
     *         
     *         @param reconciliationReport the reconciliation report to be updated
     *         @return the updated reconciliation report
     *       
     * 
     * @param reconciliationReport
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ReconciliationReport
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "updateReconciliationReport", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfaceupdateReconciliationReport")
    @ResponseWrapper(localName = "updateReconciliationReportResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfaceupdateReconciliationReportResponse")
    public ReconciliationReport updateReconciliationReport(
        @WebParam(name = "reconciliationReport", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        ReconciliationReport reconciliationReport)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ReconciliationReport} objects.
     *         
     *         @param reconciliationReports the reconciliation reports to update
     *         @return the updated reconciliation reports
     *         @throws ApiException
     *       
     * 
     * @param reconciliationReports
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201308.ReconciliationReport>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "updateReconciliationReports", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfaceupdateReconciliationReports")
    @ResponseWrapper(localName = "updateReconciliationReportsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ReconciliationReportServiceInterfaceupdateReconciliationReportsResponse")
    public List<ReconciliationReport> updateReconciliationReports(
        @WebParam(name = "reconciliationReports", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        List<ReconciliationReport> reconciliationReports)
        throws ApiException_Exception
    ;

}

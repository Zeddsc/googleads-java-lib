
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
 *       Provides methods for creating, updating and retrieving {@link ActivityGroup} objects.
 *       <p>
 *       An activity group contains {@link Activity} objects. Activities have a one-to-one relationship
 *       with activity groups. Each activity can belong to only one activity group. Activity groups,
 *       however, have a one-to-many relationship with activities, meaning each activity group can have
 *       multiple activities. A activity group can be used to manage the activities it contains.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ActivityGroupServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ActivityGroupServiceInterface {


    /**
     * 
     *         Creates a new {@link ActivityGroup}.
     *         
     *         @param activityGroup the activity group to be created.
     *         @return the created activity group with its ID filled in.
     *       
     * 
     * @param activityGroup
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ActivityGroup
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "createActivityGroup", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacecreateActivityGroup")
    @ResponseWrapper(localName = "createActivityGroupResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacecreateActivityGroupResponse")
    public ActivityGroup createActivityGroup(
        @WebParam(name = "activityGroup", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        ActivityGroup activityGroup)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates a new {@link ActivityGroup} objects.
     *         
     *         @param activityGroups the activity groups to be created.
     *         @return the created activity groups with their IDs filled in.
     *       
     * 
     * @param activityGroups
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201308.ActivityGroup>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "createActivityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacecreateActivityGroups")
    @ResponseWrapper(localName = "createActivityGroupsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacecreateActivityGroupsResponse")
    public List<ActivityGroup> createActivityGroups(
        @WebParam(name = "activityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        List<ActivityGroup> activityGroups)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link ActivityGroup} uniquely identified by the given ID.
     *         
     *         @param activityGroupId the ID of the activity group, which must already exist.
     *         @return the {@code ActivityGroup} uniquely identified by the given ID.
     *       
     * 
     * @param activityGroupId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ActivityGroup
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getActivityGroup", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacegetActivityGroup")
    @ResponseWrapper(localName = "getActivityGroupResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacegetActivityGroupResponse")
    public ActivityGroup getActivityGroup(
        @WebParam(name = "activityGroupId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Integer activityGroupId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link ActivityGroupPage} of {@link ActivityGroup} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ActivityGroup#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ActivityGroup#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code impressionsLookback}</td>
     *         <td>{@link ActivityGroup#impressionsLookback}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code clicksLookback}</td>
     *         <td>{@link ActivityGroup#clicksLookback}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ActivityGroup#status}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a statement used to filter a set of activity groups
     *         @return the activity groups that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ActivityGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getActivityGroupsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacegetActivityGroupsByStatement")
    @ResponseWrapper(localName = "getActivityGroupsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfacegetActivityGroupsByStatementResponse")
    public ActivityGroupPage getActivityGroupsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ActivityGroup}.
     *         
     *         @param activityGroup the activity group to update.
     *         @return the updated activity group.
     *       
     * 
     * @param activityGroup
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ActivityGroup
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "updateActivityGroup", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfaceupdateActivityGroup")
    @ResponseWrapper(localName = "updateActivityGroupResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfaceupdateActivityGroupResponse")
    public ActivityGroup updateActivityGroup(
        @WebParam(name = "activityGroup", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        ActivityGroup activityGroup)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ActivityGroup} objects.
     *         
     *         @param activityGroups the activity groups to update.
     *         @return the updated activity groups.
     *       
     * 
     * @param activityGroups
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201308.ActivityGroup>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "updateActivityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfaceupdateActivityGroups")
    @ResponseWrapper(localName = "updateActivityGroupsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ActivityGroupServiceInterfaceupdateActivityGroupsResponse")
    public List<ActivityGroup> updateActivityGroups(
        @WebParam(name = "activityGroups", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        List<ActivityGroup> activityGroups)
        throws ApiException_Exception
    ;

}

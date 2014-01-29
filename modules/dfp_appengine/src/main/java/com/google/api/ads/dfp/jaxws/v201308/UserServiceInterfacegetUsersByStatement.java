
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link UserPage} of {@link User} objects that satisfy the given
 *             {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code email}</td>
 *             <td>{@link User#email}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link User#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code name}</td>
 *             <td>{@link User#name}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code roleId}</td>
 *             <td>{@link User#roleId}
 *             </tr>
 *             <tr>
 *             <td>{@code rolename}</td>
 *             <td>{@link User#roleName}
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@code ACTIVE} if {@link User#isActive} is true; {@code INACTIVE}
 *             otherwise</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of users
 *             @return the users that match the given filter
 *           
 * 
 * <p>Java class for getUsersByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getUsersByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201308}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterStatement"
})
@XmlRootElement(name = "getUsersByStatement")
public class UserServiceInterfacegetUsersByStatement {

    protected Statement filterStatement;

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}

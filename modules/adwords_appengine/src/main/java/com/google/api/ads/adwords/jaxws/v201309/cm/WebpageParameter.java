
package com.google.api.ads.adwords.jaxws.v201309.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Parameter of Webpage criterion, expressed as a list of conditions, or
 *             logical expressions, for targeting webpages of an advertiser's website.
 *           
 * 
 * <p>Java class for WebpageParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebpageParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}CriterionParameter">
 *       &lt;sequence>
 *         &lt;element name="criterionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conditions" type="{https://adwords.google.com/api/adwords/cm/v201309}WebpageCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebpageParameter", propOrder = {
    "criterionName",
    "conditions"
})
public class WebpageParameter
    extends CriterionParameter
{

    protected String criterionName;
    protected List<WebpageCondition> conditions;

    /**
     * Gets the value of the criterionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionName() {
        return criterionName;
    }

    /**
     * Sets the value of the criterionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionName(String value) {
        this.criterionName = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebpageCondition }
     * 
     * 
     */
    public List<WebpageCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<WebpageCondition>();
        }
        return this.conditions;
    }

}

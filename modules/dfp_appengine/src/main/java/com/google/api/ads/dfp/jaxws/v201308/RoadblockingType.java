
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadblockingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadblockingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONLY_ONE"/>
 *     &lt;enumeration value="ONE_OR_MORE"/>
 *     &lt;enumeration value="AS_MANY_AS_POSSIBLE"/>
 *     &lt;enumeration value="ALL_ROADBLOCK"/>
 *     &lt;enumeration value="CREATIVE_SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadblockingType")
@XmlEnum
public enum RoadblockingType {


    /**
     * 
     *                 Only one creative from a line item can serve at a time.
     *               
     * 
     */
    ONLY_ONE,

    /**
     * 
     *                 Any number of creatives from a line item can serve together at a time.
     *               
     * 
     */
    ONE_OR_MORE,

    /**
     * 
     *                 As many creatives from a line item as can fit on a page will serve. This
     *                 could mean anywhere from one to all of a line item's creatives given the
     *                 size constraints of ad slots on a page.
     *               
     * 
     */
    AS_MANY_AS_POSSIBLE,

    /**
     * 
     *                 All or none of the creatives from a line item will serve. This option will only work if
     *                 served to a GPT tag using SRA (single request architecture mode).
     *               
     * 
     */
    ALL_ROADBLOCK,

    /**
     * 
     *                 A master/companion {@link CreativeSet} roadblocking type.
     *                 A {@link LineItem#creativePlaceholders} must be set accordingly.
     *               
     * 
     */
    CREATIVE_SET;

    public String value() {
        return name();
    }

    public static RoadblockingType fromValue(String v) {
        return valueOf(v);
    }

}

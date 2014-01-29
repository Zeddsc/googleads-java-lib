/**
 * FeedMappingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public class FeedMappingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedMappingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_PLACEHOLDER_FIELD = "INVALID_PLACEHOLDER_FIELD";
    public static final java.lang.String _INVALID_PLACEHOLDER_TYPE = "INVALID_PLACEHOLDER_TYPE";
    public static final java.lang.String _NO_ATTRIBUTE_FIELD_MAPPINGS = "NO_ATTRIBUTE_FIELD_MAPPINGS";
    public static final java.lang.String _FEED_ATTRIBUTE_TYPE_MISMATCH = "FEED_ATTRIBUTE_TYPE_MISMATCH";
    public static final java.lang.String _MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE = "MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedMappingErrorReason INVALID_PLACEHOLDER_FIELD = new FeedMappingErrorReason(_INVALID_PLACEHOLDER_FIELD);
    public static final FeedMappingErrorReason INVALID_PLACEHOLDER_TYPE = new FeedMappingErrorReason(_INVALID_PLACEHOLDER_TYPE);
    public static final FeedMappingErrorReason NO_ATTRIBUTE_FIELD_MAPPINGS = new FeedMappingErrorReason(_NO_ATTRIBUTE_FIELD_MAPPINGS);
    public static final FeedMappingErrorReason FEED_ATTRIBUTE_TYPE_MISMATCH = new FeedMappingErrorReason(_FEED_ATTRIBUTE_TYPE_MISMATCH);
    public static final FeedMappingErrorReason MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE = new FeedMappingErrorReason(_MULTIPLE_MAPPINGS_FOR_PLACEHOLDER_TYPE);
    public static final FeedMappingErrorReason UNKNOWN = new FeedMappingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedMappingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedMappingErrorReason enumeration = (FeedMappingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedMappingErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedMappingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedMappingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

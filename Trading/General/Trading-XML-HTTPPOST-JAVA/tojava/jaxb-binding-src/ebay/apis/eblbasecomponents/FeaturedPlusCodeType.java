//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturedPlusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeaturedPlusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="PowerSellerOnly"/>
 *     &lt;enumeration value="TopRatedSellerOnly"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeaturedPlusCodeType")
@XmlEnum
public enum FeaturedPlusCodeType {


    /**
     * 
     * 						The listing feature is enabled for the site.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						The listing feature is disabled for the site.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						The listing feature is restricted to PowerSellers.
     * 					
     * 
     */
    @XmlEnumValue("PowerSellerOnly")
    POWER_SELLER_ONLY("PowerSellerOnly"),

    /**
     * 
     * 						The listing feature is restricted to TopRatedSellers.
     * 					
     * 
     */
    @XmlEnumValue("TopRatedSellerOnly")
    TOP_RATED_SELLER_ONLY("TopRatedSellerOnly"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeaturedPlusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeaturedPlusCodeType fromValue(String v) {
        for (FeaturedPlusCodeType c: FeaturedPlusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

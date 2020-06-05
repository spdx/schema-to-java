
package spdxxml;

/** 
 * A data type for the level of risk associated with a software artifact
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RiskCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="low"/>
 *     &lt;xs:enumeration value="medium"/>
 *     &lt;xs:enumeration value="high"/>
 *     &lt;xs:enumeration value="critical"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum RiskCodeSimpleType {
    /** 
     * low
     */
    LOW("low"), /** 
                 * medium
                 */
    MEDIUM("medium"), /** 
                       * high
                       */
    HIGH("high"), /** 
                   * critical
                   */
    CRITICAL("critical");
    private final String value;

    private RiskCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static RiskCodeSimpleType convert(String value) {
        for (RiskCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

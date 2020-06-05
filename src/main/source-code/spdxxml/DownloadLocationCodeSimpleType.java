
package spdxxml;

/** 
 * A data type for DownloadLocation properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DownloadLocationCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="Noassertion"/>
 *     &lt;xs:enumeration value="None"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum DownloadLocationCodeSimpleType {
    /** 
     * Indicates that the preparer of the SPDX document is not making any assertion regarding the value of this field.
     */
    NOASSERTION("Noassertion"), /** 
                                 * When this value is used as the object of a property it indicates that the preparer of the SpdxDocument believes that there is no value for the property. This value
                                should only be used if there is sufficient evidence to support this assertion.
                                 */
    NONE("None");
    private final String value;

    private DownloadLocationCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static DownloadLocationCodeSimpleType convert(String value) {
        for (DownloadLocationCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

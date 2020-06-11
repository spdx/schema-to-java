
package spdxxml;

/** 
 * A data type for LicenseInfoFromFiles properties
 */
public enum LicenseInfoFromFilesCodeSimpleType {
    /** 
     * Indicates that the preparer of the SPDX document is not making any assertion regarding the value of this field.
     */
    NOASSERTION("Noassertion"), /** 
                                 * When this value is used as the object of a property it indicates that the preparer of the SpdxDocument believes that there is no value for the property. This value
                                should only be used if there is sufficient evidence to support this assertion.
                                 */
    NONE("None");
    private final String value;

    private LicenseInfoFromFilesCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static LicenseInfoFromFilesCodeSimpleType convert(String value) {
        for (LicenseInfoFromFilesCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

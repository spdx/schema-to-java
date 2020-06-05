
package spdxxml;

/** 
 * A data type for Algorithm properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AlgorithmCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="ChecksumAlgorithmMd5"/>
 *     &lt;xs:enumeration value="ChecksumAlgorithmSha1"/>
 *     &lt;xs:enumeration value="ChecksumAlgorithmSha256"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum AlgorithmCodeSimpleType {
    /** 
     * Indicates the algorithm used was MD5
     */
    CHECKSUM_ALGORITHM_MD5("ChecksumAlgorithmMd5"), /** 
                                                     * Indicates the algorithm used was SHA-1
                                                     */
    CHECKSUM_ALGORITHM_SHA1("ChecksumAlgorithmSha1"), /** 
                                                       * Indicates the algorithm used was SHA256
                                                       */
    CHECKSUM_ALGORITHM_SHA256("ChecksumAlgorithmSha256");
    private final String value;

    private AlgorithmCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static AlgorithmCodeSimpleType convert(String value) {
        for (AlgorithmCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

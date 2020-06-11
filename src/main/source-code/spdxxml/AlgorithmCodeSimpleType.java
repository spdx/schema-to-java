
package spdxxml;

/** 
 * A data type for Algorithm properties
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

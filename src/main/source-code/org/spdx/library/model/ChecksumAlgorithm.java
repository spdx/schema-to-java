
package org.spdx.library.model;

/** 
 * Algorighm for Checksums.
 */
public enum ChecksumAlgorithm implements IndividualUriValue {
    /** 
     * Indicates the algorithm used was MD5
     */
    md5("checksumAlgorithm_md5"), /** 
                                   * Indicates the algorithm used was MD6
                                   */
    md6("checksumAlgorithm_md6"), /** 
                                   * Indicates the algorithm used was MD4
                                   */
    md4("checksumAlgorithm_md4"), /** 
                                   * Indicates the algorithm used was SHA224
                                   */
    sha224("checksumAlgorithm_sha224"), /** 
                                         * Indicates the algorithm used was MD2
                                         */
    md2("checksumAlgorithm_md2"), /** 
                                   * Indicates the algorithm used was SHA-1
                                   */
    sha1("checksumAlgorithm_sha1"), /** 
                                     * Indicates the algorithm used was SHA384
                                     */
    sha384("checksumAlgorithm_sha384"), /** 
                                         * Indicates the algorithm used was SHA256
                                         */
    sha256("checksumAlgorithm_sha256"), /** 
                                         * Indicates the algorithm used was SHA512
                                         */
    sha512("checksumAlgorithm_sha512");
    private String longName;
    private final String value;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }

    private ChecksumAlgorithm(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static ChecksumAlgorithm convert(String value) {
        for (ChecksumAlgorithm inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

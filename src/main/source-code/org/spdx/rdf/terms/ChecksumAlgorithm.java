
package org.spdx.rdf.terms;

/** 
 * Algorighm for Checksums.
 */
public enum ChecksumAlgorithm {
    /** 
     * Indicates the algorithm used was MD5
     */
    CHECKSUM_ALGORITHM_MD5("checksumAlgorithm_md5"), /** 
                                                      * Indicates the algorithm used was MD6
                                                      */
    CHECKSUM_ALGORITHM_MD6("checksumAlgorithm_md6"), /** 
                                                      * Indicates the algorithm used was MD4
                                                      */
    CHECKSUM_ALGORITHM_MD4("checksumAlgorithm_md4"), /** 
                                                      * Indicates the algorithm used was SHA224
                                                      */
    CHECKSUM_ALGORITHM_SHA224("checksumAlgorithm_sha224"), /** 
                                                            * Indicates the algorithm used was MD2
                                                            */
    CHECKSUM_ALGORITHM_MD2("checksumAlgorithm_md2"), /** 
                                                      * Indicates the algorithm used was SHA-1
                                                      */
    CHECKSUM_ALGORITHM_SHA1("checksumAlgorithm_sha1"), /** 
                                                        * Indicates the algorithm used was SHA384
                                                        */
    CHECKSUM_ALGORITHM_SHA384("checksumAlgorithm_sha384"), /** 
                                                            * Indicates the algorithm used was SHA256
                                                            */
    CHECKSUM_ALGORITHM_SHA256("checksumAlgorithm_sha256"), /** 
                                                            * Indicates the algorithm used was SHA512
                                                            */
    CHECKSUM_ALGORITHM_SHA512("checksumAlgorithm_sha512");
    private final String value;

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

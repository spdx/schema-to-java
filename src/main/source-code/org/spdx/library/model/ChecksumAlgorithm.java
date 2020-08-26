
package org.spdx.library.model;

/** 
 * Algorighm for Checksums.
 */
public enum ChecksumAlgorithm implements IndividualUriValue {
    /** 
     * Indicates the algorithm used was MD5
     */
    checksumAlgorithm_md5, /** 
                            * Indicates the algorithm used was MD6
                            */
    checksumAlgorithm_md6, /** 
                            * Indicates the algorithm used was MD4
                            */
    checksumAlgorithm_md4, /** 
                            * Indicates the algorithm used was SHA224
                            */
    checksumAlgorithm_sha224, /** 
                               * Indicates the algorithm used was MD2
                               */
    checksumAlgorithm_md2, /** 
                            * Indicates the algorithm used was SHA-1
                            */
    checksumAlgorithm_sha1, /** 
                             * Indicates the algorithm used was SHA384
                             */
    checksumAlgorithm_sha384, /** 
                               * Indicates the algorithm used was SHA256
                               */
    checksumAlgorithm_sha256, /** 
                               * Indicates the algorithm used was SHA512
                               */
    checksumAlgorithm_sha512;
    private String longName;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }
}

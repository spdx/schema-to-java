
package org.spdx.library.model;

/** 
 * A Checksum is value that allows the contents of a file to be authenticated. Even small changes to the content of the file will change its checksum. This class allows the results of a variety of checksum and cryptographic message digest algorithms to be represented.
 */
public class Checksum extends ModelObject
{
    private ChecksumAlgorithm algorithm;
    private byte[] checksumValue;

    Checksum(String Id) {
        super(Id);
    }

    Checksum(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "Checksum";
    }

    /** 
     * Get the 'algorithm' element value. Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.
     * 
     * @return value
     */
    public ChecksumAlgorithm getAlgorithm() {
        return algorithm;
    }

    /** 
     * Set the 'algorithm' element value. Identifies the algorithm used to produce the subject Checksum. Currently, SHA-1 is the only supported algorithm. It is anticipated that other algorithms will be supported at a later time.
     * 
     * @param algorithm
     */
    public void setAlgorithm(ChecksumAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    /** 
     * Get the 'checksumValue' element value. The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.
     * 
     * @return value
     */
    public byte[] getChecksumValue() {
        return checksumValue;
    }

    /** 
     * Set the 'checksumValue' element value. The checksumValue property provides a lower case hexidecimal encoded digest value produced using a specific algorithm.
     * 
     * @param checksumValue
     */
    public void setChecksumValue(byte[] checksumValue) {
        this.checksumValue = checksumValue;
    }
}

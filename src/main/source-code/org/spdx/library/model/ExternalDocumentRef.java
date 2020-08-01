
package org.spdx.library.model;

/** 
 * Information about an external SPDX document reference including the checksum. This allows for verification of the external references.
 */
public class ExternalDocumentRef extends ModelObject
{
    private String externalDocumentId;
    private Checksum checksum;
    private SpdxDocument spdxDocument;

    /** 
     * Get the 'externalDocumentId' element value. externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.
     * 
     * @return value
     */
    public String getExternalDocumentId() {
        return externalDocumentId;
    }

    /** 
     * Set the 'externalDocumentId' element value. externalDocumentId is a string containing letters, numbers, ., - and/or + which uniquely identifies an external document within this document.
     * 
     * @param externalDocumentId
     */
    public void setExternalDocumentId(String externalDocumentId) {
        this.externalDocumentId = externalDocumentId;
    }

    /** 
     * Get the 'checksum' element value. The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * 
     * @return value
     */
    public Checksum getChecksum() {
        return checksum;
    }

    /** 
     * Set the 'checksum' element value. The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
     * 
     * @param checksum
     */
    public void setChecksum(Checksum checksum) {
        this.checksum = checksum;
    }

    /** 
     * Get the 'spdxDocument' element value. A propoerty containing an SPDX document.
     * 
     * @return value
     */
    public SpdxDocument getSpdxDocument() {
        return spdxDocument;
    }

    /** 
     * Set the 'spdxDocument' element value. A propoerty containing an SPDX document.
     * 
     * @param spdxDocument
     */
    public void setSpdxDocument(SpdxDocument spdxDocument) {
        this.spdxDocument = spdxDocument;
    }
}

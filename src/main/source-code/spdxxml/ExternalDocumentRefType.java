
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ExternalDocumentRef type
 */
public class ExternalDocumentRefType extends ObjectType
{
    private ChecksumType checksum;
    private ExternalDocumentIDType externalDocumentID;
    private SpdxDocumentID spdxDocumentID;
    private List<ExternalDocumentRefAugmentationPoint> externalDocumentRefAugmentationPointList = new ArrayList<ExternalDocumentRefAugmentationPoint>();

    /** 
     * Get the 'Checksum' element value.
     * 
     * @return value
     */
    public ChecksumType getChecksum() {
        return checksum;
    }

    /** 
     * Set the 'Checksum' element value.
     * 
     * @param checksum
     */
    public void setChecksum(ChecksumType checksum) {
        this.checksum = checksum;
    }

    /** 
     * Get the 'ExternalDocumentID' element value.
     * 
     * @return value
     */
    public ExternalDocumentIDType getExternalDocumentID() {
        return externalDocumentID;
    }

    /** 
     * Set the 'ExternalDocumentID' element value.
     * 
     * @param externalDocumentID
     */
    public void setExternalDocumentID(ExternalDocumentIDType externalDocumentID) {
        this.externalDocumentID = externalDocumentID;
    }

    /** 
     * Get the 'SpdxDocumentID' element value.
     * 
     * @return value
     */
    public SpdxDocumentID getSpdxDocumentID() {
        return spdxDocumentID;
    }

    /** 
     * Set the 'SpdxDocumentID' element value.
     * 
     * @param spdxDocumentID
     */
    public void setSpdxDocumentID(SpdxDocumentID spdxDocumentID) {
        this.spdxDocumentID = spdxDocumentID;
    }

    /** 
     * Get the list of 'ExternalDocumentRefAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ExternalDocumentRefAugmentationPoint> getExternalDocumentRefAugmentationPointList() {
        return externalDocumentRefAugmentationPointList;
    }

    /** 
     * Set the list of 'ExternalDocumentRefAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setExternalDocumentRefAugmentationPointList(
            List<ExternalDocumentRefAugmentationPoint> list) {
        externalDocumentRefAugmentationPointList = list;
    }
}

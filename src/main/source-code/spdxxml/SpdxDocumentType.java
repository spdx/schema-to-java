
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SpdxDocument type
 */
public class SpdxDocumentType extends SpdxElementType
{
    private DescribesPackageID describesPackageID;
    private DescribesFileID describesFileID;
    private HasExtractedLicensingInfoID hasExtractedLicensingInfoID;
    private CreationInfoType creationInfo;
    private SpecVersionTextType specVersionText;
    private ExternalDocumentRefType externalDocumentRef;
    private DataLicenseID dataLicenseID;
    private List<SpdxDocumentAugmentationPoint> spdxDocumentAugmentationPointList = new ArrayList<SpdxDocumentAugmentationPoint>();

    /** 
     * Get the 'DescribesPackageID' element value.
     * 
     * @return value
     */
    public DescribesPackageID getDescribesPackageID() {
        return describesPackageID;
    }

    /** 
     * Set the 'DescribesPackageID' element value.
     * 
     * @param describesPackageID
     */
    public void setDescribesPackageID(DescribesPackageID describesPackageID) {
        this.describesPackageID = describesPackageID;
    }

    /** 
     * Get the 'DescribesFileID' element value.
     * 
     * @return value
     */
    public DescribesFileID getDescribesFileID() {
        return describesFileID;
    }

    /** 
     * Set the 'DescribesFileID' element value.
     * 
     * @param describesFileID
     */
    public void setDescribesFileID(DescribesFileID describesFileID) {
        this.describesFileID = describesFileID;
    }

    /** 
     * Get the 'HasExtractedLicensingInfoID' element value.
     * 
     * @return value
     */
    public HasExtractedLicensingInfoID getHasExtractedLicensingInfoID() {
        return hasExtractedLicensingInfoID;
    }

    /** 
     * Set the 'HasExtractedLicensingInfoID' element value.
     * 
     * @param hasExtractedLicensingInfoID
     */
    public void setHasExtractedLicensingInfoID(
            HasExtractedLicensingInfoID hasExtractedLicensingInfoID) {
        this.hasExtractedLicensingInfoID = hasExtractedLicensingInfoID;
    }

    /** 
     * Get the 'CreationInfo' element value.
     * 
     * @return value
     */
    public CreationInfoType getCreationInfo() {
        return creationInfo;
    }

    /** 
     * Set the 'CreationInfo' element value.
     * 
     * @param creationInfo
     */
    public void setCreationInfo(CreationInfoType creationInfo) {
        this.creationInfo = creationInfo;
    }

    /** 
     * Get the 'SpecVersionText' element value.
     * 
     * @return value
     */
    public SpecVersionTextType getSpecVersionText() {
        return specVersionText;
    }

    /** 
     * Set the 'SpecVersionText' element value.
     * 
     * @param specVersionText
     */
    public void setSpecVersionText(SpecVersionTextType specVersionText) {
        this.specVersionText = specVersionText;
    }

    /** 
     * Get the 'ExternalDocumentRef' element value.
     * 
     * @return value
     */
    public ExternalDocumentRefType getExternalDocumentRef() {
        return externalDocumentRef;
    }

    /** 
     * Set the 'ExternalDocumentRef' element value.
     * 
     * @param externalDocumentRef
     */
    public void setExternalDocumentRef(
            ExternalDocumentRefType externalDocumentRef) {
        this.externalDocumentRef = externalDocumentRef;
    }

    /** 
     * Get the 'DataLicenseID' element value.
     * 
     * @return value
     */
    public DataLicenseID getDataLicenseID() {
        return dataLicenseID;
    }

    /** 
     * Set the 'DataLicenseID' element value.
     * 
     * @param dataLicenseID
     */
    public void setDataLicenseID(DataLicenseID dataLicenseID) {
        this.dataLicenseID = dataLicenseID;
    }

    /** 
     * Get the list of 'SpdxDocumentAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<SpdxDocumentAugmentationPoint> getSpdxDocumentAugmentationPointList() {
        return spdxDocumentAugmentationPointList;
    }

    /** 
     * Set the list of 'SpdxDocumentAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setSpdxDocumentAugmentationPointList(
            List<SpdxDocumentAugmentationPoint> list) {
        spdxDocumentAugmentationPointList = list;
    }
}


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SpdxItem type
 */
public class SpdxItemType extends SpdxElementType
{
    private LicenseConcludedCodeType licenseConcludedCode;
    private CopyrightTextType copyrightText;
    private LicenseInfoFromFiles licenseInfoFromFiles;
    private LicenseCommentsTextType licenseCommentsText;
    private List<SpdxItemAugmentationPoint> spdxItemAugmentationPointList = new ArrayList<SpdxItemAugmentationPoint>();

    /** 
     * Get the 'LicenseConcludedCode' element value.
     * 
     * @return value
     */
    public LicenseConcludedCodeType getLicenseConcludedCode() {
        return licenseConcludedCode;
    }

    /** 
     * Set the 'LicenseConcludedCode' element value.
     * 
     * @param licenseConcludedCode
     */
    public void setLicenseConcludedCode(
            LicenseConcludedCodeType licenseConcludedCode) {
        this.licenseConcludedCode = licenseConcludedCode;
    }

    /** 
     * Get the 'CopyrightText' element value.
     * 
     * @return value
     */
    public CopyrightTextType getCopyrightText() {
        return copyrightText;
    }

    /** 
     * Set the 'CopyrightText' element value.
     * 
     * @param copyrightText
     */
    public void setCopyrightText(CopyrightTextType copyrightText) {
        this.copyrightText = copyrightText;
    }

    /** 
     * Get the 'LicenseInfoFromFiles' element value.
     * 
     * @return value
     */
    public LicenseInfoFromFiles getLicenseInfoFromFiles() {
        return licenseInfoFromFiles;
    }

    /** 
     * Set the 'LicenseInfoFromFiles' element value.
     * 
     * @param licenseInfoFromFiles
     */
    public void setLicenseInfoFromFiles(
            LicenseInfoFromFiles licenseInfoFromFiles) {
        this.licenseInfoFromFiles = licenseInfoFromFiles;
    }

    /** 
     * Get the 'LicenseCommentsText' element value.
     * 
     * @return value
     */
    public LicenseCommentsTextType getLicenseCommentsText() {
        return licenseCommentsText;
    }

    /** 
     * Set the 'LicenseCommentsText' element value.
     * 
     * @param licenseCommentsText
     */
    public void setLicenseCommentsText(
            LicenseCommentsTextType licenseCommentsText) {
        this.licenseCommentsText = licenseCommentsText;
    }

    /** 
     * Get the list of 'SpdxItemAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<SpdxItemAugmentationPoint> getSpdxItemAugmentationPointList() {
        return spdxItemAugmentationPointList;
    }

    /** 
     * Set the list of 'SpdxItemAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setSpdxItemAugmentationPointList(
            List<SpdxItemAugmentationPoint> list) {
        spdxItemAugmentationPointList = list;
    }
}

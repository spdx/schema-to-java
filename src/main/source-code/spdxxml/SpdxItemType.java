
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SpdxItem type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpdxItemType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SpdxElementType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LicenseConcludedCode"/>
 *         &lt;xs:element ref="ns:CopyrightText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:LicenseInfoFromFiles" minOccurs="1"/>
 *         &lt;xs:element ref="ns:LicenseCommentsText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SpdxItemAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

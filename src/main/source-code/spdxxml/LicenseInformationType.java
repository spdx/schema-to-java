
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software license information for a software artifact or source repository
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LicenseInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LicenseCategoryCode"/>
 *         &lt;xs:element ref="ns:LicenseCode" minOccurs="1" maxOccurs="20"/>
 *         &lt;xs:element ref="ns:EndOfLifeIndicator"/>
 *         &lt;xs:element ref="ns:LicenseInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LicenseInformationType extends ObjectType
{
    private LicenseCategoryCodeType licenseCategoryCode;
    private List<LicenseCodeType> licenseCodeList = new ArrayList<LicenseCodeType>();
    private EndOfLifeIndicatorType endOfLifeIndicator;
    private List<LicenseInformationAugmentationPoint> licenseInformationAugmentationPointList = new ArrayList<LicenseInformationAugmentationPoint>();

    /** 
     * Get the 'LicenseCategoryCode' element value. A data item for a software license category
     * 
     * @return value
     */
    public LicenseCategoryCodeType getLicenseCategoryCode() {
        return licenseCategoryCode;
    }

    /** 
     * Set the 'LicenseCategoryCode' element value. A data item for a software license category
     * 
     * @param licenseCategoryCode
     */
    public void setLicenseCategoryCode(
            LicenseCategoryCodeType licenseCategoryCode) {
        this.licenseCategoryCode = licenseCategoryCode;
    }

    /** 
     * Get the list of 'LicenseCode' element items. A data item for a type of software license
     * 
     * @return list
     */
    public List<LicenseCodeType> getLicenseCodeList() {
        return licenseCodeList;
    }

    /** 
     * Set the list of 'LicenseCode' element items. A data item for a type of software license
     * 
     * @param list
     */
    public void setLicenseCodeList(List<LicenseCodeType> list) {
        licenseCodeList = list;
    }

    /** 
     * Get the 'EndOfLifeIndicator' element value. True if software has end of life status; false if not.
     * 
     * @return value
     */
    public EndOfLifeIndicatorType getEndOfLifeIndicator() {
        return endOfLifeIndicator;
    }

    /** 
     * Set the 'EndOfLifeIndicator' element value. True if software has end of life status; false if not.
     * 
     * @param endOfLifeIndicator
     */
    public void setEndOfLifeIndicator(EndOfLifeIndicatorType endOfLifeIndicator) {
        this.endOfLifeIndicator = endOfLifeIndicator;
    }

    /** 
     * Get the list of 'LicenseInformationAugmentationPoint' element items. An augmentation point for LicenseInformationType
     * 
     * @return list
     */
    public List<LicenseInformationAugmentationPoint> getLicenseInformationAugmentationPointList() {
        return licenseInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'LicenseInformationAugmentationPoint' element items. An augmentation point for LicenseInformationType
     * 
     * @param list
     */
    public void setLicenseInformationAugmentationPointList(
            List<LicenseInformationAugmentationPoint> list) {
        licenseInformationAugmentationPointList = list;
    }
}

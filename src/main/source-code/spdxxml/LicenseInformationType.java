
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software license information for a software artifact or source repository
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

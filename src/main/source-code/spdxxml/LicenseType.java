
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for License type
 */
public class LicenseType extends SimpleLicensingInfoType
{
    private IsDeprecatedLicenseIDType isDeprecatedLicenseID;
    private IsOsiApprovedIndicatorType isOsiApprovedIndicator;
    private IsFsfLibreType isFsfLibreIndicator;
    private StandardLicenseHeaderTextType standardLicenseHeaderText;
    private LicenseTextType licenseText;
    private StandardLicenseTemplateTextType standardLicenseTemplateText;
    private List<LicenseAugmentationPoint> licenseAugmentationPointList = new ArrayList<LicenseAugmentationPoint>();

    /** 
     * Get the 'IsDeprecatedLicenseID' element value.
     * 
     * @return value
     */
    public IsDeprecatedLicenseIDType getIsDeprecatedLicenseID() {
        return isDeprecatedLicenseID;
    }

    /** 
     * Set the 'IsDeprecatedLicenseID' element value.
     * 
     * @param isDeprecatedLicenseID
     */
    public void setIsDeprecatedLicenseID(
            IsDeprecatedLicenseIDType isDeprecatedLicenseID) {
        this.isDeprecatedLicenseID = isDeprecatedLicenseID;
    }

    /** 
     * Get the 'IsOsiApprovedIndicator' element value.
     * 
     * @return value
     */
    public IsOsiApprovedIndicatorType getIsOsiApprovedIndicator() {
        return isOsiApprovedIndicator;
    }

    /** 
     * Set the 'IsOsiApprovedIndicator' element value.
     * 
     * @param isOsiApprovedIndicator
     */
    public void setIsOsiApprovedIndicator(
            IsOsiApprovedIndicatorType isOsiApprovedIndicator) {
        this.isOsiApprovedIndicator = isOsiApprovedIndicator;
    }

    /** 
     * Get the 'IsFsfLibreIndicator' element value.
     * 
     * @return value
     */
    public IsFsfLibreType getIsFsfLibreIndicator() {
        return isFsfLibreIndicator;
    }

    /** 
     * Set the 'IsFsfLibreIndicator' element value.
     * 
     * @param isFsfLibreIndicator
     */
    public void setIsFsfLibreIndicator(IsFsfLibreType isFsfLibreIndicator) {
        this.isFsfLibreIndicator = isFsfLibreIndicator;
    }

    /** 
     * Get the 'StandardLicenseHeaderText' element value.
     * 
     * @return value
     */
    public StandardLicenseHeaderTextType getStandardLicenseHeaderText() {
        return standardLicenseHeaderText;
    }

    /** 
     * Set the 'StandardLicenseHeaderText' element value.
     * 
     * @param standardLicenseHeaderText
     */
    public void setStandardLicenseHeaderText(
            StandardLicenseHeaderTextType standardLicenseHeaderText) {
        this.standardLicenseHeaderText = standardLicenseHeaderText;
    }

    /** 
     * Get the 'LicenseText' element value.
     * 
     * @return value
     */
    public LicenseTextType getLicenseText() {
        return licenseText;
    }

    /** 
     * Set the 'LicenseText' element value.
     * 
     * @param licenseText
     */
    public void setLicenseText(LicenseTextType licenseText) {
        this.licenseText = licenseText;
    }

    /** 
     * Get the 'StandardLicenseTemplateText' element value.
     * 
     * @return value
     */
    public StandardLicenseTemplateTextType getStandardLicenseTemplateText() {
        return standardLicenseTemplateText;
    }

    /** 
     * Set the 'StandardLicenseTemplateText' element value.
     * 
     * @param standardLicenseTemplateText
     */
    public void setStandardLicenseTemplateText(
            StandardLicenseTemplateTextType standardLicenseTemplateText) {
        this.standardLicenseTemplateText = standardLicenseTemplateText;
    }

    /** 
     * Get the list of 'LicenseAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<LicenseAugmentationPoint> getLicenseAugmentationPointList() {
        return licenseAugmentationPointList;
    }

    /** 
     * Set the list of 'LicenseAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setLicenseAugmentationPointList(
            List<LicenseAugmentationPoint> list) {
        licenseAugmentationPointList = list;
    }
}


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ExtractedLicenseInfo type
 */
public class ExtractedLicenseInfoType extends SimpleLicensingInfoType
{
    private ExtractedTextType extractedText;
    private List<ExtractedLicenseInfoAugmentationPoint> extractedLicenseInfoAugmentationPointList = new ArrayList<ExtractedLicenseInfoAugmentationPoint>();

    /** 
     * Get the 'ExtractedText' element value.
     * 
     * @return value
     */
    public ExtractedTextType getExtractedText() {
        return extractedText;
    }

    /** 
     * Set the 'ExtractedText' element value.
     * 
     * @param extractedText
     */
    public void setExtractedText(ExtractedTextType extractedText) {
        this.extractedText = extractedText;
    }

    /** 
     * Get the list of 'ExtractedLicenseInfoAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ExtractedLicenseInfoAugmentationPoint> getExtractedLicenseInfoAugmentationPointList() {
        return extractedLicenseInfoAugmentationPointList;
    }

    /** 
     * Set the list of 'ExtractedLicenseInfoAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setExtractedLicenseInfoAugmentationPointList(
            List<ExtractedLicenseInfoAugmentationPoint> list) {
        extractedLicenseInfoAugmentationPointList = list;
    }
}

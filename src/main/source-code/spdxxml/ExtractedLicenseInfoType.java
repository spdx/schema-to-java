
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ExtractedLicenseInfo type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtractedLicenseInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SimpleLicensingInfoType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ExtractedText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ExtractedLicenseInfoAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

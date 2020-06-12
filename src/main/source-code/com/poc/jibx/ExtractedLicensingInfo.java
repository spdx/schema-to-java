
package com.poc.jibx;

/** 
 * An ExtractedLicensingInfo represents a license or licensing notice that was found in the package. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtractedLicensingInfo">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SimpleLicensingInfo">
 *       &lt;xs:all>
 *         &lt;xs:element type="xs:string" name="extractedText"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtractedLicensingInfo extends SimpleLicensingInfo
{
    private String extractedText;

    /** 
     * Get the 'extractedText' element value. Verbatim license or licensing notice text that was discovered.
     * 
     * @return value
     */
    public String getExtractedText() {
        return extractedText;
    }

    /** 
     * Set the 'extractedText' element value. Verbatim license or licensing notice text that was discovered.
     * 
     * @param extractedText
     */
    public void setExtractedText(String extractedText) {
        this.extractedText = extractedText;
    }
}

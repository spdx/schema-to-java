
package com.poc.jibx;

/** 
 * A license which is included in the SPDX License List (http://spdx.org/licenses).
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ListedLicense">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:License">
 *       &lt;xs:all>
 *         &lt;xs:element type="xs:boolean" name="isDeprecatedLicenseId" minOccurs="0"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ListedLicense extends License
{
    private Boolean isDeprecatedLicenseId;

    /** 
     * Get the 'isDeprecatedLicenseId' element value.
     * 
     * @return value
     */
    public Boolean getIsDeprecatedLicenseId() {
        return isDeprecatedLicenseId;
    }

    /** 
     * Set the 'isDeprecatedLicenseId' element value.
     * 
     * @param isDeprecatedLicenseId
     */
    public void setIsDeprecatedLicenseId(Boolean isDeprecatedLicenseId) {
        this.isDeprecatedLicenseId = isDeprecatedLicenseId;
    }
}

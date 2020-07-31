
package org.spdx.library.model;

/** 
 * A license which is included in the SPDX License List (http://spdx.org/licenses).
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

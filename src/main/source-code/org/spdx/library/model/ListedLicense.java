
package org.spdx.library.model;

/** 
 * A license which is included in the SPDX License List (http://spdx.org/licenses).
 */
public class ListedLicense extends License
{
    private Boolean isDeprecatedLicenseId;

    ListedLicense(String Id) {
        super(Id);
    }

    ListedLicense(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "ListedLicense";
    }

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


package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for LicenseInfoFromFiles properties
 */
public class LicenseInfoFromFilesCodeType
{
    private LicenseInfoFromFilesCodeSimpleType licenseInfoFromFilesCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LicenseInfoFromFilesCodeSimpleType getLicenseInfoFromFilesCodeSimpleType() {
        return licenseInfoFromFilesCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param licenseInfoFromFilesCodeSimpleType
     */
    public void setLicenseInfoFromFilesCodeSimpleType(
            LicenseInfoFromFilesCodeSimpleType licenseInfoFromFilesCodeSimpleType) {
        this.licenseInfoFromFilesCodeSimpleType = licenseInfoFromFilesCodeSimpleType;
    }

    /** 
     * Get the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @return value
     */
    public SimpleObjectAttributeGroup getSimpleObjectAttributeGroup() {
        return simpleObjectAttributeGroup;
    }

    /** 
     * Set the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @param simpleObjectAttributeGroup
     */
    public void setSimpleObjectAttributeGroup(
            SimpleObjectAttributeGroup simpleObjectAttributeGroup) {
        this.simpleObjectAttributeGroup = simpleObjectAttributeGroup;
    }
}

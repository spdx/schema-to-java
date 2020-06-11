
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for a software license
 */
public class LicenseCodeType
{
    private LicenseCodeSimpleType licenseCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LicenseCodeSimpleType getLicenseCodeSimpleType() {
        return licenseCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param licenseCodeSimpleType
     */
    public void setLicenseCodeSimpleType(
            LicenseCodeSimpleType licenseCodeSimpleType) {
        this.licenseCodeSimpleType = licenseCodeSimpleType;
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

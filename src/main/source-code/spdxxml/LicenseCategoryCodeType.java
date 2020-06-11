
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for a software license category
 */
public class LicenseCategoryCodeType
{
    private LicenseCategoryCodeSimpleType licenseCategoryCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LicenseCategoryCodeSimpleType getLicenseCategoryCodeSimpleType() {
        return licenseCategoryCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param licenseCategoryCodeSimpleType
     */
    public void setLicenseCategoryCodeSimpleType(
            LicenseCategoryCodeSimpleType licenseCategoryCodeSimpleType) {
        this.licenseCategoryCodeSimpleType = licenseCategoryCodeSimpleType;
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


package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for LicenseConcluded properties
 */
public class LicenseConcludedCodeType
{
    private LicenseConcludedCodeSimpleType licenseConcludedCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LicenseConcludedCodeSimpleType getLicenseConcludedCodeSimpleType() {
        return licenseConcludedCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param licenseConcludedCodeSimpleType
     */
    public void setLicenseConcludedCodeSimpleType(
            LicenseConcludedCodeSimpleType licenseConcludedCodeSimpleType) {
        this.licenseConcludedCodeSimpleType = licenseConcludedCodeSimpleType;
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


package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for LicenseDeclared properties
 */
public class LicenseDeclaredCodeType
{
    private LicenseDeclaredCodeSimpleType licenseDeclaredCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LicenseDeclaredCodeSimpleType getLicenseDeclaredCodeSimpleType() {
        return licenseDeclaredCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param licenseDeclaredCodeSimpleType
     */
    public void setLicenseDeclaredCodeSimpleType(
            LicenseDeclaredCodeSimpleType licenseDeclaredCodeSimpleType) {
        this.licenseDeclaredCodeSimpleType = licenseDeclaredCodeSimpleType;
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

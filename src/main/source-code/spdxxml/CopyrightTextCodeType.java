
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for CopyrightText properties
 */
public class CopyrightTextCodeType
{
    private CopyrightTextCodeSimpleType copyrightTextCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public CopyrightTextCodeSimpleType getCopyrightTextCodeSimpleType() {
        return copyrightTextCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param copyrightTextCodeSimpleType
     */
    public void setCopyrightTextCodeSimpleType(
            CopyrightTextCodeSimpleType copyrightTextCodeSimpleType) {
        this.copyrightTextCodeSimpleType = copyrightTextCodeSimpleType;
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


package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for ReferenceCategory properties
 */
public class ReferenceCategoryCodeType
{
    private ReferenceCategoryCodeSimpleType referenceCategoryCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public ReferenceCategoryCodeSimpleType getReferenceCategoryCodeSimpleType() {
        return referenceCategoryCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param referenceCategoryCodeSimpleType
     */
    public void setReferenceCategoryCodeSimpleType(
            ReferenceCategoryCodeSimpleType referenceCategoryCodeSimpleType) {
        this.referenceCategoryCodeSimpleType = referenceCategoryCodeSimpleType;
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

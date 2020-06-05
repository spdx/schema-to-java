
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for ReferenceCategory properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceCategoryCodeType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:ReferenceCategoryCodeSimpleType">
 *       &lt;xs:attributeGroup ref="ns1:SimpleObjectAttributeGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
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

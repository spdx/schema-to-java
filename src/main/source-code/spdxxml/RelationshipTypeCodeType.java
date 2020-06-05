
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for RelationshipType properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelationshipTypeCodeType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:RelationshipTypeCodeSimpleType">
 *       &lt;xs:attributeGroup ref="ns1:SimpleObjectAttributeGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelationshipTypeCodeType
{
    private RelationshipTypeCodeSimpleType relationshipTypeCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public RelationshipTypeCodeSimpleType getRelationshipTypeCodeSimpleType() {
        return relationshipTypeCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param relationshipTypeCodeSimpleType
     */
    public void setRelationshipTypeCodeSimpleType(
            RelationshipTypeCodeSimpleType relationshipTypeCodeSimpleType) {
        this.relationshipTypeCodeSimpleType = relationshipTypeCodeSimpleType;
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

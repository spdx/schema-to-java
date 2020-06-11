
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for RelationshipType properties
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

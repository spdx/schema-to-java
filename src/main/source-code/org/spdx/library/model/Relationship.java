
package org.spdx.library.model;

/** 
 * A Relationship represents a relationship between two SpdxElements.
 */
public class Relationship extends ModelObject
{
    private String comment;
    private RelationshipType relationshipType;
    private SpdxElement relatedSpdxElement;

    Relationship(String Id) {
    }

    /** 
     * Get the 'comment' element value.
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'comment' element value.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the 'relationshipType' element value. Describes the type of relationship between two SPDX elements.
     * 
     * @return value
     */
    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /** 
     * Set the 'relationshipType' element value. Describes the type of relationship between two SPDX elements.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    /** 
     * Get the 'relatedSpdxElement' element value. A related SpdxElement.
     * 
     * @return value
     */
    public SpdxElement getRelatedSpdxElement() {
        return relatedSpdxElement;
    }

    /** 
     * Set the 'relatedSpdxElement' element value. A related SpdxElement.
     * 
     * @param relatedSpdxElement
     */
    public void setRelatedSpdxElement(SpdxElement relatedSpdxElement) {
        this.relatedSpdxElement = relatedSpdxElement;
    }
}

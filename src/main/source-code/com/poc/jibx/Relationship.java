
package com.poc.jibx;

/** 
 * A Relationship represents a relationship between two SpdxElements.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Relationship">
 *   &lt;xs:all>
 *     &lt;xs:element type="xs:string" name="comment" minOccurs="0"/>
 *     &lt;xs:element type="ns:RelationshipType" name="relationshipType"/>
 *     &lt;xs:element type="ns:SpdxElement" name="relatedSpdxElement"/>
 *   &lt;/xs:all>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Relationship
{
    private String comment;
    private RelationshipType relationshipType;
    private SpdxElement relatedSpdxElement;

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


package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Relationship type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelationshipType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:RelationshipTypeCode"/>
 *         &lt;xs:element ref="ns:CommentText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:RelatedSpdxElementID" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:RelationshipAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RelationshipType extends ObjectType
{
    private RelationshipTypeCodeType relationshipTypeCode;
    private CommentTextType commentText;
    private RelatedSpdxElementID relatedSpdxElementID;
    private List<RelationshipAugmentationPoint> relationshipAugmentationPointList = new ArrayList<RelationshipAugmentationPoint>();

    /** 
     * Get the 'RelationshipTypeCode' element value.
     * 
     * @return value
     */
    public RelationshipTypeCodeType getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    /** 
     * Set the 'RelationshipTypeCode' element value.
     * 
     * @param relationshipTypeCode
     */
    public void setRelationshipTypeCode(
            RelationshipTypeCodeType relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    /** 
     * Get the 'CommentText' element value.
     * 
     * @return value
     */
    public CommentTextType getCommentText() {
        return commentText;
    }

    /** 
     * Set the 'CommentText' element value.
     * 
     * @param commentText
     */
    public void setCommentText(CommentTextType commentText) {
        this.commentText = commentText;
    }

    /** 
     * Get the 'RelatedSpdxElementID' element value.
     * 
     * @return value
     */
    public RelatedSpdxElementID getRelatedSpdxElementID() {
        return relatedSpdxElementID;
    }

    /** 
     * Set the 'RelatedSpdxElementID' element value.
     * 
     * @param relatedSpdxElementID
     */
    public void setRelatedSpdxElementID(
            RelatedSpdxElementID relatedSpdxElementID) {
        this.relatedSpdxElementID = relatedSpdxElementID;
    }

    /** 
     * Get the list of 'RelationshipAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<RelationshipAugmentationPoint> getRelationshipAugmentationPointList() {
        return relationshipAugmentationPointList;
    }

    /** 
     * Set the list of 'RelationshipAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setRelationshipAugmentationPointList(
            List<RelationshipAugmentationPoint> list) {
        relationshipAugmentationPointList = list;
    }
}

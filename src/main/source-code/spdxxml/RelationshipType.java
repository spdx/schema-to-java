
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Relationship type
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

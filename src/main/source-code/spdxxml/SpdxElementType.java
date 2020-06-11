
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SpdxElement type
 */
public class SpdxElementType extends ObjectType
{
    private SpdxID spdxID;
    private AnnotationType annotation;
    private NameType name;
    private CommentTextType commentText;
    private Relationship relationship;
    private List<SpdxElementAugmentationPoint> spdxElementAugmentationPointList = new ArrayList<SpdxElementAugmentationPoint>();

    /** 
     * Get the 'SpdxID' element value.
     * 
     * @return value
     */
    public SpdxID getSpdxID() {
        return spdxID;
    }

    /** 
     * Set the 'SpdxID' element value.
     * 
     * @param spdxID
     */
    public void setSpdxID(SpdxID spdxID) {
        this.spdxID = spdxID;
    }

    /** 
     * Get the 'Annotation' element value.
     * 
     * @return value
     */
    public AnnotationType getAnnotation() {
        return annotation;
    }

    /** 
     * Set the 'Annotation' element value.
     * 
     * @param annotation
     */
    public void setAnnotation(AnnotationType annotation) {
        this.annotation = annotation;
    }

    /** 
     * Get the 'Name' element value.
     * 
     * @return value
     */
    public NameType getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value.
     * 
     * @param name
     */
    public void setName(NameType name) {
        this.name = name;
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
     * Get the 'Relationship' element value.
     * 
     * @return value
     */
    public Relationship getRelationship() {
        return relationship;
    }

    /** 
     * Set the 'Relationship' element value.
     * 
     * @param relationship
     */
    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    /** 
     * Get the list of 'SpdxElementAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<SpdxElementAugmentationPoint> getSpdxElementAugmentationPointList() {
        return spdxElementAugmentationPointList;
    }

    /** 
     * Set the list of 'SpdxElementAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setSpdxElementAugmentationPointList(
            List<SpdxElementAugmentationPoint> list) {
        spdxElementAugmentationPointList = list;
    }
}

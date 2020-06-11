
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ExternalRef type
 */
public class ExternalRefType extends ObjectType
{
    private CommentTextType commentText;
    private ReferenceLocatorTextType referenceLocatorText;
    private ReferenceIDType referenceID;
    private ReferenceCategoryCodeType referenceCategoryCode;
    private List<ExternalRefAugmentationPoint> externalRefAugmentationPointList = new ArrayList<ExternalRefAugmentationPoint>();

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
     * Get the 'ReferenceLocatorText' element value.
     * 
     * @return value
     */
    public ReferenceLocatorTextType getReferenceLocatorText() {
        return referenceLocatorText;
    }

    /** 
     * Set the 'ReferenceLocatorText' element value.
     * 
     * @param referenceLocatorText
     */
    public void setReferenceLocatorText(
            ReferenceLocatorTextType referenceLocatorText) {
        this.referenceLocatorText = referenceLocatorText;
    }

    /** 
     * Get the 'ReferenceID' element value.
     * 
     * @return value
     */
    public ReferenceIDType getReferenceID() {
        return referenceID;
    }

    /** 
     * Set the 'ReferenceID' element value.
     * 
     * @param referenceID
     */
    public void setReferenceID(ReferenceIDType referenceID) {
        this.referenceID = referenceID;
    }

    /** 
     * Get the 'ReferenceCategoryCode' element value.
     * 
     * @return value
     */
    public ReferenceCategoryCodeType getReferenceCategoryCode() {
        return referenceCategoryCode;
    }

    /** 
     * Set the 'ReferenceCategoryCode' element value.
     * 
     * @param referenceCategoryCode
     */
    public void setReferenceCategoryCode(
            ReferenceCategoryCodeType referenceCategoryCode) {
        this.referenceCategoryCode = referenceCategoryCode;
    }

    /** 
     * Get the list of 'ExternalRefAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ExternalRefAugmentationPoint> getExternalRefAugmentationPointList() {
        return externalRefAugmentationPointList;
    }

    /** 
     * Set the list of 'ExternalRefAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setExternalRefAugmentationPointList(
            List<ExternalRefAugmentationPoint> list) {
        externalRefAugmentationPointList = list;
    }
}


package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Annotation type
 */
public class AnnotationType extends ObjectType
{
    private DateType date;
    private AnnotationTypeCodeType annotationTypeCode;
    private CommentTextType commentText;
    private AnnotatorTextType annotatorText;
    private List<AnnotationAugmentationPoint> annotationAugmentationPointList = new ArrayList<AnnotationAugmentationPoint>();

    /** 
     * Get the 'Date' element value.
     * 
     * @return value
     */
    public DateType getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value.
     * 
     * @param date
     */
    public void setDate(DateType date) {
        this.date = date;
    }

    /** 
     * Get the 'AnnotationTypeCode' element value.
     * 
     * @return value
     */
    public AnnotationTypeCodeType getAnnotationTypeCode() {
        return annotationTypeCode;
    }

    /** 
     * Set the 'AnnotationTypeCode' element value.
     * 
     * @param annotationTypeCode
     */
    public void setAnnotationTypeCode(AnnotationTypeCodeType annotationTypeCode) {
        this.annotationTypeCode = annotationTypeCode;
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
     * Get the 'AnnotatorText' element value.
     * 
     * @return value
     */
    public AnnotatorTextType getAnnotatorText() {
        return annotatorText;
    }

    /** 
     * Set the 'AnnotatorText' element value.
     * 
     * @param annotatorText
     */
    public void setAnnotatorText(AnnotatorTextType annotatorText) {
        this.annotatorText = annotatorText;
    }

    /** 
     * Get the list of 'AnnotationAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<AnnotationAugmentationPoint> getAnnotationAugmentationPointList() {
        return annotationAugmentationPointList;
    }

    /** 
     * Set the list of 'AnnotationAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setAnnotationAugmentationPointList(
            List<AnnotationAugmentationPoint> list) {
        annotationAugmentationPointList = list;
    }
}

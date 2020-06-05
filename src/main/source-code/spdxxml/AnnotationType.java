
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Annotation type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AnnotationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Date" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:AnnotationTypeCode"/>
 *         &lt;xs:element ref="ns:CommentText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:AnnotatorText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:AnnotationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

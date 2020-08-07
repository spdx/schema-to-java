
package org.spdx.library.model;

import java.util.Date;

/** 
 * An Annotation is a comment on an SpdxItem by an agent.
 */
public class Annotation extends ModelObject
{
    private Date annotationDate;
    private String comment;
    private String annotator;
    private AnnotationType annotationType;

    Annotation(String Id) {
    }

    /** 
     * Get the 'annotationDate' element value. Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.
     * 
     * @return value
     */
    public Date getAnnotationDate() {
        return annotationDate;
    }

    /** 
     * Set the 'annotationDate' element value. Identify when the comment was made. This is to be specified according to the combined date and time in the UTC format, as specified in the ISO 8601 standard.
     * 
     * @param annotationDate
     */
    public void setAnnotationDate(Date annotationDate) {
        this.annotationDate = annotationDate;
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
     * Get the 'annotator' element value. This field identifies the person, organization or tool that has commented on a file, package, or the entire document.
     * 
     * @return value
     */
    public String getAnnotator() {
        return annotator;
    }

    /** 
     * Set the 'annotator' element value. This field identifies the person, organization or tool that has commented on a file, package, or the entire document.
     * 
     * @param annotator
     */
    public void setAnnotator(String annotator) {
        this.annotator = annotator;
    }

    /** 
     * Get the 'annotationType' element value. Type of the annotation.
     * 
     * @return value
     */
    public AnnotationType getAnnotationType() {
        return annotationType;
    }

    /** 
     * Set the 'annotationType' element value. Type of the annotation.
     * 
     * @param annotationType
     */
    public void setAnnotationType(AnnotationType annotationType) {
        this.annotationType = annotationType;
    }
}

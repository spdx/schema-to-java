
package com.poc.jibx;

import java.util.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Review">
 *   &lt;xs:all>
 *     &lt;xs:element type="xs:string" name="reviewer" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="comment" minOccurs="0"/>
 *     &lt;xs:element type="xs:dateTime" name="reviewDate"/>
 *   &lt;/xs:all>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Review
{
    private String reviewer;
    private String comment;
    private Date reviewDate;

    /** 
     * Get the 'reviewer' element value. The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.
     * 
     * @return value
     */
    public String getReviewer() {
        return reviewer;
    }

    /** 
     * Set the 'reviewer' element value. The name and, optionally, contact information of the person who performed the review. Values of this property must conform to the agent and tool syntax.
     * 
     * @param reviewer
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
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
     * Get the 'reviewDate' element value. The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.
     * 
     * @return value
     */
    public Date getReviewDate() {
        return reviewDate;
    }

    /** 
     * Set the 'reviewDate' element value. The date and time at which the SpdxDocument was reviewed. This value must be in UTC and have 'Z' as its timezone indicator.
     * 
     * @param reviewDate
     */
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}

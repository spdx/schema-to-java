
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ExternalRef type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExternalRefType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:CommentText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ReferenceLocatorText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ReferenceID" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ReferenceCategoryCode"/>
 *         &lt;xs:element ref="ns:ExternalRefAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

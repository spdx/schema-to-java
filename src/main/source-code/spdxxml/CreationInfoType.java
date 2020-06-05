
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for CreationInfo type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CreationInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LicenseListVersionText" minOccurs="0"/>
 *         &lt;xs:element ref="ns:CreatedDateTime" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:CommentText" minOccurs="0"/>
 *         &lt;xs:element ref="ns:CreatorText" minOccurs="1"/>
 *         &lt;xs:element ref="ns:CreationInfoAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CreationInfoType extends ObjectType
{
    private LicenseListVersionTextType licenseListVersionText;
    private CreatedDateTimeType createdDateTime;
    private CommentTextType commentText;
    private CreatorTextType creatorText;
    private List<CreationInfoAugmentationPoint> creationInfoAugmentationPointList = new ArrayList<CreationInfoAugmentationPoint>();

    /** 
     * Get the 'LicenseListVersionText' element value.
     * 
     * @return value
     */
    public LicenseListVersionTextType getLicenseListVersionText() {
        return licenseListVersionText;
    }

    /** 
     * Set the 'LicenseListVersionText' element value.
     * 
     * @param licenseListVersionText
     */
    public void setLicenseListVersionText(
            LicenseListVersionTextType licenseListVersionText) {
        this.licenseListVersionText = licenseListVersionText;
    }

    /** 
     * Get the 'CreatedDateTime' element value.
     * 
     * @return value
     */
    public CreatedDateTimeType getCreatedDateTime() {
        return createdDateTime;
    }

    /** 
     * Set the 'CreatedDateTime' element value.
     * 
     * @param createdDateTime
     */
    public void setCreatedDateTime(CreatedDateTimeType createdDateTime) {
        this.createdDateTime = createdDateTime;
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
     * Get the 'CreatorText' element value.
     * 
     * @return value
     */
    public CreatorTextType getCreatorText() {
        return creatorText;
    }

    /** 
     * Set the 'CreatorText' element value.
     * 
     * @param creatorText
     */
    public void setCreatorText(CreatorTextType creatorText) {
        this.creatorText = creatorText;
    }

    /** 
     * Get the list of 'CreationInfoAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<CreationInfoAugmentationPoint> getCreationInfoAugmentationPointList() {
        return creationInfoAugmentationPointList;
    }

    /** 
     * Set the list of 'CreationInfoAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setCreationInfoAugmentationPointList(
            List<CreationInfoAugmentationPoint> list) {
        creationInfoAugmentationPointList = list;
    }
}

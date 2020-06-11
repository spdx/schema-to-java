
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for CreationInfo type
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


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SimpleLicensingInfo type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SimpleLicensingInfoType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfoType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LicenseID" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:CommentText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SeeAlsoURI" minOccurs="0"/>
 *         &lt;xs:element ref="ns:Name" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SimpleLicensingInfoAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SimpleLicensingInfoType extends AnyLicenseInfoType
{
    private LicenseID licenseID;
    private CommentTextType commentText;
    private SeeAlsoURIType seeAlsoURI;
    private NameType name;
    private List<SimpleLicensingInfoAugmentationPoint> simpleLicensingInfoAugmentationPointList = new ArrayList<SimpleLicensingInfoAugmentationPoint>();

    /** 
     * Get the 'LicenseID' element value.
     * 
     * @return value
     */
    public LicenseID getLicenseID() {
        return licenseID;
    }

    /** 
     * Set the 'LicenseID' element value.
     * 
     * @param licenseID
     */
    public void setLicenseID(LicenseID licenseID) {
        this.licenseID = licenseID;
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
     * Get the 'SeeAlsoURI' element value.
     * 
     * @return value
     */
    public SeeAlsoURIType getSeeAlsoURI() {
        return seeAlsoURI;
    }

    /** 
     * Set the 'SeeAlsoURI' element value.
     * 
     * @param seeAlsoURI
     */
    public void setSeeAlsoURI(SeeAlsoURIType seeAlsoURI) {
        this.seeAlsoURI = seeAlsoURI;
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
     * Get the list of 'SimpleLicensingInfoAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<SimpleLicensingInfoAugmentationPoint> getSimpleLicensingInfoAugmentationPointList() {
        return simpleLicensingInfoAugmentationPointList;
    }

    /** 
     * Set the list of 'SimpleLicensingInfoAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setSimpleLicensingInfoAugmentationPointList(
            List<SimpleLicensingInfoAugmentationPoint> list) {
        simpleLicensingInfoAugmentationPointList = list;
    }
}

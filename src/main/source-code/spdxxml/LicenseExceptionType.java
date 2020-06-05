
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for LicenseException type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LicenseExceptionType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LicenseExceptionText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:CommentText" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:ExampleText" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:Name" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:SeeAlsoURI" minOccurs="0"/>
 *         &lt;xs:element ref="ns:LicenseExceptionID" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:LicenseExceptionAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LicenseExceptionType extends ObjectType
{
    private LicenseExceptionTextType licenseExceptionText;
    private CommentTextType commentText;
    private ExampleTextType exampleText;
    private NameType name;
    private SeeAlsoURIType seeAlsoURI;
    private LicenseExceptionIDType licenseExceptionID;
    private List<LicenseExceptionAugmentationPoint> licenseExceptionAugmentationPointList = new ArrayList<LicenseExceptionAugmentationPoint>();

    /** 
     * Get the 'LicenseExceptionText' element value.
     * 
     * @return value
     */
    public LicenseExceptionTextType getLicenseExceptionText() {
        return licenseExceptionText;
    }

    /** 
     * Set the 'LicenseExceptionText' element value.
     * 
     * @param licenseExceptionText
     */
    public void setLicenseExceptionText(
            LicenseExceptionTextType licenseExceptionText) {
        this.licenseExceptionText = licenseExceptionText;
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
     * Get the 'ExampleText' element value.
     * 
     * @return value
     */
    public ExampleTextType getExampleText() {
        return exampleText;
    }

    /** 
     * Set the 'ExampleText' element value.
     * 
     * @param exampleText
     */
    public void setExampleText(ExampleTextType exampleText) {
        this.exampleText = exampleText;
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
     * Get the 'LicenseExceptionID' element value.
     * 
     * @return value
     */
    public LicenseExceptionIDType getLicenseExceptionID() {
        return licenseExceptionID;
    }

    /** 
     * Set the 'LicenseExceptionID' element value.
     * 
     * @param licenseExceptionID
     */
    public void setLicenseExceptionID(LicenseExceptionIDType licenseExceptionID) {
        this.licenseExceptionID = licenseExceptionID;
    }

    /** 
     * Get the list of 'LicenseExceptionAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<LicenseExceptionAugmentationPoint> getLicenseExceptionAugmentationPointList() {
        return licenseExceptionAugmentationPointList;
    }

    /** 
     * Set the list of 'LicenseExceptionAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setLicenseExceptionAugmentationPointList(
            List<LicenseExceptionAugmentationPoint> list) {
        licenseExceptionAugmentationPointList = list;
    }
}

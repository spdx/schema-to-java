
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software product naming or version related information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SoftwareInformationType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ProductTitleText"/>
 *         &lt;xs:element ref="ns:SoftwareNameText"/>
 *         &lt;xs:element ref="ns:SoftwareOrgText"/>
 *         &lt;xs:element ref="ns:VersionInformation"/>
 *         &lt;xs:element ref="ns:GroupingText"/>
 *         &lt;xs:element ref="ns:ReleaseNotesText"/>
 *         &lt;xs:element ref="ns:SoftwareInformationAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SoftwareInformationType extends ObjectType
{
    private ProductTitleText productTitleText;
    private SoftwareNameText softwareNameText;
    private SoftwareOrgText softwareOrgText;
    private VersionInformationType versionInformation;
    private GroupingText groupingText;
    private ReleaseNotesText releaseNotesText;
    private List<SoftwareInformationAugmentationPoint> softwareInformationAugmentationPointList = new ArrayList<SoftwareInformationAugmentationPoint>();

    /** 
     * Get the 'ProductTitleText' element value. A data item for the product title
     * 
     * @return value
     */
    public ProductTitleText getProductTitleText() {
        return productTitleText;
    }

    /** 
     * Set the 'ProductTitleText' element value. A data item for the product title
     * 
     * @param productTitleText
     */
    public void setProductTitleText(ProductTitleText productTitleText) {
        this.productTitleText = productTitleText;
    }

    /** 
     * Get the 'SoftwareNameText' element value. A data item for the Name of the software
     * 
     * @return value
     */
    public SoftwareNameText getSoftwareNameText() {
        return softwareNameText;
    }

    /** 
     * Set the 'SoftwareNameText' element value. A data item for the Name of the software
     * 
     * @param softwareNameText
     */
    public void setSoftwareNameText(SoftwareNameText softwareNameText) {
        this.softwareNameText = softwareNameText;
    }

    /** 
     * Get the 'SoftwareOrgText' element value. A data item for the Organization of the software
     * 
     * @return value
     */
    public SoftwareOrgText getSoftwareOrgText() {
        return softwareOrgText;
    }

    /** 
     * Set the 'SoftwareOrgText' element value. A data item for the Organization of the software
     * 
     * @param softwareOrgText
     */
    public void setSoftwareOrgText(SoftwareOrgText softwareOrgText) {
        this.softwareOrgText = softwareOrgText;
    }

    /** 
     * Get the 'VersionInformation' element value. A data item for the software version information
     * 
     * @return value
     */
    public VersionInformationType getVersionInformation() {
        return versionInformation;
    }

    /** 
     * Set the 'VersionInformation' element value. A data item for the software version information
     * 
     * @param versionInformation
     */
    public void setVersionInformation(VersionInformationType versionInformation) {
        this.versionInformation = versionInformation;
    }

    /** 
     * Get the 'GroupingText' element value. A data item to indicate the family or relationship
     * 
     * @return value
     */
    public GroupingText getGroupingText() {
        return groupingText;
    }

    /** 
     * Set the 'GroupingText' element value. A data item to indicate the family or relationship
     * 
     * @param groupingText
     */
    public void setGroupingText(GroupingText groupingText) {
        this.groupingText = groupingText;
    }

    /** 
     * Get the 'ReleaseNotesText' element value. A data item for a release notes
     * 
     * @return value
     */
    public ReleaseNotesText getReleaseNotesText() {
        return releaseNotesText;
    }

    /** 
     * Set the 'ReleaseNotesText' element value. A data item for a release notes
     * 
     * @param releaseNotesText
     */
    public void setReleaseNotesText(ReleaseNotesText releaseNotesText) {
        this.releaseNotesText = releaseNotesText;
    }

    /** 
     * Get the list of 'SoftwareInformationAugmentationPoint' element items. An augmentation point for SoftwareInformationType
     * 
     * @return list
     */
    public List<SoftwareInformationAugmentationPoint> getSoftwareInformationAugmentationPointList() {
        return softwareInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'SoftwareInformationAugmentationPoint' element items. An augmentation point for SoftwareInformationType
     * 
     * @param list
     */
    public void setSoftwareInformationAugmentationPointList(
            List<SoftwareInformationAugmentationPoint> list) {
        softwareInformationAugmentationPointList = list;
    }
}

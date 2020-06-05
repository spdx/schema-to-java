
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for vulnerabilty information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VulnerabilitiesType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Vulnerability" minOccurs="1" maxOccurs="100"/>
 *         &lt;xs:element ref="ns:VulnerabilitiesAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VulnerabilitiesType extends ObjectType
{
    private List<VulnerabilityType> vulnerabilityList = new ArrayList<VulnerabilityType>();
    private List<VulnerabilitiesAugmentationPoint> vulnerabilitiesAugmentationPointList = new ArrayList<VulnerabilitiesAugmentationPoint>();

    /** 
     * Get the list of 'Vulnerability' element items. A data item for vulnerabilty information
     * 
     * @return list
     */
    public List<VulnerabilityType> getVulnerabilityList() {
        return vulnerabilityList;
    }

    /** 
     * Set the list of 'Vulnerability' element items. A data item for vulnerabilty information
     * 
     * @param list
     */
    public void setVulnerabilityList(List<VulnerabilityType> list) {
        vulnerabilityList = list;
    }

    /** 
     * Get the list of 'VulnerabilitiesAugmentationPoint' element items. An augmentation point for VulnerabilitiesType
     * 
     * @return list
     */
    public List<VulnerabilitiesAugmentationPoint> getVulnerabilitiesAugmentationPointList() {
        return vulnerabilitiesAugmentationPointList;
    }

    /** 
     * Set the list of 'VulnerabilitiesAugmentationPoint' element items. An augmentation point for VulnerabilitiesType
     * 
     * @param list
     */
    public void setVulnerabilitiesAugmentationPointList(
            List<VulnerabilitiesAugmentationPoint> list) {
        vulnerabilitiesAugmentationPointList = list;
    }
}

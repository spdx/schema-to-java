
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for vulnerabilty information
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

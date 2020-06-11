
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Container type
 */
public class ContainerType extends ObjectType
{
    private List<ContainerAugmentationPoint> containerAugmentationPointList = new ArrayList<ContainerAugmentationPoint>();

    /** 
     * Get the list of 'ContainerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ContainerAugmentationPoint> getContainerAugmentationPointList() {
        return containerAugmentationPointList;
    }

    /** 
     * Set the list of 'ContainerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setContainerAugmentationPointList(
            List<ContainerAugmentationPoint> list) {
        containerAugmentationPointList = list;
    }
}


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for StartEndPointer type
 */
public class StartEndPointerType extends CompoundPointerType
{
    private List<StartEndPointerAugmentationPoint> startEndPointerAugmentationPointList = new ArrayList<StartEndPointerAugmentationPoint>();

    /** 
     * Get the list of 'StartEndPointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<StartEndPointerAugmentationPoint> getStartEndPointerAugmentationPointList() {
        return startEndPointerAugmentationPointList;
    }

    /** 
     * Set the list of 'StartEndPointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setStartEndPointerAugmentationPointList(
            List<StartEndPointerAugmentationPoint> list) {
        startEndPointerAugmentationPointList = list;
    }
}

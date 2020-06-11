
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for OffsetPointer type
 */
public class OffsetPointerType extends SinglePointerType
{
    private List<OffsetPointerAugmentationPoint> offsetPointerAugmentationPointList = new ArrayList<OffsetPointerAugmentationPoint>();

    /** 
     * Get the list of 'OffsetPointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<OffsetPointerAugmentationPoint> getOffsetPointerAugmentationPointList() {
        return offsetPointerAugmentationPointList;
    }

    /** 
     * Set the list of 'OffsetPointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setOffsetPointerAugmentationPointList(
            List<OffsetPointerAugmentationPoint> list) {
        offsetPointerAugmentationPointList = list;
    }
}


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SinglePointer type
 */
public class SinglePointerType extends PointerType
{
    private List<SinglePointerAugmentationPoint> singlePointerAugmentationPointList = new ArrayList<SinglePointerAugmentationPoint>();

    /** 
     * Get the list of 'SinglePointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<SinglePointerAugmentationPoint> getSinglePointerAugmentationPointList() {
        return singlePointerAugmentationPointList;
    }

    /** 
     * Set the list of 'SinglePointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setSinglePointerAugmentationPointList(
            List<SinglePointerAugmentationPoint> list) {
        singlePointerAugmentationPointList = list;
    }
}

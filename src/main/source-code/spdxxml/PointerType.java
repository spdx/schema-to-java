
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Pointer type
 */
public class PointerType extends ObjectType
{
    private List<PointerAugmentationPoint> pointerAugmentationPointList = new ArrayList<PointerAugmentationPoint>();

    /** 
     * Get the list of 'PointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<PointerAugmentationPoint> getPointerAugmentationPointList() {
        return pointerAugmentationPointList;
    }

    /** 
     * Set the list of 'PointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setPointerAugmentationPointList(
            List<PointerAugmentationPoint> list) {
        pointerAugmentationPointList = list;
    }
}

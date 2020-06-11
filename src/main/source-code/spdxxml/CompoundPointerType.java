
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for CompoundPointer type
 */
public class CompoundPointerType extends PointerType
{
    private List<CompoundPointerAugmentationPoint> compoundPointerAugmentationPointList = new ArrayList<CompoundPointerAugmentationPoint>();

    /** 
     * Get the list of 'CompoundPointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<CompoundPointerAugmentationPoint> getCompoundPointerAugmentationPointList() {
        return compoundPointerAugmentationPointList;
    }

    /** 
     * Set the list of 'CompoundPointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setCompoundPointerAugmentationPointList(
            List<CompoundPointerAugmentationPoint> list) {
        compoundPointerAugmentationPointList = list;
    }
}

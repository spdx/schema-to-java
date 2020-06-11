
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for LineCharPointer type
 */
public class LineCharPointerType extends OffsetPointerType
{
    private List<LineCharPointerAugmentationPoint> lineCharPointerAugmentationPointList = new ArrayList<LineCharPointerAugmentationPoint>();

    /** 
     * Get the list of 'LineCharPointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<LineCharPointerAugmentationPoint> getLineCharPointerAugmentationPointList() {
        return lineCharPointerAugmentationPointList;
    }

    /** 
     * Set the list of 'LineCharPointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setLineCharPointerAugmentationPointList(
            List<LineCharPointerAugmentationPoint> list) {
        lineCharPointerAugmentationPointList = list;
    }
}

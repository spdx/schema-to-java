
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ByteOffsetPointer type
 */
public class ByteOffsetPointerType extends OffsetPointerType
{
    private List<ByteOffsetPointerAugmentationPoint> byteOffsetPointerAugmentationPointList = new ArrayList<ByteOffsetPointerAugmentationPoint>();

    /** 
     * Get the list of 'ByteOffsetPointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ByteOffsetPointerAugmentationPoint> getByteOffsetPointerAugmentationPointList() {
        return byteOffsetPointerAugmentationPointList;
    }

    /** 
     * Set the list of 'ByteOffsetPointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setByteOffsetPointerAugmentationPointList(
            List<ByteOffsetPointerAugmentationPoint> list) {
        byteOffsetPointerAugmentationPointList = list;
    }
}

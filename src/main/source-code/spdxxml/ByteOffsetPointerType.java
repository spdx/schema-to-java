
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ByteOffsetPointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ByteOffsetPointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:OffsetPointerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ByteOffsetPointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

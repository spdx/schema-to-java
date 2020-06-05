
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for OffsetPointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OffsetPointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:SinglePointerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:OffsetPointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

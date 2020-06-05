
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for LineCharPointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LineCharPointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:OffsetPointerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:LineCharPointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

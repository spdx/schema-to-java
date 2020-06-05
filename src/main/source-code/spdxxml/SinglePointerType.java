
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for SinglePointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SinglePointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:PointerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:SinglePointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

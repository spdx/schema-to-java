
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Pointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:PointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

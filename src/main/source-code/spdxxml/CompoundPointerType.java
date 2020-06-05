
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for CompoundPointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompoundPointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:PointerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:CompoundPointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

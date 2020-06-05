
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for StartEndPointer type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StartEndPointerType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:CompoundPointerType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:StartEndPointerAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StartEndPointerType extends CompoundPointerType
{
    private List<StartEndPointerAugmentationPoint> startEndPointerAugmentationPointList = new ArrayList<StartEndPointerAugmentationPoint>();

    /** 
     * Get the list of 'StartEndPointerAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<StartEndPointerAugmentationPoint> getStartEndPointerAugmentationPointList() {
        return startEndPointerAugmentationPointList;
    }

    /** 
     * Set the list of 'StartEndPointerAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setStartEndPointerAugmentationPointList(
            List<StartEndPointerAugmentationPoint> list) {
        startEndPointerAugmentationPointList = list;
    }
}

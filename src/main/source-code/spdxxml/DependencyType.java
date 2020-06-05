
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software dependency information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DependencyType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:NameText" minOccurs="1"/>
 *         &lt;xs:element ref="ns:DependencyVersionText" minOccurs="1"/>
 *         &lt;xs:element ref="ns:DependencyAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DependencyType extends ObjectType
{
    private NameText nameText;
    private DependencyVersionText dependencyVersionText;
    private List<DependencyAugmentationPoint> dependencyAugmentationPointList = new ArrayList<DependencyAugmentationPoint>();

    /** 
     * Get the 'NameText' element value. A data item for a name
     * 
     * @return value
     */
    public NameText getNameText() {
        return nameText;
    }

    /** 
     * Set the 'NameText' element value. A data item for a name
     * 
     * @param nameText
     */
    public void setNameText(NameText nameText) {
        this.nameText = nameText;
    }

    /** 
     * Get the 'DependencyVersionText' element value. A data item for a dependency version
     * 
     * @return value
     */
    public DependencyVersionText getDependencyVersionText() {
        return dependencyVersionText;
    }

    /** 
     * Set the 'DependencyVersionText' element value. A data item for a dependency version
     * 
     * @param dependencyVersionText
     */
    public void setDependencyVersionText(
            DependencyVersionText dependencyVersionText) {
        this.dependencyVersionText = dependencyVersionText;
    }

    /** 
     * Get the list of 'DependencyAugmentationPoint' element items. An augmentation point for DependencyType
     * 
     * @return list
     */
    public List<DependencyAugmentationPoint> getDependencyAugmentationPointList() {
        return dependencyAugmentationPointList;
    }

    /** 
     * Set the list of 'DependencyAugmentationPoint' element items. An augmentation point for DependencyType
     * 
     * @param list
     */
    public void setDependencyAugmentationPointList(
            List<DependencyAugmentationPoint> list) {
        dependencyAugmentationPointList = list;
    }
}


package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software dependency information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DependenciesType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:Dependency" minOccurs="1" maxOccurs="100"/>
 *         &lt;xs:element ref="ns:DependenciesAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DependenciesType extends ObjectType
{
    private List<DependencyType> dependencyList = new ArrayList<DependencyType>();
    private List<DependenciesAugmentationPoint> dependenciesAugmentationPointList = new ArrayList<DependenciesAugmentationPoint>();

    /** 
     * Get the list of 'Dependency' element items. A data item for software dependency information
     * 
     * @return list
     */
    public List<DependencyType> getDependencyList() {
        return dependencyList;
    }

    /** 
     * Set the list of 'Dependency' element items. A data item for software dependency information
     * 
     * @param list
     */
    public void setDependencyList(List<DependencyType> list) {
        dependencyList = list;
    }

    /** 
     * Get the list of 'DependenciesAugmentationPoint' element items. An augmentation point for DependenciesType
     * 
     * @return list
     */
    public List<DependenciesAugmentationPoint> getDependenciesAugmentationPointList() {
        return dependenciesAugmentationPointList;
    }

    /** 
     * Set the list of 'DependenciesAugmentationPoint' element items. An augmentation point for DependenciesType
     * 
     * @param list
     */
    public void setDependenciesAugmentationPointList(
            List<DependenciesAugmentationPoint> list) {
        dependenciesAugmentationPointList = list;
    }
}

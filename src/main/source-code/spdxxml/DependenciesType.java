
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software dependency information
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

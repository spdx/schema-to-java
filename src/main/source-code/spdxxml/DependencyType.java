
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for software dependency information
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

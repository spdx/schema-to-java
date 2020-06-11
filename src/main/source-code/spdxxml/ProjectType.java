
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Project type
 */
public class ProjectType extends ObjectType
{
    private List<ProjectAugmentationPoint> projectAugmentationPointList = new ArrayList<ProjectAugmentationPoint>();

    /** 
     * Get the list of 'ProjectAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ProjectAugmentationPoint> getProjectAugmentationPointList() {
        return projectAugmentationPointList;
    }

    /** 
     * Set the list of 'ProjectAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setProjectAugmentationPointList(
            List<ProjectAugmentationPoint> list) {
        projectAugmentationPointList = list;
    }
}

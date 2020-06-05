
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for Project type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProjectType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:ProjectAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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

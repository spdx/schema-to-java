
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for DisjunctiveLicenseSet type
 */
public class DisjunctiveLicenseSetType extends AnyLicenseInfoType
{
    private List<Member> memberList = new ArrayList<Member>();
    private List<DisjunctiveLicenseSetAugmentationPoint> disjunctiveLicenseSetAugmentationPointList = new ArrayList<DisjunctiveLicenseSetAugmentationPoint>();

    /** 
     * Get the list of 'Member' element items.
     * 
     * @return list
     */
    public List<Member> getMemberList() {
        return memberList;
    }

    /** 
     * Set the list of 'Member' element items.
     * 
     * @param list
     */
    public void setMemberList(List<Member> list) {
        memberList = list;
    }

    /** 
     * Get the list of 'DisjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<DisjunctiveLicenseSetAugmentationPoint> getDisjunctiveLicenseSetAugmentationPointList() {
        return disjunctiveLicenseSetAugmentationPointList;
    }

    /** 
     * Set the list of 'DisjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setDisjunctiveLicenseSetAugmentationPointList(
            List<DisjunctiveLicenseSetAugmentationPoint> list) {
        disjunctiveLicenseSetAugmentationPointList = list;
    }
}


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for ConjunctiveLicenseSet type
 */
public class ConjunctiveLicenseSetType extends AnyLicenseInfoType
{
    private List<Member> memberList = new ArrayList<Member>();
    private List<ConjunctiveLicenseSetAugmentationPoint> conjunctiveLicenseSetAugmentationPointList = new ArrayList<ConjunctiveLicenseSetAugmentationPoint>();

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
     * Get the list of 'ConjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ConjunctiveLicenseSetAugmentationPoint> getConjunctiveLicenseSetAugmentationPointList() {
        return conjunctiveLicenseSetAugmentationPointList;
    }

    /** 
     * Set the list of 'ConjunctiveLicenseSetAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setConjunctiveLicenseSetAugmentationPointList(
            List<ConjunctiveLicenseSetAugmentationPoint> list) {
        conjunctiveLicenseSetAugmentationPointList = list;
    }
}


package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for OrLaterOperator type
 */
public class OrLaterOperatorType extends AnyLicenseInfoType
{
    private Member member;
    private List<OrLaterOperatorAugmentationPoint> orLaterOperatorAugmentationPointList = new ArrayList<OrLaterOperatorAugmentationPoint>();

    /** 
     * Get the 'Member' element value.
     * 
     * @return value
     */
    public Member getMember() {
        return member;
    }

    /** 
     * Set the 'Member' element value.
     * 
     * @param member
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /** 
     * Get the list of 'OrLaterOperatorAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<OrLaterOperatorAugmentationPoint> getOrLaterOperatorAugmentationPointList() {
        return orLaterOperatorAugmentationPointList;
    }

    /** 
     * Set the list of 'OrLaterOperatorAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setOrLaterOperatorAugmentationPointList(
            List<OrLaterOperatorAugmentationPoint> list) {
        orLaterOperatorAugmentationPointList = list;
    }
}

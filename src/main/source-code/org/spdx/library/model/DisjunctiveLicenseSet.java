
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use.
 */
public class DisjunctiveLicenseSet extends AnyLicenseInfo
{
    private List<AnyLicenseInfo> memberList = new ArrayList<AnyLicenseInfo>();

    /** 
     * Get the list of 'member' element items. A license, or other licensing information, that is a member of the subject license set.
     * 
     * @return list
     */
    public List<AnyLicenseInfo> getMemberList() {
        return memberList;
    }

    /** 
     * Set the list of 'member' element items. A license, or other licensing information, that is a member of the subject license set.
     * 
     * @param list
     */
    public void setMemberList(List<AnyLicenseInfo> list) {
        memberList = list;
    }

    /** 
     * Get the number of 'member' element items.
     * @return count
     */
    public int sizeMemberList() {
        return memberList.size();
    }

    /** 
     * Add a 'member' element item.
     * @param item
     */
    public void addMember(AnyLicenseInfo item) {
        memberList.add(item);
    }

    /** 
     * Get 'member' element item by position.
     * @return item
     * @param index
     */
    public AnyLicenseInfo getMember(int index) {
        return memberList.get(index);
    }

    /** 
     * Remove all 'member' element items.
     */
    public void clearMemberList() {
        memberList.clear();
    }
}

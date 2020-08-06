
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use.
 */
public class DisjunctiveLicenseSet extends AnyLicenseInfo
{
    private List<AnyLicenseInfo> memberList = new ArrayList<AnyLicenseInfo>();

    DisjunctiveLicenseSet() {
    }

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
}

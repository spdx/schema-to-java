
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * A ConjunctiveLicenseSet represents a set of licensing information all of which apply.
 */
public class ConjunctiveLicenseSet extends AnyLicenseInfo
{
    private List<AnyLicenseInfo> memberList = new ArrayList<AnyLicenseInfo>();

    ConjunctiveLicenseSet(String Id) {
        super(Id);
    }

    ConjunctiveLicenseSet(IModelStore modelStore, String documentUri,
            String id, ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
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

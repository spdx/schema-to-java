
package org.spdx.library.model;

/** 
 * A license with an or later operator indicating this license version or any later version of the license
 */
public class OrLaterOperator extends AnyLicenseInfo
{
    private AnyLicenseInfo member;

    OrLaterOperator(String Id) {
        super(Id);
    }

    OrLaterOperator(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "OrLaterOperator";
    }

    /** 
     * Get the 'member' element value. A license, or other licensing information, that is a member of the subject license set.
     * 
     * @return value
     */
    public AnyLicenseInfo getMember() {
        return member;
    }

    /** 
     * Set the 'member' element value. A license, or other licensing information, that is a member of the subject license set.
     * 
     * @param member
     */
    public void setMember(AnyLicenseInfo member) {
        this.member = member;
    }
}


package com.poc.jibx;

import java.util.ArrayList;
import java.util.List;

/** 
 * A DisjunctiveLicenseSet represents a set of licensing information where only one license applies at a time. This class implies that the recipient gets to choose one of these licenses they would prefer to use.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DisjunctiveLicenseSet">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfo">
 *       &lt;xs:all>
 *         &lt;xs:element type="ns:AnyLicenseInfo" name="member" minOccurs="2" maxOccurs="unbounded"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
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
}

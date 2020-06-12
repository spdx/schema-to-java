
package com.poc.jibx;

/** 
 * A license with an or later operator indicating this license version or any later version of the license
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OrLaterOperator">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfo">
 *       &lt;xs:all>
 *         &lt;xs:element type="ns:AnyLicenseInfo" name="member"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OrLaterOperator extends AnyLicenseInfo
{
    private AnyLicenseInfo member;

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

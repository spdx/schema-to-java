
package com.poc.jibx;

/** 
 * Sometimes a set of license terms apply except under special circumstances. In this case, use the binary "WITH" operator to construct a new license expression to represent the special exception situation. A valid &lt;license-expression&gt; is where the left operand is a &lt;simple-expression&gt; value and the right operand is a &lt;license-exception-id&gt; that represents the special exception terms.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="WithExceptionOperator">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:AnyLicenseInfo">
 *       &lt;xs:all>
 *         &lt;xs:element type="ns:AnyLicenseInfo" name="member"/>
 *         &lt;xs:element type="ns:LicenseException" name="licenseException"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class WithExceptionOperator extends AnyLicenseInfo
{
    private AnyLicenseInfo member;
    private LicenseException licenseException;

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

    /** 
     * Get the 'licenseException' element value. An exception to a license.
     * 
     * @return value
     */
    public LicenseException getLicenseException() {
        return licenseException;
    }

    /** 
     * Set the 'licenseException' element value. An exception to a license.
     * 
     * @param licenseException
     */
    public void setLicenseException(LicenseException licenseException) {
        this.licenseException = licenseException;
    }
}

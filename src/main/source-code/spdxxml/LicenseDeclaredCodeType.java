
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for LicenseDeclared properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LicenseDeclaredCodeType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="ns:LicenseDeclaredCodeSimpleType">
 *       &lt;xs:attributeGroup ref="ns1:SimpleObjectAttributeGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LicenseDeclaredCodeType
{
    private LicenseDeclaredCodeSimpleType licenseDeclaredCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public LicenseDeclaredCodeSimpleType getLicenseDeclaredCodeSimpleType() {
        return licenseDeclaredCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param licenseDeclaredCodeSimpleType
     */
    public void setLicenseDeclaredCodeSimpleType(
            LicenseDeclaredCodeSimpleType licenseDeclaredCodeSimpleType) {
        this.licenseDeclaredCodeSimpleType = licenseDeclaredCodeSimpleType;
    }

    /** 
     * Get the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @return value
     */
    public SimpleObjectAttributeGroup getSimpleObjectAttributeGroup() {
        return simpleObjectAttributeGroup;
    }

    /** 
     * Set the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @param simpleObjectAttributeGroup
     */
    public void setSimpleObjectAttributeGroup(
            SimpleObjectAttributeGroup simpleObjectAttributeGroup) {
        this.simpleObjectAttributeGroup = simpleObjectAttributeGroup;
    }
}

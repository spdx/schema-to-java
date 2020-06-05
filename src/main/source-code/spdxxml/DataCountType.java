
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;
import java.math.BigInteger;

/** 
 * A data type for the occurrence of an artifact
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DataCountType">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:integer">
 *       &lt;xs:attributeGroup ref="ns1:SimpleObjectAttributeGroup"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DataCountType
{
    private BigInteger integer;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public BigInteger getInteger() {
        return integer;
    }

    /** 
     * Set the extension value.
     * 
     * @param integer
     */
    public void setInteger(BigInteger integer) {
        this.integer = integer;
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

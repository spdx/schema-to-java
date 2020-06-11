
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;
import java.math.BigInteger;

/** 
 * A data type for the occurrence of an artifact
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

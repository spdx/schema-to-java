
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;
import java.math.BigInteger;

/** 
 * A data type for the Patch version. Patch version Z (x.y.Z | x &gt; 0) MUST be incremented if only backwards compatible bug fixes are introduced. A bug fix is defined as an
 internal change that fixes incorrect behavior.(https://semver.org/spec/v2.0.0.html)
 */
public class PatchVersionType
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

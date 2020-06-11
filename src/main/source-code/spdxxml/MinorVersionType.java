
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;
import java.math.BigInteger;

/** 
 * A data type for the Minor version. Minor version Y (x.Y.z | x &gt; 0) MUST be incremented if new, backwards compatible functionality is introduced to the public API. It MUST
 be incremented if any public API functionality is marked as deprecated. It MAY be incremented if substantial new functionality or improvements are introduced within the private code. It
 MAY include patch level changes. Patch version MUST be reset to 0 when minor version is incremented.(https://semver.org/spec/v2.0.0.html)
 */
public class MinorVersionType
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

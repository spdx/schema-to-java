
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;
import java.math.BigInteger;

/** 
 * A data type for the Major version. The value zero (0.y.z) is for initial development. Anything may change at any time. The public API should not be considered stable.
 Version 1.0.0 defines the public API. The way in which the version number is incremented after this release is dependent on this public API and how it changes. Major version X (X.y.z | X
 &gt; 0) MUST be incremented if any backwards incompatible changes are introduced to the public API. It MAY include minor and patch level changes. Patch and minor version MUST be reset to 0
 when major version is incremented.(https://semver.org/spec/v2.0.0.html)
 */
public class MajorVersionType
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


package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for Identifies the version of this specification that was used to produce this SPDX document. The value for this version of the spec is SPDX-1.2. The values
 SPDX-1.0 and SPDX-1.1 may also be supported by SPDX tools for backwards compatibility purposes.
 */
public class SpecVersionTextType
{
    private String string;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public String getString() {
        return string;
    }

    /** 
     * Set the extension value.
     * 
     * @param string
     */
    public void setString(String string) {
        this.string = string;
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

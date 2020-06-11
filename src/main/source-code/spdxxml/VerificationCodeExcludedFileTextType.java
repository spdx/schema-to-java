
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package
 contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification
 codes in both files.
 */
public class VerificationCodeExcludedFileTextType
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

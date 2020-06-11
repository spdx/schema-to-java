
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for FileType properties
 */
public class FileTypeCodeType
{
    private FileTypeCodeSimpleType fileTypeCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public FileTypeCodeSimpleType getFileTypeCodeSimpleType() {
        return fileTypeCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param fileTypeCodeSimpleType
     */
    public void setFileTypeCodeSimpleType(
            FileTypeCodeSimpleType fileTypeCodeSimpleType) {
        this.fileTypeCodeSimpleType = fileTypeCodeSimpleType;
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

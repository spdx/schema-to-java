
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for DownloadLocation properties
 */
public class DownloadLocationCodeType
{
    private DownloadLocationCodeSimpleType downloadLocationCodeSimpleType;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public DownloadLocationCodeSimpleType getDownloadLocationCodeSimpleType() {
        return downloadLocationCodeSimpleType;
    }

    /** 
     * Set the extension value.
     * 
     * @param downloadLocationCodeSimpleType
     */
    public void setDownloadLocationCodeSimpleType(
            DownloadLocationCodeSimpleType downloadLocationCodeSimpleType) {
        this.downloadLocationCodeSimpleType = downloadLocationCodeSimpleType;
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

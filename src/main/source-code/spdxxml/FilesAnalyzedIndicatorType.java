
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;

/** 
 * A data type for Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If “false” indicates
 packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to “false”, the package must not contain any
 files.
 */
public class FilesAnalyzedIndicatorType
{
    private boolean _boolean;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public boolean isBoolean() {
        return _boolean;
    }

    /** 
     * Set the extension value.
     * 
     * @param _boolean
     */
    public void setBoolean(boolean _boolean) {
        this._boolean = _boolean;
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

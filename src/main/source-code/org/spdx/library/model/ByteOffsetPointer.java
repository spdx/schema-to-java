
package org.spdx.library.model;

public class ByteOffsetPointer extends SinglePointer
{
    private String offset;

    ByteOffsetPointer(String Id) {
        super(Id);
    }

    ByteOffsetPointer(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "ByteOffsetPointer";
    }

    /** 
     * Get the 'offset' element value.
     * 
     * @return value
     */
    public String getOffset() {
        return offset;
    }

    /** 
     * Set the 'offset' element value.
     * 
     * @param offset
     */
    public void setOffset(String offset) {
        this.offset = offset;
    }
}

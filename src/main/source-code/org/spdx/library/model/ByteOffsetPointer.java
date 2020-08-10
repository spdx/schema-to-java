
package org.spdx.library.model;

public class ByteOffsetPointer extends SinglePointer
{
    private String offset;

    ByteOffsetPointer(IModelStore modelStore, String documentUri, String id) {
        super(modelStore, documentUri, id);
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

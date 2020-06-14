
package org.spdx.rdf.terms;

public class ByteOffsetPointer extends SinglePointer
{
    private String offset;

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

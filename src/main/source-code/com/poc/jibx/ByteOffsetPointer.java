
package com.poc.jibx;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ByteOffsetPointer">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:OffsetPointer">
 *       &lt;xs:all>
 *         &lt;xs:element type="xs:string" name="offset"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ByteOffsetPointer extends OffsetPointer
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

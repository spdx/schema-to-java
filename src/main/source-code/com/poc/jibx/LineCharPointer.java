
package com.poc.jibx;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LineCharPointer">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:OffsetPointer">
 *       &lt;xs:all>
 *         &lt;xs:element type="xs:string" name="lineNumber"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LineCharPointer extends OffsetPointer
{
    private String lineNumber;

    /** 
     * Get the 'lineNumber' element value.
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'lineNumber' element value.
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
}

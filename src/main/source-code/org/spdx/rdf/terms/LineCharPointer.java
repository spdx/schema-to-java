
package org.spdx.rdf.terms;

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


package org.spdx.library.model;

public class LineCharPointer extends SinglePointer
{
    private String lineNumber;

    LineCharPointer(String Id) {
        super(Id);
    }

    LineCharPointer(IModelStore modelStore, String documentUri, String id) {
        super(modelStore, documentUri, id);
    }

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

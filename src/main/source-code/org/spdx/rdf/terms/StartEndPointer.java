
package org.spdx.rdf.terms;

public class StartEndPointer extends Pointer
{
    private SinglePointer startPointer;
    private SinglePointer endPointer;

    /** 
     * Get the 'startPointer' element value.
     * 
     * @return value
     */
    public SinglePointer getStartPointer() {
        return startPointer;
    }

    /** 
     * Set the 'startPointer' element value.
     * 
     * @param startPointer
     */
    public void setStartPointer(SinglePointer startPointer) {
        this.startPointer = startPointer;
    }

    /** 
     * Get the 'endPointer' element value.
     * 
     * @return value
     */
    public SinglePointer getEndPointer() {
        return endPointer;
    }

    /** 
     * Set the 'endPointer' element value.
     * 
     * @param endPointer
     */
    public void setEndPointer(SinglePointer endPointer) {
        this.endPointer = endPointer;
    }
}


package com.poc.jibx;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StartEndPointer">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:CompoundPointer">
 *       &lt;xs:all>
 *         &lt;xs:element type="ns:SinglePointer" name="startPointer"/>
 *         &lt;xs:element type="ns:SinglePointer" name="endPointer"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StartEndPointer extends CompoundPointer
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

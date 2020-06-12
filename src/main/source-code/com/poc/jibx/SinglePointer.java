
package com.poc.jibx;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SinglePointer">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:Pointer">
 *       &lt;xs:all>
 *         &lt;xs:element type="ns:File" name="reference"/>
 *       &lt;/xs:all>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SinglePointer extends Pointer
{
    private File reference;

    /** 
     * Get the 'reference' element value.
     * 
     * @return value
     */
    public File getReference() {
        return reference;
    }

    /** 
     * Set the 'reference' element value.
     * 
     * @param reference
     */
    public void setReference(File reference) {
        this.reference = reference;
    }
}

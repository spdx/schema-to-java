
package org.spdx.rdf.terms;

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

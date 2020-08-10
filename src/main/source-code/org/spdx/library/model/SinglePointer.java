
package org.spdx.library.model;

public class SinglePointer extends Pointer
{
    private File reference;

    SinglePointer(IModelStore modelStore, String documentUri, String id) {
        super(modelStore, documentUri, id);
    }

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

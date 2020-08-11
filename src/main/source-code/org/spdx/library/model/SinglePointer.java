
package org.spdx.library.model;

public class SinglePointer extends Pointer
{
    private File reference;

    SinglePointer(String Id) {
        super(Id);
    }

    SinglePointer(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
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

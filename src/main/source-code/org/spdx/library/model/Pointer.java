
package org.spdx.library.model;

public abstract class Pointer extends ModelObject
{
    Pointer(String Id) {
        super(Id);
    }

    Pointer(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "Pointer";
    }
}

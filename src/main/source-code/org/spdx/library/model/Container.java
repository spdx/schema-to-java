
package org.spdx.library.model;

public abstract class Container extends ModelObject
{
    Container(String Id) {
        super(Id);
    }

    Container(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "Container";
    }
}

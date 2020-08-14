
package org.spdx.library.model;

public abstract class Project extends ModelObject
{
    Project(String Id) {
        super(Id);
    }

    Project(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "Project";
    }
}

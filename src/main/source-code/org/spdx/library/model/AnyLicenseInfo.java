
package org.spdx.library.model;

/** 
 * The AnyLicenseInfo class includes all resources that represent licensing information.
 */
public abstract class AnyLicenseInfo extends ModelObject
{
    AnyLicenseInfo(String Id) {
        super(Id);
    }

    AnyLicenseInfo(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }
}

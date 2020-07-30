
package org.spdx.library.model;

/** 
 * Category used for ExternalRef
 */
public enum ReferenceCategory {
    REFERENCE_CATEGORY_SECURITY("referenceCategory_security"), /** 
                                                               * These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time.
                                                               */
    REFERENCE_CATEGORY_PERSISTENT_ID(
            "referenceCategory_persistentId"), REFERENCE_CATEGORY_PACKAGE_MANAGER(
                    "referenceCategory_packageManager"), REFERENCE_CATEGORY_OTHER(
                            "referenceCategory_other");
    private final String value;

    private ReferenceCategory(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static ReferenceCategory convert(String value) {
        for (ReferenceCategory inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

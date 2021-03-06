
package org.spdx.library.model;

/** 
 * Category used for ExternalRef
 */
public enum ReferenceCategory implements IndividualUriValue {
    SECURITY("referenceCategory_security"), /** 
                                             * These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time.
                                             */
    PERSISTENT_ID("referenceCategory_persistentId"), PACKAGE_MANAGER(
            "referenceCategory_packageManager"), OTHER(
            "referenceCategory_other");
    private final String value;

    public String getLongName() {
        return "value";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }

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


package org.spdx.library.model;

/** 
 * Category used for ExternalRef
 */
public enum ReferenceCategory implements IndividualUriValue {
    referenceCategory_security, /** 
                                 * These point to objects present in the Software Heritage archive by the means of persistent identifiers that are guaranteed to remain stable (persistent) over time.
                                 */
    referenceCategory_persistentId, referenceCategory_packageManager, referenceCategory_other;
    private String longName;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }
}

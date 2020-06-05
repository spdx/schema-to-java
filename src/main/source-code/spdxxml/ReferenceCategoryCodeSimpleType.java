
package spdxxml;

/** 
 * A data type for ReferenceCategory properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceCategoryCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="ReferenceCategoryOther"/>
 *     &lt;xs:enumeration value="ReferenceCategoryPackageManager"/>
 *     &lt;xs:enumeration value="ReferenceCategorySecurity"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum ReferenceCategoryCodeSimpleType {
    /** 
     * Reference Category
     */
    REFERENCE_CATEGORY_OTHER("ReferenceCategoryOther"), /** 
                                                         * Reference Category
                                                         */
    REFERENCE_CATEGORY_PACKAGE_MANAGER("ReferenceCategoryPackageManager"), /** 
                                                                            * Reference Category
                                                                            */
    REFERENCE_CATEGORY_SECURITY("ReferenceCategorySecurity");
    private final String value;

    private ReferenceCategoryCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static ReferenceCategoryCodeSimpleType convert(String value) {
        for (ReferenceCategoryCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

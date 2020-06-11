
package spdxxml;

/** 
 * A data type for ReferenceCategory properties
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

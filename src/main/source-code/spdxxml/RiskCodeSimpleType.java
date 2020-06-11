
package spdxxml;

/** 
 * A data type for the level of risk associated with a software artifact
 */
public enum RiskCodeSimpleType {
    /** 
     * low
     */
    LOW("low"), /** 
                 * medium
                 */
    MEDIUM("medium"), /** 
                       * high
                       */
    HIGH("high"), /** 
                   * critical
                   */
    CRITICAL("critical");
    private final String value;

    private RiskCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static RiskCodeSimpleType convert(String value) {
        for (RiskCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}


package spdxxml;

/** 
 * A data type to identify a software license category
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LicenseCategoryCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="FOSS"/>
 *     &lt;xs:enumeration value="COTS"/>
 *     &lt;xs:enumeration value="GOSS"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum LicenseCategoryCodeSimpleType {
    /** 
     * FOSS License
     */
    FOSS, /** 
           * COTS License
           */
    COTS, /** 
           * GOSS License
           */
    GOSS
}

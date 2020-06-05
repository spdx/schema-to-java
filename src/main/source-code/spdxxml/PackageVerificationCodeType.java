
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for PackageVerificationCode type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:spdx-xml:1.0" xmlns:ns1="http://release.niem.gov/niem/structures/4.0/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PackageVerificationCodeType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns1:ObjectType">
 *       &lt;xs:sequence>
 *         &lt;xs:element ref="ns:PackageVerificationCodeValue" minOccurs="1" maxOccurs="1"/>
 *         &lt;xs:element ref="ns:VerificationCodeExcludedFileText" minOccurs="0"/>
 *         &lt;xs:element ref="ns:PackageVerificationCodeAugmentationPoint" minOccurs="0" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PackageVerificationCodeType extends ObjectType
{
    private PackageVerificationCodeValueType packageVerificationCodeValue;
    private VerificationCodeExcludedFileTextType verificationCodeExcludedFileText;
    private List<PackageVerificationCodeAugmentationPoint> packageVerificationCodeAugmentationPointList = new ArrayList<PackageVerificationCodeAugmentationPoint>();

    /** 
     * Get the 'PackageVerificationCodeValue' element value.
     * 
     * @return value
     */
    public PackageVerificationCodeValueType getPackageVerificationCodeValue() {
        return packageVerificationCodeValue;
    }

    /** 
     * Set the 'PackageVerificationCodeValue' element value.
     * 
     * @param packageVerificationCodeValue
     */
    public void setPackageVerificationCodeValue(
            PackageVerificationCodeValueType packageVerificationCodeValue) {
        this.packageVerificationCodeValue = packageVerificationCodeValue;
    }

    /** 
     * Get the 'VerificationCodeExcludedFileText' element value.
     * 
     * @return value
     */
    public VerificationCodeExcludedFileTextType getVerificationCodeExcludedFileText() {
        return verificationCodeExcludedFileText;
    }

    /** 
     * Set the 'VerificationCodeExcludedFileText' element value.
     * 
     * @param verificationCodeExcludedFileText
     */
    public void setVerificationCodeExcludedFileText(
            VerificationCodeExcludedFileTextType verificationCodeExcludedFileText) {
        this.verificationCodeExcludedFileText = verificationCodeExcludedFileText;
    }

    /** 
     * Get the list of 'PackageVerificationCodeAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<PackageVerificationCodeAugmentationPoint> getPackageVerificationCodeAugmentationPointList() {
        return packageVerificationCodeAugmentationPointList;
    }

    /** 
     * Set the list of 'PackageVerificationCodeAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setPackageVerificationCodeAugmentationPointList(
            List<PackageVerificationCodeAugmentationPoint> list) {
        packageVerificationCodeAugmentationPointList = list;
    }
}

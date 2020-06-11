
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for PackageVerificationCode type
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

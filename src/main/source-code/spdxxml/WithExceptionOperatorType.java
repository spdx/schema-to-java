
package spdxxml;

import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for WithExceptionOperator type
 */
public class WithExceptionOperatorType extends AnyLicenseInfoType
{
    private Member member;
    private LicenseExceptionType licenseException;
    private List<WithExceptionOperatorAugmentationPoint> withExceptionOperatorAugmentationPointList = new ArrayList<WithExceptionOperatorAugmentationPoint>();

    /** 
     * Get the 'Member' element value.
     * 
     * @return value
     */
    public Member getMember() {
        return member;
    }

    /** 
     * Set the 'Member' element value.
     * 
     * @param member
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /** 
     * Get the 'LicenseException' element value.
     * 
     * @return value
     */
    public LicenseExceptionType getLicenseException() {
        return licenseException;
    }

    /** 
     * Set the 'LicenseException' element value.
     * 
     * @param licenseException
     */
    public void setLicenseException(LicenseExceptionType licenseException) {
        this.licenseException = licenseException;
    }

    /** 
     * Get the list of 'WithExceptionOperatorAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<WithExceptionOperatorAugmentationPoint> getWithExceptionOperatorAugmentationPointList() {
        return withExceptionOperatorAugmentationPointList;
    }

    /** 
     * Set the list of 'WithExceptionOperatorAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setWithExceptionOperatorAugmentationPointList(
            List<WithExceptionOperatorAugmentationPoint> list) {
        withExceptionOperatorAugmentationPointList = list;
    }
}

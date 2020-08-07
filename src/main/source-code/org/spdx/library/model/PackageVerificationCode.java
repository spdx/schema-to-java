
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * A manifest based verification code (the algorithm is defined in section 4.7 of the full specification) of the SPDX Item. This allows consumers of this data and/or database to determine if an SPDX item they have in hand is identical to the SPDX item from which the data was produced. This algorithm works even if the SPDX document is included in the SPDX item.
 */
public class PackageVerificationCode extends ModelObject
{
    private byte[] packageVerificationCodeValue;
    private List<String> packageVerificationCodeExcludedFileList = new ArrayList<String>();

    PackageVerificationCode(String Id) {
    }

    /** 
     * Get the 'packageVerificationCodeValue' element value. The actual package verification code as a hex encoded value.
     * 
     * @return value
     */
    public byte[] getPackageVerificationCodeValue() {
        return packageVerificationCodeValue;
    }

    /** 
     * Set the 'packageVerificationCodeValue' element value. The actual package verification code as a hex encoded value.
     * 
     * @param packageVerificationCodeValue
     */
    public void setPackageVerificationCodeValue(
            byte[] packageVerificationCodeValue) {
        this.packageVerificationCodeValue = packageVerificationCodeValue;
    }

    /** 
     * Get the list of 'packageVerificationCodeExcludedFile' element items. A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.
     * 
     * @return list
     */
    public List<String> getPackageVerificationCodeExcludedFileList() {
        return packageVerificationCodeExcludedFileList;
    }

    /** 
     * Set the list of 'packageVerificationCodeExcludedFile' element items. A file that was excluded when calculating the package verification code. This is usually a file containing SPDX data regarding the package. If a package contains more than one SPDX file all SPDX files must be excluded from the package verification code. If this is not done it would be impossible to correctly calculate the verification codes in both files.
     * 
     * @param list
     */
    public void setPackageVerificationCodeExcludedFileList(List<String> list) {
        packageVerificationCodeExcludedFileList = list;
    }
}

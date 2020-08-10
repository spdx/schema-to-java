
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * An SpdxItem is a potentially copyrightable work.
 */
public class SpdxItem extends SpdxElement
{
    private String licenseComments;
    private List<String> attributionTextList = new ArrayList<String>();
    private String copyrightText;
    private List<SimpleLicensingInfo> licenseInfoFromFileList = new ArrayList<SimpleLicensingInfo>();

    SpdxItem(IModelStore modelStore, String documentUri, String id) {
        super(modelStore, documentUri, id);
    }

    /** 
     * Get the 'licenseComments' element value. The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.
     * 
     * @return value
     */
    public String getLicenseComments() {
        return licenseComments;
    }

    /** 
     * Set the 'licenseComments' element value. The licenseComments property allows the preparer of the SPDX document to describe why the licensing in spdx:licenseConcluded was chosen.
     * 
     * @param licenseComments
     */
    public void setLicenseComments(String licenseComments) {
        this.licenseComments = licenseComments;
    }

    /** 
     * Get the list of 'attributionText' element items. This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include theactual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     * @return list
     */
    public List<String> getAttributionTextList() {
        return attributionTextList;
    }

    /** 
     * Set the list of 'attributionText' element items. This field provides a place for the SPDX data creator to record acknowledgements that may be required to be communicated in some contexts. This is not meant to include theactual complete license text (see licenseConculded and licenseDeclared), and may or may not include copyright notices (see also copyrightText). The SPDX data creator may use this field to record other acknowledgements, such as particular clauses from license texts, which may be necessary or desirable to reproduce.
     * 
     * @param list
     */
    public void setAttributionTextList(List<String> list) {
        attributionTextList = list;
    }

    /** 
     * Get the 'copyrightText' element value. The text of copyright declarations recited in the Package or File.
     * 
     * @return value
     */
    public String getCopyrightText() {
        return copyrightText;
    }

    /** 
     * Set the 'copyrightText' element value. The text of copyright declarations recited in the Package or File.
     * 
     * @param copyrightText
     */
    public void setCopyrightText(String copyrightText) {
        this.copyrightText = copyrightText;
    }

    /** 
     * Get the list of 'licenseInfoFromFiles' element items. The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.
     * 
     * @return list
     */
    public List<SimpleLicensingInfo> getLicenseInfoFromFileList() {
        return licenseInfoFromFileList;
    }

    /** 
     * Set the list of 'licenseInfoFromFiles' element items. The licensing information that was discovered directly within the package. There will be an instance of this property for each distinct value of alllicenseInfoInFile properties of all files contained in the package.
     * 
     * @param list
     */
    public void setLicenseInfoFromFileList(List<SimpleLicensingInfo> list) {
        licenseInfoFromFileList = list;
    }
}


package org.spdx.library.model;

/** 
 * A License represents a copyright license. The SPDX license list website is annotated with these properties (using RDFa) to allow license data published there to be easily processed. The license list is populated in accordance with the License List fields guidelines. These guidelines are not normative and may change over time. SPDX tooling should not rely on values in the license list conforming to the current guidelines.
 */
public class License extends SimpleLicensingInfo
{
    private String standardLicenseHeaderTemplate;
    private String licenseText;
    private boolean isOsiApproved;
    private Boolean isFsfLibre;
    private String standardLicenseTemplate;
    private String standardLicenseHeader;

    License() {
    }

    /** 
     * Get the 'standardLicenseHeaderTemplate' element value. License template which describes sections of the license header which can be varied. See License Template section of the specification for format information.
     * 
     * @return value
     */
    public String getStandardLicenseHeaderTemplate() {
        return standardLicenseHeaderTemplate;
    }

    /** 
     * Set the 'standardLicenseHeaderTemplate' element value. License template which describes sections of the license header which can be varied. See License Template section of the specification for format information.
     * 
     * @param standardLicenseHeaderTemplate
     */
    public void setStandardLicenseHeaderTemplate(
            String standardLicenseHeaderTemplate) {
        this.standardLicenseHeaderTemplate = standardLicenseHeaderTemplate;
    }

    /** 
     * Get the 'licenseText' element value. Full text of the license.
     * 
     * @return value
     */
    public String getLicenseText() {
        return licenseText;
    }

    /** 
     * Set the 'licenseText' element value. Full text of the license.
     * 
     * @param licenseText
     */
    public void setLicenseText(String licenseText) {
        this.licenseText = licenseText;
    }

    /** 
     * Get the 'isOsiApproved' element value. Indicates if the OSI has approved the license.
     * 
     * @return value
     */
    public boolean isIsOsiApproved() {
        return isOsiApproved;
    }

    /** 
     * Set the 'isOsiApproved' element value. Indicates if the OSI has approved the license.
     * 
     * @param isOsiApproved
     */
    public void setIsOsiApproved(boolean isOsiApproved) {
        this.isOsiApproved = isOsiApproved;
    }

    /** 
     * Get the 'isFsfLibre' element value.
     * 
     * @return value
     */
    public Boolean getIsFsfLibre() {
        return isFsfLibre;
    }

    /** 
     * Set the 'isFsfLibre' element value.
     * 
     * @param isFsfLibre
     */
    public void setIsFsfLibre(Boolean isFsfLibre) {
        this.isFsfLibre = isFsfLibre;
    }

    /** 
     * Get the 'standardLicenseTemplate' element value. License template which describes sections of the license which can be varied. See License Template section of the specification for format information.
     * 
     * @return value
     */
    public String getStandardLicenseTemplate() {
        return standardLicenseTemplate;
    }

    /** 
     * Set the 'standardLicenseTemplate' element value. License template which describes sections of the license which can be varied. See License Template section of the specification for format information.
     * 
     * @param standardLicenseTemplate
     */
    public void setStandardLicenseTemplate(String standardLicenseTemplate) {
        this.standardLicenseTemplate = standardLicenseTemplate;
    }

    /** 
     * Get the 'standardLicenseHeader' element value. License author's preferred text to indicated that a file is covered by the license.
     * 
     * @return value
     */
    public String getStandardLicenseHeader() {
        return standardLicenseHeader;
    }

    /** 
     * Set the 'standardLicenseHeader' element value. License author's preferred text to indicated that a file is covered by the license.
     * 
     * @param standardLicenseHeader
     */
    public void setStandardLicenseHeader(String standardLicenseHeader) {
        this.standardLicenseHeader = standardLicenseHeader;
    }
}

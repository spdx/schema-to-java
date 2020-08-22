
package org.spdx.library.model;

/** 
 * An ExtractedLicensingInfo represents a license or licensing notice that was found in the package. Any license text that is recognized as a license may be represented as a License rather than an ExtractedLicensingInfo.
 */
public class ExtractedLicensingInfo extends SimpleLicensingInfo
{
    private String extractedText;

    ExtractedLicensingInfo(String Id) {
        super(Id);
    }

    ExtractedLicensingInfo(IModelStore modelStore, String documentUri,
            String id, ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "ExtractedLicensingInfo";
    }

    /** 
    * Get the 'extractedText' element value. Verbatim license or licensing notice text that was discovered.
    * 
    * @return value
    */
    public String getExtractedText() {
        return extractedText;
    }

    /** 
    * Set the 'extractedText' element value. Verbatim license or licensing notice text that was discovered.
    * 
    * @param extractedText
    */
    public void setExtractedText(String extractedText) {
        this.extractedText = extractedText;
    }
}

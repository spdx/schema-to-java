
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for information about what is to be considered the authoritative source for a given artifact or source repository. This includes an URL, a hash of the source,
 and whether or not the source has been signed
 */
public class AuthoritativeSourceInformationType extends ObjectType
{
    private SourceHashText sourceHashText;
    private SourceURIText sourceURIText;
    private AuthoritativeDigitalSignatureIndicatorType authoritativeDigitalSignatureIndicator;
    private List<AuthoritativeSourceInformationAugmentationPoint> authoritativeSourceInformationAugmentationPointList = new ArrayList<AuthoritativeSourceInformationAugmentationPoint>();

    /** 
     * Get the 'SourceHashText' element value. A data item a for a sha1 encoded string
     * 
     * @return value
     */
    public SourceHashText getSourceHashText() {
        return sourceHashText;
    }

    /** 
     * Set the 'SourceHashText' element value. A data item a for a sha1 encoded string
     * 
     * @param sourceHashText
     */
    public void setSourceHashText(SourceHashText sourceHashText) {
        this.sourceHashText = sourceHashText;
    }

    /** 
     * Get the 'SourceURIText' element value. A data item for a World Wide Web Consortium Uniform Reference Indicator
     * 
     * @return value
     */
    public SourceURIText getSourceURIText() {
        return sourceURIText;
    }

    /** 
     * Set the 'SourceURIText' element value. A data item for a World Wide Web Consortium Uniform Reference Indicator
     * 
     * @param sourceURIText
     */
    public void setSourceURIText(SourceURIText sourceURIText) {
        this.sourceURIText = sourceURIText;
    }

    /** 
     * Get the 'AuthoritativeDigitalSignatureIndicator' element value. True if has an authoritative digital signatiure; false if not.
     * 
     * @return value
     */
    public AuthoritativeDigitalSignatureIndicatorType getAuthoritativeDigitalSignatureIndicator() {
        return authoritativeDigitalSignatureIndicator;
    }

    /** 
     * Set the 'AuthoritativeDigitalSignatureIndicator' element value. True if has an authoritative digital signatiure; false if not.
     * 
     * @param authoritativeDigitalSignatureIndicator
     */
    public void setAuthoritativeDigitalSignatureIndicator(
            AuthoritativeDigitalSignatureIndicatorType authoritativeDigitalSignatureIndicator) {
        this.authoritativeDigitalSignatureIndicator = authoritativeDigitalSignatureIndicator;
    }

    /** 
     * Get the list of 'AuthoritativeSourceInformationAugmentationPoint' element items. An augmentation point for AuthoritativeSourceInformationType
     * 
     * @return list
     */
    public List<AuthoritativeSourceInformationAugmentationPoint> getAuthoritativeSourceInformationAugmentationPointList() {
        return authoritativeSourceInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'AuthoritativeSourceInformationAugmentationPoint' element items. An augmentation point for AuthoritativeSourceInformationType
     * 
     * @param list
     */
    public void setAuthoritativeSourceInformationAugmentationPointList(
            List<AuthoritativeSourceInformationAugmentationPoint> list) {
        authoritativeSourceInformationAugmentationPointList = list;
    }
}

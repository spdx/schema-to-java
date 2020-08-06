
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * An SpdxDocument is a summary of the contents, provenance, ownership and licensing analysis of a specific software package. This is, effectively, the top level of SPDX information.
 */
public class SpdxDocument extends SpdxElement
{
    private List<Review> reviewedList = new ArrayList<Review>();
    private List<ExtractedLicensingInfo> hasExtractedLicensingInfoList = new ArrayList<ExtractedLicensingInfo>();
    private String specVersion;
    private AnyLicenseInfo dataLicense;
    private List<_Package> describesPackageList = new ArrayList<_Package>();
    private List<ExternalDocumentRef> externalDocumentRefList = new ArrayList<ExternalDocumentRef>();
    private CreationInfo creationInfo;

    SpdxDocument() {
    }

    /** 
     * Get the list of 'reviewed' element items. Reviewed
     * 
     * @return list
     */
    public List<Review> getReviewedList() {
        return reviewedList;
    }

    /** 
     * Set the list of 'reviewed' element items. Reviewed
     * 
     * @param list
     */
    public void setReviewedList(List<Review> list) {
        reviewedList = list;
    }

    /** 
     * Get the list of 'hasExtractedLicensingInfo' element items. Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.
     * 
     * @return list
     */
    public List<ExtractedLicensingInfo> getHasExtractedLicensingInfoList() {
        return hasExtractedLicensingInfoList;
    }

    /** 
     * Set the list of 'hasExtractedLicensingInfo' element items. Indicates that a particular ExtractedLicensingInfo was defined in the subject SpdxDocument.
     * 
     * @param list
     */
    public void setHasExtractedLicensingInfoList(
            List<ExtractedLicensingInfo> list) {
        hasExtractedLicensingInfoList = list;
    }

    /** 
     * Get the 'specVersion' element value. Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.
     * 
     * @return value
     */
    public String getSpecVersion() {
        return specVersion;
    }

    /** 
     * Set the 'specVersion' element value. Provide a reference number that can be used to understand how to parse and interpret the rest of the file. It will enable both future changes to the specification and to support backward compatibility. The version number consists of a major and minor version indicator. The major field will be incremented when incompatible changes between versions are made (one or more sections are created, modified or deleted). The minor field will be incremented when backwards compatible changes are made.
     * 
     * @param specVersion
     */
    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    /** 
     * Get the 'dataLicense' element value. Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of "database rights" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you "as-is" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.
     * 
     * @return value
     */
    public AnyLicenseInfo getDataLicense() {
        return dataLicense;
    }

    /** 
     * Set the 'dataLicense' element value. Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata"). The SPDX specification contains numerous fields where an SPDX document creator may provide relevant explanatory text in SPDX-Metadata. Without opining on the lawfulness of "database rights" (in jurisdictions where applicable), such explanatory text is copyrightable subject matter in most Berne Convention countries. By using the SPDX specification, or any portion hereof, you hereby agree that any copyright rights (as determined by your jurisdiction) in any SPDX-Metadata, including without limitation explanatory text, shall be subject to the terms of the Creative Commons CC0 1.0 Universal license. For SPDX-Metadata not containing any copyright rights, you hereby agree and acknowledge that the SPDX-Metadata is provided to you "as-is" and without any representations or warranties of any kind concerning the SPDX-Metadata, express, implied, statutory or otherwise, including without limitation warranties of title, merchantability, fitness for a particular purpose, non-infringement, or the absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not discoverable, all to the greatest extent permissible under applicable law.
     * 
     * @param dataLicense
     */
    public void setDataLicense(AnyLicenseInfo dataLicense) {
        this.dataLicense = dataLicense;
    }

    /** 
     * Get the list of 'describesPackage' element items. The describesPackage property relates an SpdxDocument to the package which it describes.
     * 
     * @return list
     */
    public List<_Package> getDescribesPackageList() {
        return describesPackageList;
    }

    /** 
     * Set the list of 'describesPackage' element items. The describesPackage property relates an SpdxDocument to the package which it describes.
     * 
     * @param list
     */
    public void setDescribesPackageList(List<_Package> list) {
        describesPackageList = list;
    }

    /** 
     * Get the list of 'externalDocumentRef' element items. Identify any external SPDX documents referenced within this SPDX document.
     * 
     * @return list
     */
    public List<ExternalDocumentRef> getExternalDocumentRefList() {
        return externalDocumentRefList;
    }

    /** 
     * Set the list of 'externalDocumentRef' element items. Identify any external SPDX documents referenced within this SPDX document.
     * 
     * @param list
     */
    public void setExternalDocumentRefList(List<ExternalDocumentRef> list) {
        externalDocumentRefList = list;
    }

    /** 
     * Get the 'creationInfo' element value. The creationInfo property relates an SpdxDocument to a set of information about the creation of the SpdxDocument.
     * 
     * @return value
     */
    public CreationInfo getCreationInfo() {
        return creationInfo;
    }

    /** 
     * Set the 'creationInfo' element value. The creationInfo property relates an SpdxDocument to a set of information about the creation of the SpdxDocument.
     * 
     * @param creationInfo
     */
    public void setCreationInfo(CreationInfo creationInfo) {
        this.creationInfo = creationInfo;
    }
}

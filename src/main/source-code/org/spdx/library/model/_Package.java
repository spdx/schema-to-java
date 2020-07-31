
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * A Package represents a collection of software files that are delivered as a single functional component.
 */
public class _Package extends SpdxItem
{
    private String homepage;
    private String supplier;
    private PackageVerificationCode packageVerificationCode;
    private List<Checksum> checksumList = new ArrayList<Checksum>();
    private String downloadLocation;
    private Boolean filesAnalyzed;
    private List<ExternalRef> externalRefList = new ArrayList<ExternalRef>();
    private List<File> hasFileList = new ArrayList<File>();
    private String summary;
    private String originator;
    private String packageFileName;
    private String versionInfo;
    private String sourceInfo;
    private String description;

    /** 
    * Get the 'homepage' element value.
    * 
    * @return value
    */
    public String getHomepage() {
        return homepage;
    }

    /** 
    * Set the 'homepage' element value.
    * 
    * @param homepage
    */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /** 
    * Get the 'supplier' element value. The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.
    * 
    * @return value
    */
    public String getSupplier() {
        return supplier;
    }

    /** 
    * Set the 'supplier' element value. The name and, optionally, contact information of the person or organization who was the immediate supplier of this package to the recipient. The supplier may be different than originator when the software has been repackaged. Values of this property must conform to the agent and tool syntax.
    * 
    * @param supplier
    */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /** 
    * Get the 'packageVerificationCode' element value. A manifest based verification code (the algorithm is defined in section 3.9.4 of the full specification) of the package. This allows consumers of this data and/or database to determine if a package they have in hand is identical to the package from which the data was produced. This algorithm works even if the SPDX document is included in the package.
    * 
    * @return value
    */
    public PackageVerificationCode getPackageVerificationCode() {
        return packageVerificationCode;
    }

    /** 
    * Set the 'packageVerificationCode' element value. A manifest based verification code (the algorithm is defined in section 3.9.4 of the full specification) of the package. This allows consumers of this data and/or database to determine if a package they have in hand is identical to the package from which the data was produced. This algorithm works even if the SPDX document is included in the package.
    * 
    * @param packageVerificationCode
    */
    public void setPackageVerificationCode(
            PackageVerificationCode packageVerificationCode) {
        this.packageVerificationCode = packageVerificationCode;
    }

    /** 
    * Get the list of 'checksum' element items. The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
    * 
    * @return list
    */
    public List<Checksum> getChecksumList() {
        return checksumList;
    }

    /** 
    * Set the list of 'checksum' element items. The checksum property provides a mechanism that can be used to verify that the contents of a File or Package have not changed.
    * 
    * @param list
    */
    public void setChecksumList(List<Checksum> list) {
        checksumList = list;
    }

    /** 
    * Get the 'downloadLocation' element value. The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.
    * 
    * @return value
    */
    public String getDownloadLocation() {
        return downloadLocation;
    }

    /** 
    * Set the 'downloadLocation' element value. The URI at which this package is available for download. Private (i.e., not publicly reachable) URIs are acceptable as values of this property. The values http://spdx.org/rdf/terms#none and http://spdx.org/rdf/terms#noassertion may be used to specify that the package is not downloadable or that no attempt was made to determine its download location, respectively.
    * 
    * @param downloadLocation
    */
    public void setDownloadLocation(String downloadLocation) {
        this.downloadLocation = downloadLocation;
    }

    /** 
    * Get the 'filesAnalyzed' element value. Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.
    * 
    * @return value
    */
    public Boolean getFilesAnalyzed() {
        return filesAnalyzed;
    }

    /** 
    * Set the 'filesAnalyzed' element value. Indicates whether the file content of this package has been available for or subjected to analysis when creating the SPDX document. If false indicates packages that represent metadata or URI references to a project, product, artifact, distribution or a component. If set to false, the package must not contain any files.
    * 
    * @param filesAnalyzed
    */
    public void setFilesAnalyzed(Boolean filesAnalyzed) {
        this.filesAnalyzed = filesAnalyzed;
    }

    /** 
    * Get the list of 'externalRef' element items. An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
    * 
    * @return list
    */
    public List<ExternalRef> getExternalRefList() {
        return externalRefList;
    }

    /** 
    * Set the list of 'externalRef' element items. An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package.
    * 
    * @param list
    */
    public void setExternalRefList(List<ExternalRef> list) {
        externalRefList = list;
    }

    /** 
    * Get the list of 'hasFile' element items. Indicates that a particular file belongs to a package.
    * 
    * @return list
    */
    public List<File> getHasFileList() {
        return hasFileList;
    }

    /** 
    * Set the list of 'hasFile' element items. Indicates that a particular file belongs to a package.
    * 
    * @param list
    */
    public void setHasFileList(List<File> list) {
        hasFileList = list;
    }

    /** 
    * Get the 'summary' element value. Provides a short description of the package.
    * 
    * @return value
    */
    public String getSummary() {
        return summary;
    }

    /** 
    * Set the 'summary' element value. Provides a short description of the package.
    * 
    * @param summary
    */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /** 
    * Get the 'originator' element value. The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.
    * 
    * @return value
    */
    public String getOriginator() {
        return originator;
    }

    /** 
    * Set the 'originator' element value. The name and, optionally, contact information of the person or organization that originally created the package. Values of this property must conform to the agent and tool syntax.
    * 
    * @param originator
    */
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    /** 
    * Get the 'packageFileName' element value. The base name of the package file name. For example, zlib-1.2.5.tar.gz.
    * 
    * @return value
    */
    public String getPackageFileName() {
        return packageFileName;
    }

    /** 
    * Set the 'packageFileName' element value. The base name of the package file name. For example, zlib-1.2.5.tar.gz.
    * 
    * @param packageFileName
    */
    public void setPackageFileName(String packageFileName) {
        this.packageFileName = packageFileName;
    }

    /** 
    * Get the 'versionInfo' element value. Provides an indication of the version of the package that is described by this SpdxDocument.
    * 
    * @return value
    */
    public String getVersionInfo() {
        return versionInfo;
    }

    /** 
    * Set the 'versionInfo' element value. Provides an indication of the version of the package that is described by this SpdxDocument.
    * 
    * @param versionInfo
    */
    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    /** 
    * Get the 'sourceInfo' element value. Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.
    * 
    * @return value
    */
    public String getSourceInfo() {
        return sourceInfo;
    }

    /** 
    * Set the 'sourceInfo' element value. Allows the producer(s) of the SPDX document to describe how the package was acquired and/or changed from the original source.
    * 
    * @param sourceInfo
    */
    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    /** 
    * Get the 'description' element value. Provides a detailed description of the package.
    * 
    * @return value
    */
    public String getDescription() {
        return description;
    }

    /** 
    * Set the 'description' element value. Provides a detailed description of the package.
    * 
    * @param description
    */
    public void setDescription(String description) {
        this.description = description;
    }
}

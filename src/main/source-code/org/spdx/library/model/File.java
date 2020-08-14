
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * A File represents a named sequence of information that is contained in a software package.
 */
public class File extends SpdxItem
{
    private List<Project> artifactOfList = new ArrayList<Project>();
    private List<FileType> fileTypeList = new ArrayList<FileType>();
    private String fileName;
    private List<String> fileContributorList = new ArrayList<String>();
    private List<SimpleLicensingInfo> licenseInfoInFileList = new ArrayList<SimpleLicensingInfo>();
    private List<Checksum> checksumList = new ArrayList<Checksum>();
    private String noticeText;
    private List<File> fileDependencyList = new ArrayList<File>();

    File(String Id) {
        super(Id);
    }

    File(IModelStore modelStore, String documentUri, String id,
            ModelCopyManager copyManager, Boolean create) {
        super(modelStore, documentUri, id, copyManager, create);
    }

    public String getType() {
        return "File";
    }

    /** 
     * Get the list of 'artifactOf' element items. Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.
     * 
     * @return list
     */
    public List<Project> getArtifactOfList() {
        return artifactOfList;
    }

    /** 
     * Set the list of 'artifactOf' element items. Indicates the project in which the SpdxElement originated. Tools must preserve doap:homepage and doap:name properties and the URI (if one is known) of doap:Project resources that are values of this property. All other properties of doap:Projects are not directly supported by SPDX and may be dropped when translating to or from some SPDX formats.
     * 
     * @param list
     */
    public void setArtifactOfList(List<Project> list) {
        artifactOfList = list;
    }

    /** 
     * Get the list of 'fileType' element items. The type of the file.
     * 
     * @return list
     */
    public List<FileType> getFileTypeList() {
        return fileTypeList;
    }

    /** 
     * Set the list of 'fileType' element items. The type of the file.
     * 
     * @param list
     */
    public void setFileTypeList(List<FileType> list) {
        fileTypeList = list;
    }

    /** 
     * Get the 'fileName' element value. The name of the file relative to the root of the package.
     * 
     * @return value
     */
    public String getFileName() {
        return fileName;
    }

    /** 
     * Set the 'fileName' element value. The name of the file relative to the root of the package.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /** 
     * Get the list of 'fileContributor' element items. This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.
     * 
     * @return list
     */
    public List<String> getFileContributorList() {
        return fileContributorList;
    }

    /** 
     * Set the list of 'fileContributor' element items. This field provides a place for the SPDX file creator to record file contributors. Contributors could include names of copyright holders and/or authors who may not be copyright holders yet contributed to the file content.
     * 
     * @param list
     */
    public void setFileContributorList(List<String> list) {
        fileContributorList = list;
    }

    /** 
     * Get the list of 'licenseInfoInFile' element items. Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.
     * 
     * @return list
     */
    public List<SimpleLicensingInfo> getLicenseInfoInFileList() {
        return licenseInfoInFileList;
    }

    /** 
     * Set the list of 'licenseInfoInFile' element items. Licensing information that was discovered directly in the subject file. This is also considered a declared license for the file.
     * 
     * @param list
     */
    public void setLicenseInfoInFileList(List<SimpleLicensingInfo> list) {
        licenseInfoInFileList = list;
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
     * Get the 'noticeText' element value. This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.
     * 
     * @return value
     */
    public String getNoticeText() {
        return noticeText;
    }

    /** 
     * Set the 'noticeText' element value. This field provides a place for the SPDX file creator to record potential legal notices found in the file. This may or may not include copyright statements.
     * 
     * @param noticeText
     */
    public void setNoticeText(String noticeText) {
        this.noticeText = noticeText;
    }

    /** 
     * Get the list of 'fileDependency' element items.
     * 
     * @return list
     */
    public List<File> getFileDependencyList() {
        return fileDependencyList;
    }

    /** 
     * Set the list of 'fileDependency' element items.
     * 
     * @param list
     */
    public void setFileDependencyList(List<File> list) {
        fileDependencyList = list;
    }
}

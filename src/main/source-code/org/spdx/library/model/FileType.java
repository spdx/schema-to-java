
package org.spdx.library.model;

/** 
 * Type of file.
 */
public enum FileType implements IndividualUriValue {
    /** 
     * The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); 
    IMAGE if the file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )
     */
    fileType_audio, /** 
                     * Indicates the file is a source code file.
                     */
    fileType_source, /** 
                      * The file is human readable text file (MIME type of text/*).
                      */
    fileType_text, /** 
                    * The file is associated with a video file type (MIME type of video/*).
                    */
    fileType_video, /** 
                     * The file is an SPDX document.
                     */
    fileType_spdx, /** 
                    * Indicates the file is an archive file.
                    */
    fileType_archive, /** 
                       * Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary.
                       */
    fileType_binary, /** 
                      * The file serves as documentation.
                      */
    fileType_documentation, /** 
                             * Indicates the file is not a source, archive or binary file.
                             */
    fileType_other, /** 
                     * The file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  ).
                     */
    fileType_image, /** 
                     *  The file is associated with a specific application type (MIME type of application/* )
                     */
    fileType_application;
    private String longName;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }
}

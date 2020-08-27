
package org.spdx.library.model;

/** 
 * Type of file.
 */
public enum FileType implements IndividualUriValue {
    /** 
     * The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); 
    IMAGE if the file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )
     */
    AUDIO("fileType_audio"), /** 
                              * Indicates the file is a source code file.
                              */
    SOURCE("fileType_source"), /** 
                                * The file is human readable text file (MIME type of text/*).
                                */
    TEXT("fileType_text"), /** 
                            * The file is associated with a video file type (MIME type of video/*).
                            */
    VIDEO("fileType_video"), /** 
                              * The file is an SPDX document.
                              */
    SPDX("fileType_spdx"), /** 
                            * Indicates the file is an archive file.
                            */
    ARCHIVE("fileType_archive"), /** 
                                  * Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary.
                                  */
    BINARY("fileType_binary"), /** 
                                * The file serves as documentation.
                                */
    DOCUMENTATION("fileType_documentation"), /** 
                                              * Indicates the file is not a source, archive or binary file.
                                              */
    OTHER("fileType_other"), /** 
                              * The file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  ).
                              */
    IMAGE("fileType_image"), /** 
                              *  The file is associated with a specific application type (MIME type of application/* )
                              */
    APPLICATION("fileType_application");
    private String longName;
    private final String value;

    public String getLongName() {
        return "longName";
    }

    public String getNameSpace() {
        return "SpdxConstants.SPDX_NAMESPACE";
    }

    public String getIndividualURI() {
        return getLongName() + getNameSpace();
    }

    private FileType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static FileType convert(String value) {
        for (FileType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

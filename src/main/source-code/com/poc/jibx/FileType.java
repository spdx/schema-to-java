
package com.poc.jibx;

/** 
 * Type of file.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="fileType_audio"/>
 *     &lt;xs:enumeration value="fileType_source"/>
 *     &lt;xs:enumeration value="fileType_text"/>
 *     &lt;xs:enumeration value="fileType_video"/>
 *     &lt;xs:enumeration value="fileType_spdx"/>
 *     &lt;xs:enumeration value="fileType_archive"/>
 *     &lt;xs:enumeration value="fileType_binary"/>
 *     &lt;xs:enumeration value="fileType_documentation"/>
 *     &lt;xs:enumeration value="fileType_other"/>
 *     &lt;xs:enumeration value="fileType_image"/>
 *     &lt;xs:enumeration value="fileType_application"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum FileType {
    /** 
     * The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); 
    IMAGE if the file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  )
     */
    FILE_TYPE_AUDIO("fileType_audio"), /** 
                                        * Indicates the file is a source code file.
                                        */
    FILE_TYPE_SOURCE("fileType_source"), /** 
                                          * The file is human readable text file (MIME type of text/*).
                                          */
    FILE_TYPE_TEXT("fileType_text"), /** 
                                      * The file is associated with a video file type (MIME type of video/*).
                                      */
    FILE_TYPE_VIDEO("fileType_video"), /** 
                                        * The file is an SPDX document.
                                        */
    FILE_TYPE_SPDX("fileType_spdx"), /** 
                                      * Indicates the file is an archive file.
                                      */
    FILE_TYPE_ARCHIVE("fileType_archive"), /** 
                                            * Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary.
                                            */
    FILE_TYPE_BINARY("fileType_binary"), /** 
                                          * The file serves as documentation.
                                          */
    FILE_TYPE_DOCUMENTATION("fileType_documentation"), /** 
                                                        * Indicates the file is not a source, archive or binary file.
                                                        */
    FILE_TYPE_OTHER("fileType_other"), /** 
                                        * The file is assoicated with an picture image file (MIME type of image/*,  ie. .jpg, .gif  ).
                                        */
    FILE_TYPE_IMAGE("fileType_image"), /** 
                                        *  The file is associated with a specific application type (MIME type of application/* )
                                        */
    FILE_TYPE_APPLICATION("fileType_application");
    private final String value;

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

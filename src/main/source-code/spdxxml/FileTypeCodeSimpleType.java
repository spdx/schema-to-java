
package spdxxml;

/** 
 * A data type for FileType properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FileTypeCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="FileTypeApplication"/>
 *     &lt;xs:enumeration value="FileTypeArchive"/>
 *     &lt;xs:enumeration value="FileTypeAudio"/>
 *     &lt;xs:enumeration value="FileTypeBinary"/>
 *     &lt;xs:enumeration value="FileTypeDocumentation"/>
 *     &lt;xs:enumeration value="FileTypeImage"/>
 *     &lt;xs:enumeration value="FileTypeOther"/>
 *     &lt;xs:enumeration value="FileTypeSource"/>
 *     &lt;xs:enumeration value="FileTypeSpdx"/>
 *     &lt;xs:enumeration value="FileTypeText"/>
 *     &lt;xs:enumeration value="FileTypeVideo"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum FileTypeCodeSimpleType {
    /** 
     * The file is associated with a specific application type (MIME type of application/* )
     */
    FILE_TYPE_APPLICATION("FileTypeApplication"), /** 
                                                   * Indicates the file is an archive file.
                                                   */
    FILE_TYPE_ARCHIVE("FileTypeArchive"), /** 
                                           * The file is associated with an audio file (MIME type of audio/* , ie. .mp3 ); IMAGE if the file is assoicated with an picture image file (MIME type of image/*, ie.
                                          .jpg, .gif )
                                           */
    FILE_TYPE_AUDIO("FileTypeAudio"), /** 
                                       * Indicates the file is not a text file. spdx:filetype_archive is preferred for archive files even though they are binary.
                                       */
    FILE_TYPE_BINARY("FileTypeBinary"), /** 
                                         * The file serves as documentation.
                                         */
    FILE_TYPE_DOCUMENTATION("FileTypeDocumentation"), /** 
                                                       * The file is assoicated with an picture image file (MIME type of image/*, ie. .jpg, .gif ).
                                                       */
    FILE_TYPE_IMAGE("FileTypeImage"), /** 
                                       * Indicates the file is not a source, archive or binary file.
                                       */
    FILE_TYPE_OTHER("FileTypeOther"), /** 
                                       * Indicates the file is a source code file.
                                       */
    FILE_TYPE_SOURCE("FileTypeSource"), /** 
                                         * The file is an SPDX document.
                                         */
    FILE_TYPE_SPDX("FileTypeSpdx"), /** 
                                     * The file is human readable text file (MIME type of text/*).
                                     */
    FILE_TYPE_TEXT("FileTypeText"), /** 
                                     * The file is associated with a video file type (MIME type of video/*).
                                     */
    FILE_TYPE_VIDEO("FileTypeVideo");
    private final String value;

    private FileTypeCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static FileTypeCodeSimpleType convert(String value) {
        for (FileTypeCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

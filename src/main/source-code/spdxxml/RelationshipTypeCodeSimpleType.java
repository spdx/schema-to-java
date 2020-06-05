
package spdxxml;

/** 
 * A data type for RelationshipType properties
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="urn:spdx-xml:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelationshipTypeCodeSimpleType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="RelationshipTypeAmendment"/>
 *     &lt;xs:enumeration value="RelationshipTypeAncestorOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeBuildToolOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeContainedBy"/>
 *     &lt;xs:enumeration value="RelationshipTypeContains"/>
 *     &lt;xs:enumeration value="RelationshipTypeCopyOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeDataFileOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeDescendantOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeDescribedBy"/>
 *     &lt;xs:enumeration value="RelationshipTypeDescribes"/>
 *     &lt;xs:enumeration value="RelationshipTypeDistributionArtifact"/>
 *     &lt;xs:enumeration value="RelationshipTypeDocumentation"/>
 *     &lt;xs:enumeration value="RelationshipTypeDynamicLink"/>
 *     &lt;xs:enumeration value="RelationshipTypeExpandedFromArchive"/>
 *     &lt;xs:enumeration value="RelationshipTypeFileAdded"/>
 *     &lt;xs:enumeration value="RelationshipTypeFileDeleted"/>
 *     &lt;xs:enumeration value="RelationshipTypeFileModified"/>
 *     &lt;xs:enumeration value="RelationshipTypeGeneratedFrom"/>
 *     &lt;xs:enumeration value="RelationshipTypeGenerates"/>
 *     &lt;xs:enumeration value="RelationshipTypeHasPrerequisite"/>
 *     &lt;xs:enumeration value="RelationshipTypeMetafileOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeOptionalComponentOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeOther"/>
 *     &lt;xs:enumeration value="RelationshipTypePackageOf"/>
 *     &lt;xs:enumeration value="RelationshipTypePatchApplied"/>
 *     &lt;xs:enumeration value="RelationshipTypePatchFor"/>
 *     &lt;xs:enumeration value="RelationshipTypePrerequisiteFor"/>
 *     &lt;xs:enumeration value="RelationshipTypeStaticLink"/>
 *     &lt;xs:enumeration value="RelationshipTypeTestcaseOf"/>
 *     &lt;xs:enumeration value="RelationshipTypeVariantOf"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum RelationshipTypeCodeSimpleType {
    /** 
     * To be used when SPDXRef-A amends the SPDX information in SPDXRef-B.
     */
    RELATIONSHIP_TYPE_AMENDMENT("RelationshipTypeAmendment"), /** 
                                                               * A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement. For example, an
                                                              upstream File is an ancestor of a modified downstream File
                                                               */
    RELATIONSHIP_TYPE_ANCESTOR_OF("RelationshipTypeAncestorOf"), /** 
                                                                  * To be used when SPDXRef-A is used to to build SPDXRef-B.
                                                                  */
    RELATIONSHIP_TYPE_BUILD_TOOL_OF("RelationshipTypeBuildToolOf"), /** 
                                                                     * A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement. For example, a File contained by a
                                                                    Package.
                                                                     */
    RELATIONSHIP_TYPE_CONTAINED_BY("RelationshipTypeContainedBy"), /** 
                                                                    * A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement. For example, a Package contains a File.
                                                                   (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)
                                                                    */
    RELATIONSHIP_TYPE_CONTAINS("RelationshipTypeContains"), /** 
                                                             * A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement. For example, a downstream distribution of a binary
                                                            library which was copied from the upstream package.
                                                             */
    RELATIONSHIP_TYPE_COPY_OF("RelationshipTypeCopyOf"), /** 
                                                          * Is to be used when SPDXRef-A is a data file used in SPDXRef-B.
                                                          */
    RELATIONSHIP_TYPE_DATA_FILE_OF("RelationshipTypeDataFileOf"), /** 
                                                                   * A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement. For example, an
                                                                  downstream File that was modified is a descendant of an upstream File
                                                                   */
    RELATIONSHIP_TYPE_DESCENDANT_OF("RelationshipTypeDescendantOf"), /** 
                                                                      * Is to be used an SPDXRef-A is described by SPDXRef-Document.
                                                                      */
    RELATIONSHIP_TYPE_DESCRIBED_BY("RelationshipTypeDescribedBy"), /** 
                                                                    * Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A.
                                                                    */
    RELATIONSHIP_TYPE_DESCRIBES("RelationshipTypeDescribes"), /** 
                                                               * A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed. For
                                                              example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton.
                                                               */
    RELATIONSHIP_TYPE_DISTRIBUTION_ARTIFACT(
            "RelationshipTypeDistributionArtifact"), /** 
                                                      * To be used when SPDXRef-A provides documentation of SPDXRef-B.
                                                      */
    RELATIONSHIP_TYPE_DOCUMENTATION("RelationshipTypeDocumentation"), /** 
                                                                       * Is to be used when SPDXRef-A dynamically links to SPDXRef-B.
                                                                       */
    RELATIONSHIP_TYPE_DYNAMIC_LINK("RelationshipTypeDynamicLink"), /** 
                                                                    * A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file. For example, if there
                                                                   is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive
                                                                   with the file xyz.tar.gz.
                                                                    */
    RELATIONSHIP_TYPE_EXPANDED_FROM_ARCHIVE(
            "RelationshipTypeExpandedFromArchive"), /** 
                                                     * A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package. For example, a package
                                                    (the relatedSPDXElement) has been patched to remove a file (the SPDXElement). This relationship is typically used to express the result of a patched package when the actual patchfile
                                                    is not present.
                                                     */
    RELATIONSHIP_TYPE_FILE_ADDED("RelationshipTypeFileAdded"), /** 
                                                                * A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed. For example, a package
                                                               has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement). This relationship is typically used to express the result of a
                                                               patched package when the actual patchfile is not present.
                                                                */
    RELATIONSHIP_TYPE_FILE_DELETED("RelationshipTypeFileDeleted"), /** 
                                                                    * A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file. For example, a
                                                                   file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement). This relationship is typically used to express the result of a patched package
                                                                   when the actual patchfile is not present.
                                                                    */
    RELATIONSHIP_TYPE_FILE_MODIFIED("RelationshipTypeFileModified"), /** 
                                                                      * A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement. For example, a binary File might have been
                                                                     generated from a source File.
                                                                      */
    RELATIONSHIP_TYPE_GENERATED_FROM("RelationshipTypeGeneratedFrom"), /** 
                                                                        * A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement. For example, a source File generates a binary
                                                                       File.
                                                                        */
    RELATIONSHIP_TYPE_GENERATES("RelationshipTypeGenerates"), /** 
                                                               * Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B.
                                                               */
    RELATIONSHIP_TYPE_HAS_PREREQUISITE("RelationshipTypeHasPrerequisite"), /** 
                                                                            * To be used when SPDXRef-A is a metafile of SPDXRef-B.
                                                                            */
    RELATIONSHIP_TYPE_METAFILE_OF("RelationshipTypeMetafileOf"), /** 
                                                                  * To be used when SPDXRef-A is an optional component of SPDXRef-B.
                                                                  */
    RELATIONSHIP_TYPE_OPTIONAL_COMPONENT_OF(
            "RelationshipTypeOptionalComponentOf"), /** 
                                                     * to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship
                                                    comments field.
                                                     */
    RELATIONSHIP_TYPE_OTHER("RelationshipTypeOther"), /** 
                                                       * To be used when SPDXRef-A is used as a package as part of SPDXRef-B.
                                                       */
    RELATIONSHIP_TYPE_PACKAGE_OF("RelationshipTypePackageOf"), /** 
                                                                * A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a
                                                               .diff File relates to a specific file where the diff was applied.
                                                                */
    RELATIONSHIP_TYPE_PATCH_APPLIED("RelationshipTypePatchApplied"), /** 
                                                                      * A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement.
                                                                     For example, relationship from a .diff File to a Package it is designed to patch.
                                                                      */
    RELATIONSHIP_TYPE_PATCH_FOR("RelationshipTypePatchFor"), /** 
                                                              * Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B
                                                              */
    RELATIONSHIP_TYPE_PREREQUISITE_FOR("RelationshipTypePrerequisiteFor"), /** 
                                                                            * Is to be used when SPDXRef-A statically links to SPDXRef-B.
                                                                            */
    RELATIONSHIP_TYPE_STATIC_LINK("RelationshipTypeStaticLink"), /** 
                                                                  * Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B.
                                                                  */
    RELATIONSHIP_TYPE_TESTCASE_OF("RelationshipTypeTestcaseOf"), /** 
                                                                  * A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first. For example,
                                                                 if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other
                                                                 File.
                                                                  */
    RELATIONSHIP_TYPE_VARIANT_OF("RelationshipTypeVariantOf");
    private final String value;

    private RelationshipTypeCodeSimpleType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static RelationshipTypeCodeSimpleType convert(String value) {
        for (RelationshipTypeCodeSimpleType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

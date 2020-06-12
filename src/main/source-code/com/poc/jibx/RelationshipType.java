
package com.poc.jibx;

/** 
 * Type of relationship.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:simpleType xmlns:ns="http://spdx.org/rdf/terms" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RelationshipType">
 *   &lt;xs:restriction base="xs:string">
 *     &lt;xs:enumeration value="relationshipType_optionalComponentOf"/>
 *     &lt;xs:enumeration value="relationshipType_providedDependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_dependencyManifestOf"/>
 *     &lt;xs:enumeration value="relationshipType_testcaseOf"/>
 *     &lt;xs:enumeration value="relationshipType_dependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_prerequisiteFor"/>
 *     &lt;xs:enumeration value="relationshipType_testOf"/>
 *     &lt;xs:enumeration value="relationshipType_exampleOf"/>
 *     &lt;xs:enumeration value="relationshipType_variantOf"/>
 *     &lt;xs:enumeration value="relationshipType_ancestorOf"/>
 *     &lt;xs:enumeration value="relationshipType_distributionArtifact"/>
 *     &lt;xs:enumeration value="relationshipType_patchApplied"/>
 *     &lt;xs:enumeration value="relationshipType_documentation"/>
 *     &lt;xs:enumeration value="relationshipType_buildDependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_optionalDependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_devToolOf"/>
 *     &lt;xs:enumeration value="relationshipType_packageOf"/>
 *     &lt;xs:enumeration value="relationshipType_runtimeDependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_buildToolOf"/>
 *     &lt;xs:enumeration value="relationshipType_dataFile"/>
 *     &lt;xs:enumeration value="relationshipType_generates"/>
 *     &lt;xs:enumeration value="relationshipType_hasPrerequisite"/>
 *     &lt;xs:enumeration value="relationshipType_descendantOf"/>
 *     &lt;xs:enumeration value="relationshipType_testDependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_copyOf"/>
 *     &lt;xs:enumeration value="relationshipType_staticLink"/>
 *     &lt;xs:enumeration value="relationshipType_fileModified"/>
 *     &lt;xs:enumeration value="relationshipType_other"/>
 *     &lt;xs:enumeration value="relationshipType_devDependencyOf"/>
 *     &lt;xs:enumeration value="relationshipType_testToolOf"/>
 *     &lt;xs:enumeration value="relationshipType_patchFor"/>
 *     &lt;xs:enumeration value="relationshipType_fileAdded"/>
 *     &lt;xs:enumeration value="relationshipType_generatedFrom"/>
 *     &lt;xs:enumeration value="relationshipType_dynamicLink"/>
 *     &lt;xs:enumeration value="relationshipType_metafileOf"/>
 *     &lt;xs:enumeration value="relationshipType_describedBy"/>
 *     &lt;xs:enumeration value="relationshipType_amendment"/>
 *     &lt;xs:enumeration value="relationshipType_contains"/>
 *     &lt;xs:enumeration value="relationshipType_fileDeleted"/>
 *     &lt;xs:enumeration value="relationshipType_expandedFromArchive"/>
 *     &lt;xs:enumeration value="relationshipType_describes"/>
 *     &lt;xs:enumeration value="relationshipType_containedBy"/>
 *     &lt;xs:enumeration value="relationshipType_dataFileOf"/>
 *     &lt;xs:enumeration value="relationshipType_dependsOn"/>
 *   &lt;/xs:restriction>
 * &lt;/xs:simpleType>
 * </pre>
 */
public enum RelationshipType {
    /** 
     * To be used when SPDXRef-A is an optional component of SPDXRef-B.
     */
    RELATIONSHIP_TYPE_OPTIONAL_COMPONENT_OF(
            "relationshipType_optionalComponentOf"), /** 
                                                      * Is to be used when SPDXRef-A is a to be provided dependency of SPDXRef-B.
                                                      */
    RELATIONSHIP_TYPE_PROVIDED_DEPENDENCY_OF(
            "relationshipType_providedDependencyOf"), /** 
                                                       * Is to be used when SPDXRef-A is a manifest file that lists a set of dependencies for SPDXRef-B.
                                                       */
    RELATIONSHIP_TYPE_DEPENDENCY_MANIFEST_OF(
            "relationshipType_dependencyManifestOf"), /** 
                                                       * Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B.
                                                       */
    RELATIONSHIP_TYPE_TESTCASE_OF("relationshipType_testcaseOf"), /** 
                                                                   * Is to be used when SPDXRef-A is dependency of SPDXRef-B.
                                                                   */
    RELATIONSHIP_TYPE_DEPENDENCY_OF("relationshipType_dependencyOf"), /** 
                                                                       * Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B
                                                                       */
    RELATIONSHIP_TYPE_PREREQUISITE_FOR("relationshipType_prerequisiteFor"), /** 
                                                                             * Is to be used when SPDXRef-A is used for testing SPDXRef-B.
                                                                             */
    RELATIONSHIP_TYPE_TEST_OF("relationshipType_testOf"), /** 
                                                           * Is to be used when SPDXRef-A is an example of SPDXRef-B.
                                                           */
    RELATIONSHIP_TYPE_EXAMPLE_OF("relationshipType_exampleOf"), /** 
                                                                 * A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first.  For example, if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other File.
                                                                 */
    RELATIONSHIP_TYPE_VARIANT_OF("relationshipType_variantOf"), /** 
                                                                 * A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement.  For example, an upstream File is an ancestor of a modified downstream File
                                                                 */
    RELATIONSHIP_TYPE_ANCESTOR_OF("relationshipType_ancestorOf"), /** 
                                                                   * A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed.  For example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton. 
                                                                   */
    RELATIONSHIP_TYPE_DISTRIBUTION_ARTIFACT(
            "relationshipType_distributionArtifact"), /** 
                                                       * A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a .diff File relates to a specific file where the diff was applied.
                                                       */
    RELATIONSHIP_TYPE_PATCH_APPLIED("relationshipType_patchApplied"), /** 
                                                                       * To be used when SPDXRef-A provides documentation of SPDXRef-B.
                                                                       */
    RELATIONSHIP_TYPE_DOCUMENTATION("relationshipType_documentation"), /** 
                                                                        * Is to be used when SPDXRef-A is a build dependency of SPDXRef-B.
                                                                        */
    RELATIONSHIP_TYPE_BUILD_DEPENDENCY_OF("relationshipType_buildDependencyOf"), /** 
                                                                                  * Is to be used when SPDXRef-A is an optional dependency of SPDXRef-B.
                                                                                  */
    RELATIONSHIP_TYPE_OPTIONAL_DEPENDENCY_OF(
            "relationshipType_optionalDependencyOf"), /** 
                                                       * Is to be used when SPDXRef-A is a development dependency of SPDXRef-B.
                                                       */
    RELATIONSHIP_TYPE_DEV_TOOL_OF("relationshipType_devToolOf"), /** 
                                                                  * To be used when SPDXRef-A is used as a package as part of SPDXRef-B.
                                                                  */
    RELATIONSHIP_TYPE_PACKAGE_OF("relationshipType_packageOf"), /** 
                                                                 * Is to be used when SPDXRef-A is a dependency required for the execution of SPDXRef-B.
                                                                 */
    RELATIONSHIP_TYPE_RUNTIME_DEPENDENCY_OF(
            "relationshipType_runtimeDependencyOf"), /** 
                                                      * To be used when SPDXRef-A is used to to build SPDXRef-B.
                                                      */
    RELATIONSHIP_TYPE_BUILD_TOOL_OF("relationshipType_buildToolOf"), /** 
                                                                      * Is to be used when SPDXRef-A is a data file used in SPDXRef-B.  Replaced by relationshipType_dataFileOf
                                                                      */
    RELATIONSHIP_TYPE_DATA_FILE("relationshipType_dataFile"), /** 
                                                               * A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement.  For example, a source File generates a binary File.
                                                               */
    RELATIONSHIP_TYPE_GENERATES("relationshipType_generates"), /** 
                                                                * Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B.
                                                                */
    RELATIONSHIP_TYPE_HAS_PREREQUISITE("relationshipType_hasPrerequisite"), /** 
                                                                             * A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement.  For example, an downstream File that was modified is a descendant of an upstream File
                                                                             */
    RELATIONSHIP_TYPE_DESCENDANT_OF("relationshipType_descendantOf"), /** 
                                                                       * Is to be used when SPDXRef-A is a test dependency of SPDXRef-B.
                                                                       */
    RELATIONSHIP_TYPE_TEST_DEPENDENCY_OF("relationshipType_testDependencyOf"), /** 
                                                                                * A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement.  For example, a downstream distribution of a binary library which was copied from the upstream package.
                                                                                */
    RELATIONSHIP_TYPE_COPY_OF("relationshipType_copyOf"), /** 
                                                           * Is to be used when SPDXRef-A statically links to SPDXRef-B.
                                                           */
    RELATIONSHIP_TYPE_STATIC_LINK("relationshipType_staticLink"), /** 
                                                                   * A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file.  For example, a file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.
                                                                   */
    RELATIONSHIP_TYPE_FILE_MODIFIED("relationshipType_fileModified"), /** 
                                                                       * to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship comments field.
                                                                       */
    RELATIONSHIP_TYPE_OTHER("relationshipType_other"), /** 
                                                        * Is to be used when SPDXRef-A is a development dependency of SPDXRef-B.
                                                        */
    RELATIONSHIP_TYPE_DEV_DEPENDENCY_OF("relationshipType_devDependencyOf"), /** 
                                                                              * Is to be used when SPDXRef-A is used as a test tool for SPDXRef-B.
                                                                              */
    RELATIONSHIP_TYPE_TEST_TOOL_OF("relationshipType_testToolOf"), /** 
                                                                    * A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement.  For example, relationship from a .diff File to a Package it is designed to patch. 
                                                                    */
    RELATIONSHIP_TYPE_PATCH_FOR("relationshipType_patchFor"), /** 
                                                               * A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package.  For example, a package (the relatedSPDXElement) has been patched to remove a file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.
                                                               */
    RELATIONSHIP_TYPE_FILE_ADDED("relationshipType_fileAdded"), /** 
                                                                 * A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement.  For example, a binary File might have been generated from a source File.
                                                                 */
    RELATIONSHIP_TYPE_GENERATED_FROM("relationshipType_generatedFrom"), /** 
                                                                         * Is to be used when SPDXRef-A dynamically links to SPDXRef-B.
                                                                         */
    RELATIONSHIP_TYPE_DYNAMIC_LINK("relationshipType_dynamicLink"), /** 
                                                                     * To be used when SPDXRef-A is a metafile of SPDXRef-B.
                                                                     */
    RELATIONSHIP_TYPE_METAFILE_OF("relationshipType_metafileOf"), /** 
                                                                   * Is to be used an SPDXRef-A is described by SPDXRef-Document.
                                                                   */
    RELATIONSHIP_TYPE_DESCRIBED_BY("relationshipType_describedBy"), /** 
                                                                     * To be used when SPDXRef-A amends the SPDX information in SPDXRef-B.
                                                                     */
    RELATIONSHIP_TYPE_AMENDMENT("relationshipType_amendment"), /** 
                                                                * A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement.  For example, a Package contains a File. (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)
                                                                */
    RELATIONSHIP_TYPE_CONTAINS("relationshipType_contains"), /** 
                                                              * A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed.  For example, a package has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.
                                                              */
    RELATIONSHIP_TYPE_FILE_DELETED("relationshipType_fileDeleted"), /** 
                                                                     * A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file.  For example, if there is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive with the file xyz.tar.gz.
                                                                     */
    RELATIONSHIP_TYPE_EXPANDED_FROM_ARCHIVE(
            "relationshipType_expandedFromArchive"), /** 
                                                      * Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A.
                                                      */
    RELATIONSHIP_TYPE_DESCRIBES("relationshipType_describes"), /** 
                                                                * A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement.  For example, a File contained by a Package. 
                                                                */
    RELATIONSHIP_TYPE_CONTAINED_BY("relationshipType_containedBy"), /** 
                                                                     * Is to be used when SPDXRef-A is a data file used in SPDXRef-B.
                                                                     */
    RELATIONSHIP_TYPE_DATA_FILE_OF("relationshipType_dataFileOf"), /** 
                                                                    * Is to be used when SPDXRef-A depends on SPDXRef-B.
                                                                    */
    RELATIONSHIP_TYPE_DEPENDS_ON("relationshipType_dependsOn");
    private final String value;

    private RelationshipType(String value) {
        this.value = value;
    }

    public String xmlValue() {
        return value;
    }

    public static RelationshipType convert(String value) {
        for (RelationshipType inst : values()) {
            if (inst.xmlValue().equals(value)) {
                return inst;
            }
        }
        return null;
    }
}

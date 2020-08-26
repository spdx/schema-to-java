
package org.spdx.library.model;

/** 
 * Type of relationship.
 */
public enum RelationshipType implements IndividualUriValue {
    /** 
     * To be used when SPDXRef-A is an optional component of SPDXRef-B.
     */
    relationshipType_optionalComponentOf, /** 
                                           * Is to be used when SPDXRef-A is a to be provided dependency of SPDXRef-B.
                                           */
    relationshipType_providedDependencyOf, /** 
                                            * Is to be used when SPDXRef-A is a manifest file that lists a set of dependencies for SPDXRef-B.
                                            */
    relationshipType_dependencyManifestOf, /** 
                                            * Is to be used when SPDXRef-A is a test case used in testing SPDXRef-B.
                                            */
    relationshipType_testcaseOf, /** 
                                  * Is to be used when SPDXRef-A is dependency of SPDXRef-B.
                                  */
    relationshipType_dependencyOf, /** 
                                    * Is to be used when SPDXRef-A is a prerequisite for SPDXRef-B
                                    */
    relationshipType_prerequisiteFor, /** 
                                       * Is to be used when SPDXRef-A is used for testing SPDXRef-B.
                                       */
    relationshipType_testOf, /** 
                              * Is to be used when SPDXRef-A is an example of SPDXRef-B.
                              */
    relationshipType_exampleOf, /** 
                                 * A Relationship of relationshipType_variantOf expresses that an SPDXElement is a variant of the relatedSPDXElement, but it is not clear which came first.  For example, if the content of two Files differs by some edit, but there is no way to tell which came first (no reliable date information), then one File is a variant of the other File.
                                 */
    relationshipType_variantOf, /** 
                                 * A Relationship of relationshipType_ancestorOf expresses that an SPDXElement is an ancestor of (same lineage but pre-dates) the relatedSPDXElement.  For example, an upstream File is an ancestor of a modified downstream File
                                 */
    relationshipType_ancestorOf, /** 
                                  * A Relationship of relationshipType_distributionArtifact expresses that distributing the SPDXElement requires that the relatedSPDXElement also be distributed.  For example, distributing a binary File may require that a source tarball (another File) be made available with the distribuiton. 
                                  */
    relationshipType_distributionArtifact, /** 
                                            * A Relationship of relationshipType_patchApplied expresses that the SPDXElement is a 'patchfile' that was applied and produced the relatedSPDXElement. For example, a .diff File relates to a specific file where the diff was applied.
                                            */
    relationshipType_patchApplied, /** 
                                    * To be used when SPDXRef-A provides documentation of SPDXRef-B.
                                    */
    relationshipType_documentation, /** 
                                     * Is to be used when SPDXRef-A is a build dependency of SPDXRef-B.
                                     */
    relationshipType_buildDependencyOf, /** 
                                         * Is to be used when SPDXRef-A is an optional dependency of SPDXRef-B.
                                         */
    relationshipType_optionalDependencyOf, /** 
                                            * Is to be used when SPDXRef-A is a development dependency of SPDXRef-B.
                                            */
    relationshipType_devToolOf, /** 
                                 * To be used when SPDXRef-A is used as a package as part of SPDXRef-B.
                                 */
    relationshipType_packageOf, /** 
                                 * Is to be used when SPDXRef-A is a dependency required for the execution of SPDXRef-B.
                                 */
    relationshipType_runtimeDependencyOf, /** 
                                           * To be used when SPDXRef-A is used to to build SPDXRef-B.
                                           */
    relationshipType_buildToolOf, /** 
                                   * Is to be used when SPDXRef-A is a data file used in SPDXRef-B.  Replaced by relationshipType_dataFileOf
                                   */
    relationshipType_dataFile, /** 
                                * A Relationship of relationshipType_generates expresses that an SPDXElement generates the relatedSPDXElement.  For example, a source File generates a binary File.
                                */
    relationshipType_generates, /** 
                                 * Is to be used when SPDXRef-A has as a prerequisite SPDXRef-B.
                                 */
    relationshipType_hasPrerequisite, /** 
                                       * A Relationship of relationshipType_descendantOf expresses that an SPDXElement is a descendant of (same lineage but post-dates) the relatedSPDXElement.  For example, an downstream File that was modified is a descendant of an upstream File
                                       */
    relationshipType_descendantOf, /** 
                                    * Is to be used when SPDXRef-A is a test dependency of SPDXRef-B.
                                    */
    relationshipType_testDependencyOf, /** 
                                        * A Relationship of relationshipType_copyOf expresses that the SPDXElement is an exact copy of the relatedSDPXElement.  For example, a downstream distribution of a binary library which was copied from the upstream package.
                                        */
    relationshipType_copyOf, /** 
                              * Is to be used when SPDXRef-A statically links to SPDXRef-B.
                              */
    relationshipType_staticLink, /** 
                                  * A Relationship of relationshipType_fileModified expresses that the SPDXElement is a file which is a modified version of the relatedSPDXElement file.  For example, a file (the SPDXElement) has been patched to modify the contents of the original file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.
                                  */
    relationshipType_fileModified, /** 
                                    * to be used for a relationship which has not been defined in the formal SPDX specification. A description of the relationship should be included in the Relationship comments field.
                                    */
    relationshipType_other, /** 
                             * Is to be used when SPDXRef-A is a development dependency of SPDXRef-B.
                             */
    relationshipType_devDependencyOf, /** 
                                       * Is to be used when SPDXRef-A is used as a test tool for SPDXRef-B.
                                       */
    relationshipType_testToolOf, /** 
                                  * A Relationship of relationshipType_patchFor expresses that the SPDXElement is a 'patchfile' that is designed to patch (apply modifications to) the relatedSPDXElement.  For example, relationship from a .diff File to a Package it is designed to patch. 
                                  */
    relationshipType_patchFor, /** 
                                * A Relationship of relationshipType_fileAdded expresses that the SPDXElement is a file which has been added to the relatedSPDXElement package.  For example, a package (the relatedSPDXElement) has been patched to remove a file (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.
                                */
    relationshipType_fileAdded, /** 
                                 * A Relationship of relationshipType_generatedFrom expresses that an SPDXElement was generated from the relatedSPDXElement.  For example, a binary File might have been generated from a source File.
                                 */
    relationshipType_generatedFrom, /** 
                                     * Is to be used when SPDXRef-A dynamically links to SPDXRef-B.
                                     */
    relationshipType_dynamicLink, /** 
                                   * To be used when SPDXRef-A is a metafile of SPDXRef-B.
                                   */
    relationshipType_metafileOf, /** 
                                  * Is to be used an SPDXRef-A is described by SPDXRef-Document.
                                  */
    relationshipType_describedBy, /** 
                                   * To be used when SPDXRef-A amends the SPDX information in SPDXRef-B.
                                   */
    relationshipType_amendment, /** 
                                 * A Relationship of relationshipType_contains expresses that an SPDXElement contains the relatedSPDXElement.  For example, a Package contains a File. (relationshipType_contains introduced in SPDX 2.0 deprecates property 'hasFile' from SPDX 1.2)
                                 */
    relationshipType_contains, /** 
                                * A Relationship of relationshipType_fileDeleted expresses that the SPDXElement is a package where the relatedSPDXElement file has been removed.  For example, a package has been patched to remove a file a file (the relatedSPDXElement resulting in the patched package (the SPDXElement).  This relationship is typically used to express the result of a patched package when the actual patchfile is not present.
                                */
    relationshipType_fileDeleted, /** 
                                   * A Relationship of relationshipType_expandedFromArchive expresses that the SPDXElement is a file which was epanded from a relatedSPDXElement file.  For example, if there is an archive file xyz.tar.gz containing a file foo.c the archive file was expanded in a directory arch/xyz, the file arch/xyz/foo.c would have a relationshipType_expandedFromArchive with the file xyz.tar.gz.
                                   */
    relationshipType_expandedFromArchive, /** 
                                           * Is to be used when SPDXRef-DOCUMENT describes SPDXRef-A.
                                           */
    relationshipType_describes, /** 
                                 * A Relationship of relationshipType_containedBy expresses that an SPDXElement is contained by the relatedSPDXElement.  For example, a File contained by a Package. 
                                 */
    relationshipType_containedBy, /** 
                                   * Is to be used when SPDXRef-A is a data file used in SPDXRef-B.
                                   */
    relationshipType_dataFileOf, /** 
                                  * Is to be used when SPDXRef-A depends on SPDXRef-B.
                                  */
    relationshipType_dependsOn;
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

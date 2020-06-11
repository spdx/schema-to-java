
package spdxxml;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;

/** 
 * A data type for a list of dependencies for a given software project derived directly from the artifact or source dependency definition file. Entries include names, versions,
 and vulnerabilities
 */
public class DependencyInformationType extends ObjectType
{
    private DependenciesType dependencies;
    private CompilerType compiler;
    private List<DependencyInformationAugmentationPoint> dependencyInformationAugmentationPointList = new ArrayList<DependencyInformationAugmentationPoint>();

    /** 
     * Get the 'Dependencies' element value. A data item for software dependencies
     * 
     * @return value
     */
    public DependenciesType getDependencies() {
        return dependencies;
    }

    /** 
     * Set the 'Dependencies' element value. A data item for software dependencies
     * 
     * @param dependencies
     */
    public void setDependencies(DependenciesType dependencies) {
        this.dependencies = dependencies;
    }

    /** 
     * Get the 'Compiler' element value. A data item for languages used in a software repository
     * 
     * @return value
     */
    public CompilerType getCompiler() {
        return compiler;
    }

    /** 
     * Set the 'Compiler' element value. A data item for languages used in a software repository
     * 
     * @param compiler
     */
    public void setCompiler(CompilerType compiler) {
        this.compiler = compiler;
    }

    /** 
     * Get the list of 'DependencyInformationAugmentationPoint' element items. An augmentation point for DependencyInformationType
     * 
     * @return list
     */
    public List<DependencyInformationAugmentationPoint> getDependencyInformationAugmentationPointList() {
        return dependencyInformationAugmentationPointList;
    }

    /** 
     * Set the list of 'DependencyInformationAugmentationPoint' element items. An augmentation point for DependencyInformationType
     * 
     * @param list
     */
    public void setDependencyInformationAugmentationPointList(
            List<DependencyInformationAugmentationPoint> list) {
        dependencyInformationAugmentationPointList = list;
    }
}


package org.spdx.rdf.terms;

import java.util.ArrayList;
import java.util.List;

/** 
 * An SpdxElement is any thing described in SPDX, either a document or an SpdxItem. SpdxElements can be related to other SpdxElements.
 */
public class SpdxElement
{
    private String name;
    private String comment;
    private List<Relationship> relationshipList = new ArrayList<Relationship>();
    private List<Annotation> annotationList = new ArrayList<Annotation>();
    private String SPDXID;

    /** 
     * Get the 'name' element value. Identify name of this SpdxElement.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Identify name of this SpdxElement.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'comment' element value.
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'comment' element value.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
     * Get the list of 'relationship' element items. Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument.
     * 
     * @return list
     */
    public List<Relationship> getRelationshipList() {
        return relationshipList;
    }

    /** 
     * Set the list of 'relationship' element items. Defines a relationship between two SPDX elements. The SPDX element may be a Package, File, or SpdxDocument.
     * 
     * @param list
     */
    public void setRelationshipList(List<Relationship> list) {
        relationshipList = list;
    }

    /** 
     * Get the list of 'annotation' element items. Provide additional information about an SpdxElement.
     * 
     * @return list
     */
    public List<Annotation> getAnnotationList() {
        return annotationList;
    }

    /** 
     * Set the list of 'annotation' element items. Provide additional information about an SpdxElement.
     * 
     * @param list
     */
    public void setAnnotationList(List<Annotation> list) {
        annotationList = list;
    }

    /** 
     * Get the 'SPDXID' element value.
     * 
     * @return value
     */
    public String getSPDXID() {
        return SPDXID;
    }

    /** 
     * Set the 'SPDXID' element value.
     * 
     * @param SPDXID
     */
    public void setSPDXID(String SPDXID) {
        this.SPDXID = SPDXID;
    }
}

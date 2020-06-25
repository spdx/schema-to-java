
package org.spdx.library.model;

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
     * Get the number of 'relationship' element items.
     * @return count
     */
    public int sizeRelationshipList() {
        return relationshipList.size();
    }

    /** 
     * Add a 'relationship' element item.
     * @param item
     */
    public void addRelationship(Relationship item) {
        relationshipList.add(item);
    }

    /** 
     * Get 'relationship' element item by position.
     * @return item
     * @param index
     */
    public Relationship getRelationship(int index) {
        return relationshipList.get(index);
    }

    /** 
     * Remove all 'relationship' element items.
     */
    public void clearRelationshipList() {
        relationshipList.clear();
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
     * Get the number of 'annotation' element items.
     * @return count
     */
    public int sizeAnnotationList() {
        return annotationList.size();
    }

    /** 
     * Add a 'annotation' element item.
     * @param item
     */
    public void addAnnotation(Annotation item) {
        annotationList.add(item);
    }

    /** 
     * Get 'annotation' element item by position.
     * @return item
     * @param index
     */
    public Annotation getAnnotation(int index) {
        return annotationList.get(index);
    }

    /** 
     * Remove all 'annotation' element items.
     */
    public void clearAnnotationList() {
        annotationList.clear();
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

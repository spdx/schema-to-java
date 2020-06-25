
package org.spdx.library.model;

import java.util.ArrayList;
import java.util.List;

/** 
 * The SimpleLicenseInfo class includes all resources that represent simple, atomic, licensing information.
 */
public class SimpleLicensingInfo extends AnyLicenseInfo
{
    private List<String> seeAlsoList = new ArrayList<String>();
    private String name;
    private String comment;
    private String licenseId;

    /** 
     * Get the list of 'seeAlso' element items.
     * 
     * @return list
     */
    public List<String> getSeeAlsoList() {
        return seeAlsoList;
    }

    /** 
     * Set the list of 'seeAlso' element items.
     * 
     * @param list
     */
    public void setSeeAlsoList(List<String> list) {
        seeAlsoList = list;
    }

    /** 
     * Get the number of 'seeAlso' element items.
     * @return count
     */
    public int sizeSeeAlsoList() {
        return seeAlsoList.size();
    }

    /** 
     * Add a 'seeAlso' element item.
     * @param item
     */
    public void addSeeAlso(String item) {
        seeAlsoList.add(item);
    }

    /** 
     * Get 'seeAlso' element item by position.
     * @return item
     * @param index
     */
    public String getSeeAlso(int index) {
        return seeAlsoList.get(index);
    }

    /** 
     * Remove all 'seeAlso' element items.
     */
    public void clearSeeAlsoList() {
        seeAlsoList.clear();
    }

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
     * Get the 'licenseId' element value. A human readable short form license identifier for a license. The license ID is iether on the standard license oist or the form "LicenseRef-"[idString] where [idString] is a unique string containing letters, numbers, ".", "-" or "+".
     * 
     * @return value
     */
    public String getLicenseId() {
        return licenseId;
    }

    /** 
     * Set the 'licenseId' element value. A human readable short form license identifier for a license. The license ID is iether on the standard license oist or the form "LicenseRef-"[idString] where [idString] is a unique string containing letters, numbers, ".", "-" or "+".
     * 
     * @param licenseId
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}

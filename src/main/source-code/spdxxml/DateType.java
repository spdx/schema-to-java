
package spdxxml;

import gov.niem.release.niem.structures.SimpleObjectAttributeGroup;
import java.util.Date;

/** 
 * A data type for A date-time stamp.
 */
public class DateType
{
    private Date dateTime;
    private SimpleObjectAttributeGroup simpleObjectAttributeGroup;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public Date getDateTime() {
        return dateTime;
    }

    /** 
     * Set the extension value.
     * 
     * @param dateTime
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @return value
     */
    public SimpleObjectAttributeGroup getSimpleObjectAttributeGroup() {
        return simpleObjectAttributeGroup;
    }

    /** 
     * Set the 'SimpleObjectAttributeGroup' attributeGroup value.
     * 
     * @param simpleObjectAttributeGroup
     */
    public void setSimpleObjectAttributeGroup(
            SimpleObjectAttributeGroup simpleObjectAttributeGroup) {
        this.simpleObjectAttributeGroup = simpleObjectAttributeGroup;
    }
}

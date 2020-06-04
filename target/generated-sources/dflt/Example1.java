
package dflt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:xs="http://www.w3.org/2001/XMLSchema" name="example1">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:string" name="orderperson"/>
 *       &lt;xs:element name="shipto">
 *         &lt;xs:complexType>
 *           &lt;xs:sequence>
 *             &lt;xs:element type="xs:string" name="name"/>
 *             &lt;xs:element type="xs:string" name="address"/>
 *             &lt;xs:element type="xs:string" name="city"/>
 *             &lt;xs:element type="xs:string" name="country"/>
 *           &lt;/xs:sequence>
 *         &lt;/xs:complexType>
 *       &lt;/xs:element>
 *       &lt;xs:element name="item" maxOccurs="unbounded">
 *         &lt;!-- Reference to inner class Item -->
 *       &lt;/xs:element>
 *     &lt;/xs:sequence>
 *     &lt;xs:attribute type="xs:string" use="required" name="orderid"/>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class Example1
{
    private String orderperson;
    private String shiptoName;
    private String shiptoAddress;
    private String shiptoCity;
    private String shiptoCountry;
    private List<Item> itemList = new ArrayList<Item>();
    private String orderid;

    /** 
     * Get the 'orderperson' element value.
     * 
     * @return value
     */
    public String getOrderperson() {
        return orderperson;
    }

    /** 
     * Set the 'orderperson' element value.
     * 
     * @param orderperson
     */
    public void setOrderperson(String orderperson) {
        this.orderperson = orderperson;
    }

    /** 
     * Get the 'name' element value.
     * 
     * @return value
     */
    public String getShiptoName() {
        return shiptoName;
    }

    /** 
     * Set the 'name' element value.
     * 
     * @param shiptoName
     */
    public void setShiptoName(String shiptoName) {
        this.shiptoName = shiptoName;
    }

    /** 
     * Get the 'address' element value.
     * 
     * @return value
     */
    public String getShiptoAddress() {
        return shiptoAddress;
    }

    /** 
     * Set the 'address' element value.
     * 
     * @param shiptoAddress
     */
    public void setShiptoAddress(String shiptoAddress) {
        this.shiptoAddress = shiptoAddress;
    }

    /** 
     * Get the 'city' element value.
     * 
     * @return value
     */
    public String getShiptoCity() {
        return shiptoCity;
    }

    /** 
     * Set the 'city' element value.
     * 
     * @param shiptoCity
     */
    public void setShiptoCity(String shiptoCity) {
        this.shiptoCity = shiptoCity;
    }

    /** 
     * Get the 'country' element value.
     * 
     * @return value
     */
    public String getShiptoCountry() {
        return shiptoCountry;
    }

    /** 
     * Set the 'country' element value.
     * 
     * @param shiptoCountry
     */
    public void setShiptoCountry(String shiptoCountry) {
        this.shiptoCountry = shiptoCountry;
    }

    /** 
     * Get the list of 'item' element items.
     * 
     * @return list
     */
    public List<Item> getItemList() {
        return itemList;
    }

    /** 
     * Set the list of 'item' element items.
     * 
     * @param list
     */
    public void setItemList(List<Item> list) {
        itemList = list;
    }

    /** 
     * Get the 'orderid' attribute value.
     * 
     * @return value
     */
    public String getOrderid() {
        return orderid;
    }

    /** 
     * Set the 'orderid' attribute value.
     * 
     * @param orderid
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:xs="http://www.w3.org/2001/XMLSchema" name="item" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="title"/>
     *       &lt;xs:element type="xs:string" name="note" minOccurs="0"/>
     *       &lt;xs:element type="xs:string" name="quantity"/>
     *       &lt;xs:element type="xs:decimal" name="price"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class Item
    {
        private String title;
        private String note;
        private String quantity;
        private BigDecimal price;

        /** 
         * Get the 'title' element value.
         * 
         * @return value
         */
        public String getTitle() {
            return title;
        }

        /** 
         * Set the 'title' element value.
         * 
         * @param title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /** 
         * Get the 'note' element value.
         * 
         * @return value
         */
        public String getNote() {
            return note;
        }

        /** 
         * Set the 'note' element value.
         * 
         * @param note
         */
        public void setNote(String note) {
            this.note = note;
        }

        /** 
         * Get the 'quantity' element value.
         * 
         * @return value
         */
        public String getQuantity() {
            return quantity;
        }

        /** 
         * Set the 'quantity' element value.
         * 
         * @param quantity
         */
        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        /** 
         * Get the 'price' element value.
         * 
         * @return value
         */
        public BigDecimal getPrice() {
            return price;
        }

        /** 
         * Set the 'price' element value.
         * 
         * @param price
         */
        public void setPrice(BigDecimal price) {
            this.price = price;
        }
    }
}

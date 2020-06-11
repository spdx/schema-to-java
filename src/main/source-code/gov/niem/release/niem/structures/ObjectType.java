
package gov.niem.release.niem.structures;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectType
{
    private List<ObjectAugmentationPoint> objectAugmentationPointList = new ArrayList<ObjectAugmentationPoint>();
    private Id id;
    private Ref ref;
    private Uri uri;
    private Metadata metadata;
    private RelationshipMetadata relationshipMetadata;

    /** 
     * Get the list of 'ObjectAugmentationPoint' element items.
     * 
     * @return list
     */
    public List<ObjectAugmentationPoint> getObjectAugmentationPointList() {
        return objectAugmentationPointList;
    }

    /** 
     * Set the list of 'ObjectAugmentationPoint' element items.
     * 
     * @param list
     */
    public void setObjectAugmentationPointList(
            List<ObjectAugmentationPoint> list) {
        objectAugmentationPointList = list;
    }

    /** 
     * Get the 'id' attribute value.
     * 
     * @return value
     */
    public Id getId() {
        return id;
    }

    /** 
     * Set the 'id' attribute value.
     * 
     * @param id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /** 
     * Get the 'ref' attribute value.
     * 
     * @return value
     */
    public Ref getRef() {
        return ref;
    }

    /** 
     * Set the 'ref' attribute value.
     * 
     * @param ref
     */
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    /** 
     * Get the 'uri' attribute value.
     * 
     * @return value
     */
    public Uri getUri() {
        return uri;
    }

    /** 
     * Set the 'uri' attribute value.
     * 
     * @param uri
     */
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    /** 
     * Get the 'metadata' attribute value.
     * 
     * @return value
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /** 
     * Set the 'metadata' attribute value.
     * 
     * @param metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /** 
     * Get the 'relationshipMetadata' attribute value.
     * 
     * @return value
     */
    public RelationshipMetadata getRelationshipMetadata() {
        return relationshipMetadata;
    }

    /** 
     * Set the 'relationshipMetadata' attribute value.
     * 
     * @param relationshipMetadata
     */
    public void setRelationshipMetadata(
            RelationshipMetadata relationshipMetadata) {
        this.relationshipMetadata = relationshipMetadata;
    }
    public static class Id
    {
        private String id;

        /** 
         * Get the 'id' attribute value.
         * 
         * @return value
         */
        public String getId() {
            return id;
        }

        /** 
         * Set the 'id' attribute value.
         * 
         * @param id
         */
        public void setId(String id) {
            this.id = id;
        }
    }
    public static class Ref
    {
        private String ref;

        /** 
         * Get the 'ref' attribute value.
         * 
         * @return value
         */
        public String getRef() {
            return ref;
        }

        /** 
         * Set the 'ref' attribute value.
         * 
         * @param ref
         */
        public void setRef(String ref) {
            this.ref = ref;
        }
    }
    public static class Uri
    {
        private String uri;

        /** 
         * Get the 'uri' attribute value.
         * 
         * @return value
         */
        public String getUri() {
            return uri;
        }

        /** 
         * Set the 'uri' attribute value.
         * 
         * @param uri
         */
        public void setUri(String uri) {
            this.uri = uri;
        }
    }
    public static class Metadata
    {
        private String metadata;

        /** 
         * Get the 'metadata' attribute value.
         * 
         * @return value
         */
        public String getMetadata() {
            return metadata;
        }

        /** 
         * Set the 'metadata' attribute value.
         * 
         * @param metadata
         */
        public void setMetadata(String metadata) {
            this.metadata = metadata;
        }
    }
    public static class RelationshipMetadata
    {
        private String relationshipMetadata;

        /** 
         * Get the 'relationshipMetadata' attribute value.
         * 
         * @return value
         */
        public String getRelationshipMetadata() {
            return relationshipMetadata;
        }

        /** 
         * Set the 'relationshipMetadata' attribute value.
         * 
         * @param relationshipMetadata
         */
        public void setRelationshipMetadata(String relationshipMetadata) {
            this.relationshipMetadata = relationshipMetadata;
        }
    }
}

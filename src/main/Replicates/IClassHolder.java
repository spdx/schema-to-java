import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * Interface for working with classes during code generation.
 * 
 * @author Dennis M. Sosnoski
 */
public interface IClassHolder
{
    /**
     * Get simple name.
     * 
     * @return name
     */
    String getName();

    /**
     * Get fully-qualified name.
     * 
     * @return name
     */
    String getFullName();
    
    /**
     * Get containing class of inner class.
     * 
     * @return outer containing class, or <code>null</code> if not an inner class
     */
    IClassHolder getOuterClass();
    
    /**
     * Check if superclass is forced by schema model.
     *
     * @return <code>true</code> if superclass forced, <code>false</code> if not
     */
    boolean isSuperClassForced();

    /**
     * Get name of base class to be extended.
     *
     * @return base (<code>null</code> if none)
     */
    String getSuperClassName();

    /**
     * Set name of base class to be extended. This method can only be used if {@link #isSuperClassForced()} returns
     * <code>false</code>.
     *
     * @param base fully-qualified class name of base class (<code>null</code> if none)
     */
    void setSuperClassName(String base);

    /**
     * Set name of list implementation class to be used for initializing instances.
     *
     * @param list fully-qualified class name of list implementation (non-<code>null</code>)
     */
    void setListImplementation(String list);

    /**
     * Add import for class. If the requested import doesn't conflict with the current set it's added, otherwise it's
     * ignored.
     * 
     * @param type fully qualified class name
     * @return <code>true</code> if added as import
     */
    boolean addImport(String type);

    /**
     * Get the name to be used for a type. If the type has been imported this returns the short form of the name;
     * otherwise it just returns the fully-qualified name.
     * 
     * @param type fully-qualified type name
     * @return name
     */
    String getTypeName(String type);
    
    /**
     * Get the interfaces implemented by this class.
     *
     * @return interface names
     */
    String[] getInterfaces();
    
    /**
     * Get the fields defined in this class.
     *
     * @return fields
     */
    FieldDeclaration[] getFields();
    
    /**
     * Get the methods defined in this class.
     *
     * @return methods
     */
    MethodDeclaration[] getMethods();

    /**
     * Add an interface to this class definition.
     *
     * @param interf interface type
     */
    void addInterface(String interf);
    
    /**
     * Add field declaration to class.
     *
     * @param field Declaration
     */
    void addField(FieldDeclaration field);
    
    /**
     * Add method declaration to class.
     *
     * @param method Declaration
     */
    void addMethod(MethodDeclaration method);
    
    /**
     * Add inner type declaration to class.
     *
     * @param type declaration
     */
    void addType(TypeDeclaration type);
}
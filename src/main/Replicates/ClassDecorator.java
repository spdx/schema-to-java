import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.jibx.binding.model.ElementBase;
import IClassHolder;

/**
 * Interface implemented by class construction decorators used during code generation.
 * 
 * @author Dennis M. Sosnoski
 */
public interface ClassDecorator
{
    /**
     * Method called before starting code generation for the target class.
     *
     * @param holder
     */
   void start(IClassHolder holder);
    
    /**
     * Method called after adding each data value to class.
     * 
     * @param basename base name used for data value
     * @param collect repeated value flag
     * @param type value type (item value type, in the case of a repeated value)
     * @param field actual field
     * @param getmeth read access method (<code>null</code> if a flag value)
     * @param setmeth write access method (<code>null</code> if a flag value)
     * @param descript value description text
     * @param holder
     */
    void valueAdded(String basename, boolean collect, String type, String descript);
    
    /**
     * Method called after completing code generation for the target class.
     *
     * @param binding binding definition element for class, a &lt;format&gt; if the class is an enumeration, a &lt;mapping&gt;
     * or &lt;structure&gt; if it's a normal class
     * @param holder
     */
    void finish(ElementBase binding, IClassHolder holder);
}
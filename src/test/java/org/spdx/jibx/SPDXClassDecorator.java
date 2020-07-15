package org.spdx.jibx;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import org.jibx.binding.model.ContainerElementBase;
import org.jibx.binding.model.ElementBase;

import org.jibx.schema.codegen.IClassHolder;
import org.jibx.schema.codegen.extend.ClassDecorator;
import org.jibx.schema.codegen.extend.NameMatchDecoratorBase;

//import org.jibx.util.NameUtilities;

public class SPDXClassDecorator extends NameMatchDecoratorBase implements ClassDecorator {
	
	    private String m_baseClass;
	    
	    /** Name of method to be called after an instance of class is unmarshalled (<code>null</code> if none). */
	    private String m_postSetName;
	    
	    /** Name of method to be called before an instance of class is unmarshalled (<code>null</code> if none). */
	    private String m_preSetName;
	    
	    /** Name of method to be called before an instance of class is marshalled (<code>null</code> if none). */
	    private String m_preGetName;
	    
	    /**
	     * Set base class to be set for matched classes.
	     *
	     * @param name
	     */
	    public void setBaseClass(String name) {
	        m_baseClass = name;
	    }
	    /**
	     * Set name of method to be called after an instance of class is unmarshalled.
	     *
	     * @param name
	     */
	    public void setPostSet(String name) {
	        m_postSetName = name;
	    }

	    /**
	     * Set name of method to be called before an instance of class is unmarshalled.
	     *
	     * @param name
	     */
	    public void setPreSet(String name) {
	        m_preSetName = name;
	    }

	    /**
	     * Set name of method to be called before an instance of class is marshalled.
	     *
	     * @param name
	     */
	    public void setPreGet(String name) {
	        m_preGetName = name;
	    }
	    
	    /**
	     * Method called after completing code generation for the target class. This sets the object attributes, if needed.
	     *
	     * @param binding 
	     * @param holder
	     */
	    public void finish(ElementBase binding, IClassHolder holder) {
	        if (matchName(holder.getName()) && (m_postSetName != null || m_preSetName != null || m_preGetName != null)) {
	            if (binding instanceof ContainerElementBase) {
	                ContainerElementBase contain = (ContainerElementBase)binding;
	                contain.setPostsetName(m_postSetName);
	                contain.setPresetName(m_preSetName);
	                contain.setPregetName(m_preGetName);
	            } else {
	                throw new IllegalStateException("Class " + holder.getFullName() + " is not a data class");
	            }
	        }
	    }
	    
	    /**
	     * Method called before starting code generation for the target class. This just sets the superclass.
	     *
	     * @param holder
	     */
	    public void start(IClassHolder holder) {
	        if (matchName(holder.getName())) {
	            holder.setSuperClassName(m_baseClass);
	        }
	    }
	    
	    /**
	     * Method called after adding each data value to class. Unused for this decorator.
	     * 
	     * @param basename base name used for data value
	     * @param collect repeated value flag
	     * @param type value type (item value type, in the case of a repeated value)
	     * @param field actual field
	     * @param getmeth read access method
	     * @param setmeth write access method
	     * @param descript value description text
	     * @param holder
	     */
	    public void valueAdded(String basename, boolean collect, String type, FieldDeclaration field,
	        MethodDeclaration getmeth, MethodDeclaration setmeth, String descript, IClassHolder holder) {}

	public static void main(String[] args) {

//System.out.println("hi");
		
		
	}

	

	
}

package org.spdx.jibx;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;

import org.jibx.binding.model.ContainerElementBase;
import org.jibx.binding.model.ElementBase;

import org.jibx.schema.codegen.IClassHolder;
import org.jibx.schema.codegen.extend.ClassDecorator;
import org.jibx.schema.codegen.extend.NameMatchDecoratorBase;
import org.jibx.util.NameUtilities;

public class SPDXClassDecorator extends NameMatchDecoratorBase implements ClassDecorator {
	
	/**
	 * ExtensionDecorator.java 
	 * New class decorator for setting a base class to be extended by the generated class,
	 * and also allowing pre-get/pre-set/post-set methods to be specified (from the base class, normally).
	 */
	/**
	 * ClassHolder.java 
	 * Log Message:
	 * Implement added interface method, add finishClass() method to call decorators at end of class construction and set superclass name (if requested).
	 */
	 private String m_matchName;

	
	
	  
	  /** Base class to be set for matched classes. */
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
     * Match class name against pattern. protected boolean matchName(String name) {
     *  if (m_matchName != null) {
     *      return NameUtilities.isPatternMatch(name, m_matchName);
     *   }
     *   return true;
     *   }
     *
     * @param name
     * @return <code>true</code> if name matches pattern, <code>false</code> if not
     */
    
    
    protected boolean matchName(String name) {
     
        if (m_matchName != null) {
            return NameUtilities.isPatternMatch(name, m_matchName);
        }
        return true;
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
    	if( holder.getSuperClassName()==null &&  matchName(holder.getName())) {
    		
            holder.setSuperClassName(m_baseClass);
        }
    }
    
  /*  private boolean matchName(String name) {
		// TODO Auto-generated method stub
		return false;
	}
*/
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

	/**
	  *
      * Check if superclass is forced by schema model.
      *
      * @return <code>true</code> if superclass forced, <code>false</code> if not
      */
	  
	  
    
     
     /**
       * Get name of base class to be extended.


          if (m_superClass == null) {
             m_superName = base;
             if (base != null) {
                 boolean imported = m_importsTracker.addImport(base, false);
                 if (s_logger.isDebugEnabled()) {
                     s_logger.debug("Set superclass of " + getFullName() + " to " + base +
                         (imported ? " (imported)" : ""));
                 }
             }
          } else {
              throw new IllegalArgumentException("Error - superclass is forced by schema model and cannot be overridden");


          m_classBuilder = builder;
          
         // call decorators for initialization processing
         for (int i = 0; i < m_decorators.length; i++) {
             m_decorators[i].start(this);
         }
         
          // include documentation and/or schema in class comment if enabled
          StringBuffer buff = new StringBuffer();
         }
          
         // call decorators for initialization processing
         for (int i = 0; i < m_decorators.length; i++) {
             m_decorators[i].start(this);
         }  
          // set flag to avoid re-generation
          m_generated = true;
          
          
      /**
      * Finish class construction. This is a support method for use by subclasses, which handles common completion
      * processing
      * 
      * @param binding binding definition component for this class
      */
    
     /**
      *  protected void finishClass(ElementBase binding) {
      *   for (int i = 0; i < m_decorators.length; i++) {
      *   m_decorators[i].finish(binding, this);
      *   }
      *   String basename = getSuperClass() == null ? getSuperClassName() : getSuperClass().getFullName();
      *   if (basename != null) {
      *   m_classBuilder.setSuperclass(basename);
      *   }
      *   }
      */
    
    
     /**
       * Generate any inner classes of this class.
       *
	   */
	
				/**
				 *   public void start(IClassHolder holder) {
				 *       if (matchName(holder.getName())) {
				 *       holder.setSuperClassName(m_baseClass);
				 *       }
				 *       }
				 * @return 
				 */      

  public static void main(String args[]) {
	System.out.println("hi");
}
  
}

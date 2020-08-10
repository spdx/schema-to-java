package org.spdx.jibx;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import org.jibx.binding.model.ContainerElementBase;
import org.jibx.binding.model.ElementBase;

import org.jibx.schema.codegen.ClassHolder;
import org.jibx.schema.codegen.ClassHolderHelper;
import org.jibx.schema.codegen.EnumerationClassHolder;
import org.jibx.schema.codegen.IClassHolder;

import org.jibx.schema.codegen.extend.ClassDecorator;
import org.jibx.schema.codegen.extend.NameMatchDecoratorBase;s


public class SPDXClassDecorator extends NameMatchDecoratorBase implements ClassDecorator {

    private String m_baseClass;
    
    private String m_postSetName;
    
    private String m_preSetName;
    
    private String m_preGetName;
    
    public void setBaseClass(String name) {
        m_baseClass = name;
    }

    public void setPostSet(String name) {
        m_postSetName = name;
    }

    public void setPreSet(String name) {
        m_preSetName = name;
    }

    public void setPreGet(String name) {
        m_preGetName = name;

    }

   
    public void finish(ElementBase binding, IClassHolder holder) {
        if (matchName(holder.getName()) && (m_postSetName != null || m_preSetName != null || m_preGetName != null)) {
            if (binding instanceof ContainerElementBase) {
                ContainerElementBase contain = (ContainerElementBase)binding;
                contain.setPostsetName(m_postSetName);
                contain.setPresetName(m_preSetName);
                contain.setPregetName(m_preGetName);

            }
         } 
            else {
                throw new IllegalStateException("Class " + holder.getFullName() + " is not a data class");
            }
        }
    
    
    
    

    public void start(IClassHolder holder) {
       
        if(!(holder instanceof EnumerationClassHolder)) {      // for constructors 				
				
				AST ast = ClassHolderHelper.getAST((ClassHolder)holder);
				
				SingleVariableDeclaration param = ast.newSingleVariableDeclaration();
				 				
				MethodDeclaration constr = ast.newMethodDeclaration();
								
				Block block = ast.newBlock() ;
					 					
				String param_name = "Id";    // parameter name
				
				Name param_type = ast.newName("String");        // parameter datatype
		  		 				 																	
			    String name = holder.getName();           // Constructor name
				 					 
			    SimpleName sname = ast.newSimpleName(name);
			     	        	
				constr.setName(sname);  
	 	         					
				constr.setConstructor(true); 
				
			    param.setName(ast.newSimpleName(param_name));
			
			    param.setType(ast.newSimpleType(param_type));
			    
                constr.parameters().add(param);
 			    
 			    constr.setBody(block);
 				
 			    if( !(holder.getSuperClassName()==null) &&  matchName(holder.getName()))
			    {		   	 			     	
			        sci.arguments().add(ast.newSimpleName(param_name)); 	
			       	block.statements().add(sci);
			    }
			    else
			     	block.statements().add(ast.newSuperConstructorInvocation());
			    	
			    holder.addMethod(constr);   			    
	    	 }
			
			
			if( holder.getSuperClassName()==null &&  matchName(holder.getName()) && !(holder instanceof EnumerationClassHolder) )  {    		
		        holder.setSuperClassName(m_baseClass);
			}		
	 }      //start() closed here
        
        
        
        
        
      /*   if(!(holder instanceof EnumerationClassHolder)) {   // For GetType()
 		   
 		    AST ast = ClassHolderHelper.getAST((ClassHolder)holder);
 		    
 		        MethodDeclaration method = ast.newMethodDeclaration();
 		     
 				Type returnType = ast.newSimpleType(ast.newName("String"));
 				
 				Block block = ast.newBlock() ;    
 	
 			    ReturnStatement ret = ast.newReturnStatement();
 			    			    
 			    Expression exp =  ast.newSimpleName(holder.getName());
            
 		       	ret.setExpression(exp);
      
 			    block.statements().add(ret);
 			 	        		            			
 	            method.setName(ast.newSimpleName("getType"));	
 	            	                         
 	            method.setBody(block);
 	            
 	            method.setReturnType2(returnType);              //error-prone line
 	             
 	            holder.addMethod(method); 
 	    	}	
 	    	
 	    	
 	    	
 	    	-----------------------------------------
 	    	output:
 	    	   String getType() {
                     return Classname;              //show error at Classname, "Classname cannot be resolved to a variable"
               }

 	    	-------------------------------------------
 	    	 	    	
 	    	*/
    }
    
  
    public void valueAdded(String basename, boolean collect, String type, FieldDeclaration field,
            MethodDeclaration getmeth, MethodDeclaration setmeth, String descript, IClassHolder holder) {}


   
     public static void main(String args[]) {
	//System.out.println("hi");
    }
  
}
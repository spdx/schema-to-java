package org.spdx.jibx;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;

import org.jibx.binding.model.ContainerElementBase;
import org.jibx.binding.model.ElementBase;

import org.jibx.schema.codegen.ClassHolder;
import org.jibx.schema.codegen.ClassHolderHelper;
import org.jibx.schema.codegen.EnumerationClassHolder;
import org.jibx.schema.codegen.IClassHolder;

import org.jibx.schema.codegen.extend.ClassDecorator;
import org.jibx.schema.codegen.extend.NameMatchDecoratorBase;


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
    	   	
		if(!(holder instanceof EnumerationClassHolder)) {
			AST ast = ClassHolderHelper.getAST((ClassHolder)holder);
			 
			    SingleVariableDeclaration param = ast.newSingleVariableDeclaration();
			    SingleVariableDeclaration param1 = ast.newSingleVariableDeclaration();
			    SingleVariableDeclaration param2 = ast.newSingleVariableDeclaration();
			    SingleVariableDeclaration param3 = ast.newSingleVariableDeclaration();
			    SingleVariableDeclaration param4 = ast.newSingleVariableDeclaration();
	    	    SingleVariableDeclaration param5 = ast.newSingleVariableDeclaration();
			
			    SuperConstructorInvocation sci1 = ast.newSuperConstructorInvocation();
			    SuperConstructorInvocation sci2 = ast.newSuperConstructorInvocation();
			 
			    MethodDeclaration constr = ast.newMethodDeclaration();
		   	    MethodDeclaration constr2 = ast.newMethodDeclaration();
							
			    Block block1 = ast.newBlock() ;
			    Block block2 = ast.newBlock() ;
			
			    String param_name = "Id"; 
			    String param_name1 = "modelStore";
			    String param_name2 = "documentUri";
			    String param_name3 = "id";
	    	    String param_name4 = "copyManager";
			    String param_name5 = "create";
			
		    	Name param_type = ast.newName("String"); 
			    Name param_type1 = ast.newName("IModelStore");
			    Name param_type2 = ast.newName("String");
			    Name param_type3 = ast.newName("String");
			    Name param_type4 = ast.newName("ModelCopyManager");        
			    Name param_type5 = ast.newName("Boolean");                
			
			    String name = holder.getName();  				 																	
			    String name2 = holder.getName();          
			 			
		   	    SimpleName sname = ast.newSimpleName(name);
		        SimpleName sname2 = ast.newSimpleName(name2);
		     
		        constr.setName(sname); 
		        constr2.setName(sname2);  
 	        
		        constr.setConstructor(true); 
		        constr2.setConstructor(true); 
			
		        param.setName(ast.newSimpleName(param_name));				    
		        param1.setName(ast.newSimpleName(param_name1));
		        param2.setName(ast.newSimpleName(param_name2));
     	        param3.setName(ast.newSimpleName(param_name3));
		        param4.setName(ast.newSimpleName(param_name4));
		        param5.setName(ast.newSimpleName(param_name5));
		    
	   	        param.setType(ast.newSimpleType(param_type));
		        param1.setType(ast.newSimpleType(param_type1));
		        param2.setType(ast.newSimpleType(param_type2));
		        param3.setType(ast.newSimpleType(param_type3));
	            param4.setType(ast.newSimpleType(param_type4));
	            param5.setType(ast.newSimpleType(param_type5));
	   
	            constr.parameters().add(param);
		        constr2.parameters().add(param1);
		        constr2.parameters().add(param2);
		        constr2.parameters().add(param3);
		        constr2.parameters().add(param4);
		        constr2.parameters().add(param5);
		     
		        constr.setBody(block1);
		        constr2.setBody(block2);
				
		        sci1.arguments().add(ast.newSimpleName(param_name));  			     	
		        sci2.arguments().add(ast.newSimpleName(param_name1)); 	
	            sci2.arguments().add(ast.newSimpleName(param_name2)); 
	            sci2.arguments().add(ast.newSimpleName(param_name3)); 
                sci2.arguments().add(ast.newSimpleName(param_name4)); 
                sci2.arguments().add(ast.newSimpleName(param_name5)); 
             
        	    block1.statements().add(sci1);
		        block2.statements().add(sci2);
		   
		        holder.addMethod(constr);  
		        holder.addMethod(constr2);   			    
    	 }

		
		if( holder.getSuperClassName()==null &&  matchName(holder.getName()) && !(holder instanceof EnumerationClassHolder) )  {    		
	        holder.setSuperClassName(m_baseClass);
		}	
	    	
		  if(!(holder instanceof EnumerationClassHolder)) {     
		        Modifier modifier = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	        
		        MethodDeclaration method = ast.newMethodDeclaration(); 		     
				Type returnType = ast.newSimpleType(ast.newName("String")); 				
				Block block = ast.newBlock() ;     	
			    ReturnStatement ret = ast.newReturnStatement(); 			    			    
			    StringLiteral sl =  ast.newStringLiteral();    
			    sl.setLiteralValue(holder.getName());
		       	ret.setExpression(sl);      
			    block.statements().add(ret);	 			
			    method.setName(ast.newSimpleName("getType"));
			    method.modifiers().add(modifier);  	 	            	                         
	            method.setBody(block); 	            
	            method.setReturnType2(returnType);                           
	            holder.addMethod(method);   	        
	    	}	
 	  } 
    
    
    
  
    public void valueAdded(String basename, boolean collect, String type, FieldDeclaration field,
            MethodDeclaration getmeth, MethodDeclaration setmeth, String descript, IClassHolder holder) {}


   
    
     public static void main(String args[]) {
	//System.out.println("hi");
    }
  
}
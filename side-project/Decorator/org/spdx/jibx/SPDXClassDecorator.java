package org.spdx.jibx;

import java.util.ArrayList;

import org.eclipse.jdt.core.dom.AST;

import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.ChildPropertyDescriptor;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.InfixExpression.Operator;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.SimpleName;

import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;

import org.jibx.binding.model.ContainerElementBase;
import org.jibx.binding.model.ElementBase;

import org.jibx.schema.codegen.ClassHolder;
import org.jibx.schema.codegen.ClassHolderHelper;
import org.jibx.schema.codegen.EnumerationClassHolder;
import org.jibx.schema.codegen.EnumerationClassHolderHelper;
import org.jibx.schema.codegen.IClassHolder;

import org.jibx.schema.elements.FacetElement;
import org.jibx.schema.elements.FacetElement.Enumeration;
import org.jibx.schema.elements.FilteredSegmentList;
import org.jibx.runtime.EnumSet;

import org.jibx.schema.codegen.extend.ClassDecorator;
import org.jibx.schema.codegen.extend.NameMatchDecoratorBase;

public class SPDXClassDecorator extends NameMatchDecoratorBase implements ClassDecorator {
	private String m_baseClass;
    
    private String m_postSetName;

    private String m_preSetName;
    
    private String m_preGetName;
     
    private String m_Interface;

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
    
    public void setInterface(String name){
    	m_Interface = name;
    }
    
    public void finish(ElementBase binding, IClassHolder holder) {
    	binding.getClass().getConstructors();
    	if(matchName(holder.getName()) && (m_postSetName != null || m_preSetName != null || m_preGetName != null) ) {  
    		if (binding instanceof ContainerElementBase  ) {
    			ContainerElementBase contain = (ContainerElementBase)binding;
    			contain.setPostsetName(m_postSetName);
                contain.setPresetName(m_preSetName);
                contain.setPregetName(m_preGetName);   
    		}
    		else {
    			throw new IllegalStateException("Class " + holder.getFullName() + " is not a data class");
    		}
    	}
    }
    
    public void start(IClassHolder holder) {
    	AST ast = ClassHolderHelper.getAST((ClassHolder)holder); 
    	if(!(holder instanceof EnumerationClassHolder)) {    
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
    	
    	if(holder instanceof EnumerationClassHolder){
    		
    		holder.addInterface(m_Interface);   
    		SimpleName fieldname = ast.newSimpleName("longName");	
			VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
			Modifier modifier4 = ast.newModifier(Modifier.ModifierKeyword.PRIVATE_KEYWORD); 
			fragment.setName(fieldname);
			FieldDeclaration field = ast.newFieldDeclaration(fragment);
			Type returnType4 = ast.newSimpleType(ast.newName("String")); 
			field.modifiers().add(modifier4); 
		    field.setType(returnType4);
		    holder.addField(field);
		    
		    InfixExpression  operator = ast.newInfixExpression();			
 					
			Modifier modifier = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	
			Modifier modifier2 = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	
			Modifier modifier3 = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD);
 					
			MethodInvocation mi = ast.newMethodInvocation();
			MethodInvocation mi2 = ast.newMethodInvocation();
 					 				
			mi.setName(ast.newSimpleName("getLongName"));
			mi2.setName(ast.newSimpleName("getNameSpace"));
 			
		    operator.setLeftOperand(mi);
		    operator.setOperator(Operator.PLUS);
		    operator.setRightOperand(mi2);
 
			ReturnStatement ret = ast.newReturnStatement();
			ReturnStatement ret2 = ast.newReturnStatement();
			ReturnStatement ret3 = ast.newReturnStatement();
 					 									
			StringLiteral sl =  ast.newStringLiteral();  
			StringLiteral sl2 =  ast.newStringLiteral();  
 					
			Block block = ast.newBlock() ; 
		    Block block2 = ast.newBlock() ; 
			Block block3 = ast.newBlock() ; 
 					 
	        MethodDeclaration Emethod = ast.newMethodDeclaration(); 
	        MethodDeclaration Emethod2 = ast.newMethodDeclaration(); 
	        MethodDeclaration Emethod3 = ast.newMethodDeclaration(); 
 	 		        
			Type returnType = ast.newSimpleType(ast.newName("String")); 
			Type returnType2 = ast.newSimpleType(ast.newName("String"));
			Type returnType3 = ast.newSimpleType(ast.newName("String"));
 	 				
		    String paramPassed = "longName";
		    String paramPassed1 = "SpdxConstants.SPDX_NAMESPACE";
 	 			  
		    sl.setLiteralValue(paramPassed);
		    sl2.setLiteralValue(paramPassed1);
 	 			    
		    ret.setExpression(sl);   	 			
		    ret3.setExpression(sl2);  
	        ret2.setExpression(operator);
 	 			  
		    block.statements().add(ret);
		    block2.statements().add(ret2);
		    block3.statements().add(ret3);
 	 			  
		    Emethod.setName(ast.newSimpleName("getLongName"));
		    Emethod2.setName(ast.newSimpleName("getIndividualURI"));
		    Emethod3.setName(ast.newSimpleName("getNameSpace"));
 	 			    
            Emethod.modifiers().add(modifier);  
            Emethod2.modifiers().add(modifier2);
            Emethod3.modifiers().add(modifier3);
 
            Emethod.setBody(block); 
            Emethod2.setBody(block2); 
            Emethod3.setBody(block3); 
            
            Emethod.setReturnType2(returnType);
            Emethod2.setReturnType2(returnType2); 
            Emethod3.setReturnType2(returnType3); 
 	 	            
            holder.addMethod(Emethod);   
            holder.addMethod(Emethod3);  
            holder.addMethod(Emethod2);  
    	}
    }
    
    
    public void valueAdded(String basename, boolean collect, String type, FieldDeclaration field,
    		MethodDeclaration getmeth, MethodDeclaration setmeth, String descript, IClassHolder holder) {
    	
    }
	
	
}


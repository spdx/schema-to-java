ackage org.spdx.jibx;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.InfixExpression.Operator;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;

import org.jibx.binding.model.ElementBase;

import org.jibx.schema.codegen.ClassHolder;
import org.jibx.schema.codegen.ClassHolderHelper;
import org.jibx.schema.codegen.EnumerationClassHolder;
import org.jibx.schema.codegen.IClassHolder;
import org.jibx.schema.codegen.extend.ClassDecorator;
import org.jibx.schema.codegen.extend.NameMatchDecoratorBase;

public class SPDXClassDecorator extends NameMatchDecoratorBase implements ClassDecorator {
	String m_listClass; 
	
	private String m_baseClass;
	
	private String m_Interface;
	
	public void setListClass(String name) {
		m_listClass = name;
	}
	
	public void setBaseClass(String name) {
		m_baseClass = name;
	}
	
	public void setInterface(String name) {
		m_Interface = name;
	}
	
	public void finish(ElementBase binding, IClassHolder holder) {}
	
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
 					
			String param_nameId = "Id"; 
			String param_nameModelStore = "modelStore";
			String param_nameDocumentUri = "documentUri";
			String param_name_id = "id";
			String param_nameCopyManager = "copyManager";
			String param_nameCreate = "create";
 					
			Name param_type = ast.newName("String"); 
			Name param_type1 = ast.newName("IModelStore");
			Name param_type2 = ast.newName("String");
			Name param_type3 = ast.newName("String");
			Name param_type4 = ast.newName("ModelCopyManager");        
			Name param_type5 = ast.newName("Boolean");                
 					
 			String constructorName1 = holder.getName();  				 																	
			String constructorName2 = holder.getName();         
 					
			SimpleName sname = ast.newSimpleName(constructorName1);
			SimpleName sname2 = ast.newSimpleName(constructorName2);
 			     
			constr.setName(sname); 
			constr2.setName(sname2);  
 		 	        
			constr.setConstructor(true); 
			constr2.setConstructor(true); 
 					
			param.setName(ast.newSimpleName(param_nameId));				    
			param1.setName(ast.newSimpleName(param_nameModelStore));
			param2.setName(ast.newSimpleName(param_nameDocumentUri));
			param3.setName(ast.newSimpleName(param_name_id));
			param4.setName(ast.newSimpleName(param_nameCopyManager));
			param5.setName(ast.newSimpleName(param_nameCreate));
 				    
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
			
			sci1.arguments().add(ast.newSimpleName(param_nameId));  
			sci2.arguments().add(ast.newSimpleName(param_nameModelStore)); 	
			sci2.arguments().add(ast.newSimpleName(param_nameDocumentUri)); 
			sci2.arguments().add(ast.newSimpleName(param_name_id)); 
			sci2.arguments().add(ast.newSimpleName(param_nameCopyManager)); 
			sci2.arguments().add(ast.newSimpleName(param_nameCreate)); 
			
			block1.statements().add(sci1);
			block2.statements().add(sci2);
 				   
			holder.addMethod(constr);  
			holder.addMethod(constr2);   	
			
			Modifier modifierGetType = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	 
			MethodDeclaration methodGetType = ast.newMethodDeclaration(); 	
			Type returnType = ast.newSimpleType(ast.newName("String")); 				
			Block blockGetType = ast.newBlock() ;     
			ReturnStatement retGetType = ast.newReturnStatement(); 	
			StringLiteral stringLiteral1 =  ast.newStringLiteral();    
			stringLiteral1.setLiteralValue(holder.getName());
			retGetType.setExpression(stringLiteral1);      
			blockGetType.statements().add(retGetType);	
			methodGetType.setName(ast.newSimpleName("getType"));
			methodGetType.modifiers().add(modifierGetType);  
			methodGetType.setBody(blockGetType); 	
			methodGetType.setReturnType2(returnType); 
			holder.addMethod(methodGetType); 
		}
		else {
			holder.addInterface(m_Interface);    
			
			InfixExpression  infix_operator = ast.newInfixExpression();			
 					
			Modifier modifierGetLongName = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	
			Modifier modifierGetIndividualURI = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	
			Modifier modifierGetNameSpace = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD);
 					
			MethodInvocation miGetLongName = ast.newMethodInvocation();
			MethodInvocation miGetNameSpace = ast.newMethodInvocation();
 					 				
			miGetLongName.setName(ast.newSimpleName("getLongName"));
			miGetNameSpace.setName(ast.newSimpleName("getNameSpace"));
 			
			infix_operator.setLeftOperand(miGetLongName);
			infix_operator.setOperator(Operator.PLUS);
			infix_operator.setRightOperand(miGetNameSpace);
			
			ReturnStatement retGetLongName = ast.newReturnStatement();
			ReturnStatement retGetIndividualURI = ast.newReturnStatement();
			ReturnStatement retGetNameSpace = ast.newReturnStatement();
 					 									
			StringLiteral stringLiteral1 =  ast.newStringLiteral();  
			StringLiteral stringLiteral2 =  ast.newStringLiteral();  
 					
			Block blockGetLongName = ast.newBlock() ; 
			Block blockGetIndividualURI = ast.newBlock() ; 
			Block blockGetNameSpace = ast.newBlock() ; 
			
			MethodDeclaration EmethodGetLongName = ast.newMethodDeclaration(); 
			MethodDeclaration EmethodGetIndividualURI = ast.newMethodDeclaration(); 
			MethodDeclaration EmethodGetNameSpace = ast.newMethodDeclaration(); 
		        
			Type returnType = ast.newSimpleType(ast.newName("String")); 
			Type returnType2 = ast.newSimpleType(ast.newName("String"));
			Type returnType3 = ast.newSimpleType(ast.newName("String"));
			
			String paramPassed = "value";
			String paramPassed1 = "SpdxConstants.SPDX_NAMESPACE";
			
			stringLiteral1.setLiteralValue(paramPassed);
			stringLiteral2.setLiteralValue(paramPassed1);
			
			retGetLongName.setExpression(stringLiteral1);   
			retGetNameSpace.setExpression(stringLiteral2);  
			retGetIndividualURI.setExpression(infix_operator);
			
			blockGetLongName.statements().add(retGetLongName);
			blockGetIndividualURI.statements().add(retGetIndividualURI);
			blockGetNameSpace.statements().add(retGetNameSpace);
			
			EmethodGetLongName.setName(ast.newSimpleName("getLongName"));
			EmethodGetIndividualURI.setName(ast.newSimpleName("getIndividualURI"));
			EmethodGetNameSpace.setName(ast.newSimpleName("getNameSpace"));
			
			EmethodGetLongName.modifiers().add(modifierGetLongName);  
			EmethodGetIndividualURI.modifiers().add(modifierGetIndividualURI);
			EmethodGetNameSpace.modifiers().add(modifierGetNameSpace);
			
			EmethodGetLongName.setBody(blockGetLongName); 
			EmethodGetIndividualURI.setBody(blockGetIndividualURI); 
			EmethodGetNameSpace.setBody(blockGetNameSpace); 
			
			EmethodGetLongName.setReturnType2(returnType);
			EmethodGetIndividualURI.setReturnType2(returnType2); 
			EmethodGetNameSpace.setReturnType2(returnType3); 
			
			holder.addMethod(EmethodGetLongName);   
			holder.addMethod(EmethodGetNameSpace);  
			holder.addMethod(EmethodGetIndividualURI);  
		} 
		
		if( holder.getSuperClassName()==null &&  matchName(holder.getName()) && !(holder instanceof EnumerationClassHolder) )  {    		
		        holder.setSuperClassName(m_baseClass);
		}	
	}
	
	public void valueAdded(String basename, boolean collect, String type, FieldDeclaration field,
        MethodDeclaration getmeth, MethodDeclaration setmeth, String descript, IClassHolder holder) {}
		

}


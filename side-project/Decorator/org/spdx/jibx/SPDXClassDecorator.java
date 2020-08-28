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
			 String constructorName=holder.getName();
        	String ParamNames1[]= {"Id"};
        	String ParamTypes1[]= {"String"};
        	SuperConstructorInvocation superConstructorInvocation1 = ast.newSuperConstructorInvocation();
	    	MethodDeclaration constructor1 = ast.newMethodDeclaration();
			createConstructor(ParamNames1, ParamTypes1, constructor1, superConstructorInvocation1, constructorName, holder, ast) ;
								
		    String	ParamNames2[]= {"modelStore", "documentUri","id", "copyManager","create"};
		    String ParamTypes2[]= {"IModelStore","String","String","ModelCopyManager","Boolean"};	
		    SuperConstructorInvocation superConstructorInvocation2 = ast.newSuperConstructorInvocation();
		    MethodDeclaration constructor2 = ast.newMethodDeclaration();		 
		    createConstructor(ParamNames2, ParamTypes2, constructor2, superConstructorInvocation2, constructorName, holder, ast) ;  
			
         	Modifier modifierGetType = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	        
         	Type returnType = ast.newSimpleType(ast.newName("String")); 
         	String methodNameGetType="getType";
		    String returnParameterGetType= holder.getName();	             
            createMethod(modifierGetType, returnType, returnParameterGetType,  methodNameGetType,  holder,  ast, null);

    	}
	 		
		else {
			holder.addInterface(m_Interface);      //added interface
				 					
			Modifier modifierGetLongName = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD);
			Type returnTypeGetLongName = ast.newSimpleType(ast.newName("String")); 
			String returnParameterGetLongName= "value";
			String methodNameGetLongName = "getLongName";
			createMethod(modifierGetLongName, returnTypeGetLongName, returnParameterGetLongName,  methodNameGetLongName, holder, ast, null);
						
			Modifier modifierGetNameSpace = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD);
			Type returnTypeGetNameSpace = ast.newSimpleType(ast.newName("String"));
			String returnParameterGetNameSpace = "SpdxConstants.SPDX_NAMESPACE";
			String methodNameGetNameSpace = "getNameSpace";
			createMethod(modifierGetNameSpace, returnTypeGetNameSpace, returnParameterGetNameSpace, methodNameGetNameSpace, holder, ast, null);
				 			
			Modifier modifierGetIndividualURI = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD); 	
			Type returnTypeGetIndividualURI = ast.newSimpleType(ast.newName("String"));
			String methodNameGetIndividualURI = "getIndividualURI";
			MethodInvocation miGetLongName = ast.newMethodInvocation();
			MethodInvocation miGetNameSpace = ast.newMethodInvocation();
			miGetLongName.setName(ast.newSimpleName("getLongName"));
			miGetNameSpace.setName(ast.newSimpleName("getNameSpace"));
			InfixExpression  infix_operator = ast.newInfixExpression();	
			infix_operator.setLeftOperand(miGetLongName);
		    infix_operator.setOperator(Operator.PLUS);
		    infix_operator.setRightOperand(miGetNameSpace);		
			createMethod(modifierGetIndividualURI, returnTypeGetIndividualURI, null, methodNameGetIndividualURI, holder,  ast, infix_operator);
							
		} 
		
		if( holder.getSuperClassName()==null &&  matchName(holder.getName()) && !(holder instanceof EnumerationClassHolder) )  {    		
		        holder.setSuperClassName(m_baseClass);
		}	
	}
	
	public void createMethod(Modifier modifier, Type returnType, String returnParameter, String methodName, IClassHolder holder, AST ast, InfixExpression infix_operator) {
	    ReturnStatement returnStatement = ast.newReturnStatement(); 
	    MethodDeclaration methodDeclaration = ast.newMethodDeclaration(); 
	    StringLiteral  stringLiteral =  ast.newStringLiteral();  
		Block block = ast.newBlock() ;     
		if(returnParameter!=null) {
			stringLiteral.setLiteralValue(returnParameter);
			returnStatement.setExpression(stringLiteral);  
		}
		else
			returnStatement.setExpression(infix_operator); 				
        block.statements().add(returnStatement);	
        SimpleName name=ast.newSimpleName(methodName);
   	    methodDeclaration.setName(name);
   	    methodDeclaration.modifiers().add(modifier);  	
   	    methodDeclaration.setBody(block); 	        
   	    methodDeclaration.setReturnType2(returnType);        
        holder.addMethod(methodDeclaration); 
	}



    public void createConstructor(String ParamNames [], String ParamType [], MethodDeclaration methodDeclaration, SuperConstructorInvocation superConstructorInvocation,
    		String constructorName, IClassHolder holder, AST ast) {
    	for(int i=0;i<ParamNames.length;i++)
	    {
    		SingleVariableDeclaration param = ast.newSingleVariableDeclaration();
    		String paramName = ParamNames[i];
    		Name paramType = ast.newName(ParamType[i]);
    		param.setName(ast.newSimpleName(paramName));
    		param.setType(ast.newSimpleType(paramType));
    		methodDeclaration.parameters().add(param);
    		superConstructorInvocation.arguments().add(ast.newSimpleName(paramName)); 	
	    }
		
		Block block = ast.newBlock() ;
		SimpleName simpleName = ast.newSimpleName(constructorName);
		methodDeclaration.setName(simpleName); 
		methodDeclaration.setConstructor(true);
		methodDeclaration.setBody(block);
		block.statements().add(superConstructorInvocation);
		holder.addMethod(methodDeclaration); 
    }
	
	public void valueAdded(String basename, boolean collect, String type, FieldDeclaration field,
        MethodDeclaration getmeth, MethodDeclaration setmeth, String descript, IClassHolder holder) {}
		

}


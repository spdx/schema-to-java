package org.spdx.jibx;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.jibx.schema.codegen.ClassHolder;
import org.jibx.schema.codegen.ClassHolderHelper;
import org.jibx.schema.codegen.extend.DefaultNameConverter;

public class SPDXNameConverter extends DefaultNameConverter {
    
	@Override
  	public String toConstantName(String text) {
		
	  if(text.contains("_")){
		  if(text.contains("FILE_TYPE_")){
			  text=text.replace("FILE_TYPE_","");
    	  }
       }
	  
	 
       return text;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

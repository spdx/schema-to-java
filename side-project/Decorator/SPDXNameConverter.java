package org.spdx.jibx;

import org.jibx.schema.codegen.extend.DefaultNameConverter;

public class SPDXNameConverter extends DefaultNameConverter {
	
	@Override
  	public String toConstantName(String text) {
		if(text.startsWith("fileType_"))
			text=text.substring("fileType_".length()); 
		if(text.startsWith("annotationType_"))
	    	text= text.substring("annotationType_".length()); 
 		if(text.startsWith("checksumAlgorithm_"))
			text=text.substring("checksumAlgorithm_".length()); 
        if(text.startsWith("referenceCategory_"))
	    	text= text.substring("referenceCategory_".length()); 
	    if(text.startsWith("relationshipType_"))
		    text= text.substring("relationshipType_".length()); 
		
	   	return super.toConstantName(text);
		  
     }
	
	
}

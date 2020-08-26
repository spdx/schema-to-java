package org.spdx.jibx;

import org.jibx.schema.codegen.extend.DefaultNameConverter;

public class SPDXNameConverter extends DefaultNameConverter {
    
	@Override
  	public String toConstantName(String text) {
		
		 
		  if(text.startsWith("FILE_TYPE_")) 
			  return text.substring("FILE_TYPE_".length()); 
		  if(text.startsWith("ANNOTATION_TYPE_"))
				return text.substring("ANNOTATION_TYPE_".length()); 
		  if(text.startsWith("CHECKSUM_ALGORITHM_"))
				return text.substring("CHECKSUM_ALGORITHM_".length()); 
		  if(text.startsWith("REFERERENCE_CATEGORY_"))
				return text.substring("REFERERENCE_CATEGORY_".length()); 
		  if(text.startsWith("RELATIONSHIP_TYPE_"))
			   return text.substring("RELATIONSHIP_TYPE_".length()); 
		  else
			  return (text);
     }
	
	
}

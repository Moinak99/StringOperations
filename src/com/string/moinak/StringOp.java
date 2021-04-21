package com.string.moinak;

import java.io.BufferedReader;
import java.io.FileReader;

public class StringOp {

	public static void main(String[] args){
		
		StringOperations obj = new StringOperations();		
		try {
			switch (args[0]) 
		      {
		        case "help":
		          obj.HelperMethod();
		          break;
		        case "reverse":
		          obj.ReverseString(args[1]);
		          break;
		        case "uppercase":
		          obj.ConvertToCapitalCase(args[1]);
		          break;
		        case "camelcase":
		          obj.ConvertToCamelCasing(args[1]);
		          break;
		        case "fileupload":
		        {
		        	try {
		        		BufferedReader reader = new BufferedReader(new FileReader(args[1]));
			        	StringBuilder stringBuilder = new StringBuilder();
			        	String line = null;
			        	String ls = System.getProperty("line.separator");
			        	while ((line = reader.readLine()) != null) {
			        		stringBuilder.append(line);
			        		stringBuilder.append(ls);
			        	}
			        	stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			        	reader.close();
			        	String content = stringBuilder.toString();
			        	
			        	if(args[2].contains("reverse"))
			        	{
			  	          obj.ReverseString(content);;

			        	}
			        	else if(args[2].contains("uppercase"))
			        			{
			  	          obj.ConvertToCapitalCase(content);

			        			}
			        	else if(args[2].contains("camelcase")) {
			        		obj.ConvertToCamelCasing(content);
			        	}
		        		
		        	} catch(Exception e) {
		        		System.out.println("Invalid Argument! run \"help\" for suggestions");
		        		}
		        
		        }
		        
		    }
		} catch(Exception e) {System.out.println("Invalid argument! run help to see options");}
		
		  
	}

}

package com.string.moinak;


public class StringOperations {
	
	public void ReverseString(String str)
	{
		StringBuilder sb =new StringBuilder(str);  
		sb.reverse().toString();
		System.out.println(sb);
	}
	
	public void ConvertToCapitalCase(String str) {
		System.out.println(str.toUpperCase());
	}
	
	public void ConvertToCamelCasing(String str) {
		String formattedString = str.trim().toLowerCase();
		String[] files = formattedString.split("\\s+");
		for(int i=1 ; i<files.length ; i++)
		{
			files[i] = files[i].substring(0, 1).toUpperCase() + files[i].substring(1);
		}
		String str1= "";
		
		for(int i=0 ; i<files.length ; i++) {
			str1 = str1+files[i];
		}
		System.out.println(str1);
		
		
	}
	
	public void HelperMethod() {
		String newLine = System.getProperty("line.separator");
		System.out.println("Help Options"+newLine+"1.To Reverse:  java -jar strop.jar reverse \"<string to be converted>\"  [eg- java -jar strop.jar reverse \"Hello World\"]  ");
		System.out.println(newLine+"2.To Convert into Uppercase:  java -jar strop.jar uppercase \"<string to be converted>\" [eg- java -jar strop.jar uppercase \"Hello World\"]  ");
		System.out.println(newLine+"3.To Convert into Camel Case:  java -jar strop.jar camelcase \"<string to be converted >\" [eg- java -jar strop.jar camelcase \"Hello World\"]  ");
		System.out.println(newLine+"To Convert File Contents-"+newLine);
		System.out.println(newLine+"4.To Convert into Camel Case:  java -jar strop.jar fileupload \"<file location along with extension>\" camelcase  [eg- java -jar strop.jar fileupload \"myfile.txt\" camelcase]   ");
		System.out.println(newLine+"5.To Convert into Reverse:  java -jar strop.jar fileupload \"<file location along with extension>\" reverse  [java -jar strop.jar fileupload \"myfile.txt\" reverse]   ");
		System.out.println(newLine+"6.To Convert Upper case:  java -jar strop.jar fileupload \"<file location along with extension>\" uppercase  [java -jar strop.jar fileupload \"myfile.txt\" uppercase]   ");


	}

}

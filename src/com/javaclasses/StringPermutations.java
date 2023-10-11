package com.javaclasses;

public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "CAT";

	    printallpermutes(str,"");
	}

	private static void printallpermutes(String str, String str2) {
		
	     if (str.length() == 0) 
         {
           System.out.print(str2 + " ");
           return;
         }
      
       for (int i = 0; i < str.length(); i++) 
         { 
           char ch = str.charAt(i); 
          System.out.println("str.substring(0, i):::"+str.substring(0, i)+" "
          		+ "str.substring(i + 1):::"+str.substring(i + 1));
          
          System.out.println("i value"+i);
           String str3 = str.substring(0, i) + str.substring(i + 1);
        
           printallpermutes(str3, str2 + ch);
        }
	}

}

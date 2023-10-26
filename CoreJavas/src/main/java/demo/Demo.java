package demo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

class Demo{  
	 static boolean isValidUsername(String username) {
	       
	        if (username.length()<5 || username.length()>10) {
	            return false;
	        }
	        
	       
	        if (!Pattern.compile("[A-Z]").matcher(username).find()) {
	            return false;
	        }	        
	        
	        if (!Pattern.compile("[0-9]").matcher(username).find()) {
	            return false;
	        }	        
	       
	        if (!Pattern.compile("[@#*=]").matcher(username).find()) {
	            return false;
	        }	        
	      
	        if (username.contains(" ")) {
	            return false;
	        }
	        
	        return true;
	    }
	
 
public static void main(String args[]){  
	
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name");
		
		String name = sc.next();
		
		try {
			if (isValidUsername(name)) {
			    System.out.println("PASS");
			} else {
			    System.out.println("FAIL");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
 }  
}  
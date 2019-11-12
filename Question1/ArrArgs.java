package myAssignment.com.Question1;

import java.io.Console;
import java.util.Scanner;

public class ArrArgs {

	public static void main(String[] args) {
		try {
		int r=1;
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a String: ");
	      
	   
	    // Read a line with a prompting message
	    String str = myObj.nextLine();  // Read user input
		
		int p=args.length;  //<<<initialize parameter args in order to capture length of entered string
		p = str.length();
		
	
		for(int x=0;x<p;x++ ) {
		   System.out.println("Value of input is "+x +" and arguments: "+str.substring(x, r));
		   r++;
		};
		} catch(Exception e) {
			System.out.println("Something Went Wrong: "+e.toString());
		}finally {
			System.out.println("Done!!!");
		}
	}

	}



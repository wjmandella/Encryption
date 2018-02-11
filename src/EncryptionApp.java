// My solution to the HackerRank.om problem "Encryption."
// https://www.hackerrank.com/challenges/encryption/problem

import java.util.Scanner;

public class EncryptionApp {
    static String encryption(String s) {
     
    	String result = "";
    	int rows = (int) Math.floor(Math.sqrt(s.length()));
      	int cols = (int) Math.ceil(Math.sqrt(s.length()));
      	
      	System.out.println("rows = "+ rows+", cols = "+cols+", s length = "+ s.length());
      	if( rows * cols < s.length()) {
      		rows++;
      	}	
      		
      	if( rows * cols > s.length()) {
      		int diff = ((rows*cols) - s.length());
      		for(int idx1 = 0; idx1 <= diff; idx1++) {
      			s += " ";
      		}
      	}
      	System.out.println("rows = "+ rows+", cols = "+cols+", s length = "+ s.length());
      	
  		for(int idx3 = 0; idx3 < cols; idx3++) {
  			for(int idx2 = 0; idx2 < rows; idx2++) {
  				if(s.charAt(cols*idx2 + idx3) == ' ') {
  					continue;
  				} else {  					
        		result += s.charAt(cols*idx2 + idx3);
  				}
      		}
      		result += " "; 
      	} 
      	
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Enter a string (no spaces) having a maximum length of 81 characters: ");
        String s = in.next();
        String result = encryption(s);
        System.out.println(result);
        in.close();
    }
}

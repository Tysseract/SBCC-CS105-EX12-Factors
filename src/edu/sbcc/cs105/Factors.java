/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: Factors
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */

package edu.sbcc.cs105;

import java.util.Scanner;

public class Factors {
	
	public static boolean isPrime(long n) {
	    if(n < 0)return false;
		for(long i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static String findFactors(long number) {
		//long[] factors = new long[] {};
		String factorsStr = "";
		
		if(number < 0) {
			factorsStr = "(-1) ";
			number = number / -1;
			System.out.println("Fac: (-1) Rem: " + number);
		}
		for(long i=2; i<=number; i++) {
			//if(isPrime(i)) {
				while(number % i == 0) {
					
					number = number / i;
					factorsStr = factorsStr + i + " ";
					System.out.println("Fac: " + i + " " + "Rem: " + number);
					//factors[factors.length + 1] = i;
				}
			//}
		}
		
		/*
		
		for(long currentFactor : factors) {
			factorsStr = factorsStr + currentFactor + " ";
		}
		*/
		System.out.println("");
		return factorsStr;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number greater than 2: ");
		try {
			System.out.print(findFactors(in.nextLong()));
		}
		catch(java.util.InputMismatchException e) {
			  System.out.println("Entered values must be within the range of long (integer less than 9 223 372 036 854 775 807)");
		}
		in.close();
	}
}

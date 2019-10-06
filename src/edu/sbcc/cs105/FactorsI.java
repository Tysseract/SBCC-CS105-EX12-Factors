/**
 * CS 105 Theory & Practice
 * CRN: [a number]
 * Assignment: Factors
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [Isabelle Marchand]
 */
package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(findFactors(in.nextInt()));
		in.close();
	}

	public static String findFactors(int number) {
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < number / 2; i++) {
			while (number % i == 0) {
				sb.append(i);
				sb.append(" ");
				number /= i;
			}
		}
		if(number !=0 && number !=1) {
			sb.append(number);
			sb.append(" ");
		}
		return sb.toString();

	}
}
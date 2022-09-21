package Samples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
	/*	String str = "Mom", reverseStr="";
		int strLength = str.length();
		for(int i = (strLength - 1); i>=0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a palindrome");
			
		}
		else {
			System.out.println(str + " is not a palindrome");
		} */
		
	/*	String str, reverseStr="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String: ");
		str = in.nextLine();
		int strLength = str.length();
		for(int i = (strLength - 1); i>=0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a palindrome");
			
		}
		else {
			System.out.println(str + " is not a palindrome");
		}*/
		
		
		String str, reverse = "";
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int length = str.length();
		
		for(int i = length - 1; i>=0; i--)
			reverse = reverse + str.charAt(i);
		if(str.equals(reverse))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
		
	} 
}

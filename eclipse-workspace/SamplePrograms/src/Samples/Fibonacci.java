package Samples;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		/*int num1=0, num2=1, num3, count=10, i;
		System.out.print(num1+" "+num2);
		for(i=1;i<=count;++i)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}*/
		
		int n1=0,n2=1,n3,count,i;
		
		System.out.println("Enter a number: ");
		Scanner in= new Scanner(System.in);
		count = in.nextInt();
		System.out.print(n1 + " " + n2);
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}
}
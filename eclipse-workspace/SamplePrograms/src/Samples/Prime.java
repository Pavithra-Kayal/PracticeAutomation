package Samples;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		/*int n=16, flag=0,i;
		int temp=n/2;
		if(n==0||n==1)
		{
			System.out.println(n + " is not a prime number");
		}
		else
		{
			for(i=2; i<=temp;i++)
			{
				if(n%i==0)
				{
					System.out.println(n + " is not a prime number");
					flag=1;
					break;
				}
				if(flag==0)
					System.out.println(n + " is a prime number");
					
			}
		}*/
		
		int n, count =0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n==0 || n==1)
			System.out.println(n + " is not a prime number");
		else
		{
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
				
			}
	}
		
}



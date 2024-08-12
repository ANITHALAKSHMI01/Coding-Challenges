package com.chainsys.codingchallenge;
import java.util.Scanner;
public class PrimeNo 
{
	public static void main(String[] args)
	{
		int flag=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=scanner.nextInt();
		if(num==0 || num==1)
		{
			System.out.println(num+" Not a prime");
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" Not a prime");
					flag=1;
					break;
				}
			}
			if(flag==0) 
				System.out.println(num+" is prime number");
			scanner.close();
		}
	}  
}


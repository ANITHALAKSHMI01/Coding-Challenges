package com.chainsys.codingchallenge;
import java.util.Scanner;
public class ArrayDivisible
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the starting value");
		int s=scanner.nextInt();
		System.out.println("Enter the ending value");
		int e=scanner.nextInt();
		for(int i=s;i<=e;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
}

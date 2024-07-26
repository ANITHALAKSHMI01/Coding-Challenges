package com.chainsys.codingchallenge;
import java.util.Scanner;
public class NumberReverse
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		System.out.println(num+" after reverse "+NumberReverse.reverse(num));
		scanner.close();
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
}

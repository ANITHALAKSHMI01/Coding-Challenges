package com.chainsys.codingchallenge;
import java.util.Scanner;
public class ConvertIntToString
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<=100 && n>=-100)
		{
			System.out.println("Good job");
		}
		else
		{
			System.out.println("Wrong answer");
		}
		scan.close();
	}
}

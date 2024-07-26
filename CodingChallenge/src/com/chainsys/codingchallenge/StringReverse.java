package com.chainsys.codingchallenge;
import java.io.*;
import java.util.*;
public class StringReverse
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		char[] array=A.toCharArray();
		String reversedString="";
		for(int i=array.length-1;i>=0;i--)
		{
			reversedString+=array[i];
		}
		if(A.equals(reversedString))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}

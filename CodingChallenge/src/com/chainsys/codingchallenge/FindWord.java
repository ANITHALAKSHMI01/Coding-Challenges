package com.chainsys.codingchallenge;
import java.util.Scanner;
public class FindWord 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.nextLine();
		System.out.println("Enter the word to find");
		String str1=scanner.next();
		System.out.println(FindWord.findWord(str, str1));
		scanner.close();
	}
	public static String findWord(String str,String str1)
	{
		if(str.contains(str1))
			return str1;
		else
			return "Can't found.";
	}
}

package com.chainsys.codingchallenge;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ReadEndOfFile 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		for(int i=1;scanner.hasNext()==true;i++)
		{
			System.out.println(i+" "+scanner.nextLine());
		}
	}
}

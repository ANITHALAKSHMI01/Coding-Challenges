package com.chainsys.codingchallenge;
import java.util.Scanner;
public class GetSmallestAndLargest
{
	public static String getSmallestAndLargest(String s, int k) 
	{
		String smallest = "";
		String largest = "";
		smallest=largest=s.substring(0, k);
		for(int i=1;i<s.length()-k+1;i++)
		{
			String subStr=s.substring(i, i+k);
			if(smallest.compareTo(subStr)>0)
			{
				smallest=subStr;
			}
			if(largest.compareTo(subStr)<0)
			{
				largest=subStr;
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		System.out.println(getSmallestAndLargest(s, k));
		scan.close();
	}
}


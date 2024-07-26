package com.chainsys.codingchallenge;
import java.util.Scanner;
public class Anagrams 
{
	static boolean isAnagram(String a, String b) 
	{
		char[] array=a.toLowerCase().toCharArray();
		char[] array1=b.toLowerCase().toCharArray();
		char[] sortedArray=Anagrams.sort(array);
		char[] sortedArray1=Anagrams.sort(array1);
		String str1=new String(sortedArray);
		String str2=new String(sortedArray1);
		if(str1.equals(str2))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	public static char[] sort(char[] array)
	{
		char temp=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean result = isAnagram(a, b);
		System.out.println( (result) ? "Anagrams" : "Not Anagrams" );
	}
}

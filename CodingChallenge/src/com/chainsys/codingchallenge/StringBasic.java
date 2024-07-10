package com.chainsys.codingchallenge;
import java.util.*;
public class StringBasic
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		String upperA=(A.substring(0,1)).toUpperCase();
		String upperB=(B.substring(0,1)).toUpperCase();
		String outA=upperA+A.substring(1,A.length());
		String outB=upperB+B.substring(1,B.length());
		if(outA.compareTo(outB)<0)
		{
			System.out.println("No");
		}
		else if(outA.compareTo(outB)==0)
        {
            System.out.println("No");
        }
		else
		{
			System.out.println("Yes");
		}
		System.out.println(outA+" "+outB);
		sc.close();
	}  
}

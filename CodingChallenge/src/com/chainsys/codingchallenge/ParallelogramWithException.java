package com.chainsys.codingchallenge;
import java.io.*;
import java.util.*;
public class ParallelogramWithException 
{
	static int B,H;
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		B=scan.nextInt();
		H=scan.nextInt();
		if(B>0 && H>0)
		{
			int area=B*H;
			System.out.println(area);
		}
		if(B<=0 || H<=0)
		{
			try
			{
				throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
		}
	}
}

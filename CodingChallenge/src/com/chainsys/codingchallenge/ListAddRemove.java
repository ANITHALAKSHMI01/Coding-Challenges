package com.chainsys.codingchallenge;
import java.io.*;
import java.util.*;
public class ListAddRemove
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		List<Integer> a1=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			a1.add(scanner.nextInt());
		}
		int number=scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<number;i++)
		{
			//    String query=scanner.next();
			switch(scanner.next())
			{
			case "Insert": a1.add(scanner.nextInt(),scanner.nextInt());
			break;
			case "Delete": a1.remove(scanner.nextInt());
			break;
			}
		}
		for(Integer element: a1)
		{
			System.out.print(element+" ");
		}
	}
}

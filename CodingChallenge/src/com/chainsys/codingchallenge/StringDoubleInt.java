/*Input Format
There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.*/

package com.chainsys.codingchallenge;
import java.util.Scanner;
public class StringDoubleInt 
{
	    public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d=scan.nextDouble();
	        String s=scan.next();

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }
}

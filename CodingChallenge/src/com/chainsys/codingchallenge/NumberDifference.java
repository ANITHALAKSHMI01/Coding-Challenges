package com.chainsys.codingchallenge;
public class NumberDifference {
	public static void main(String[] args) {
		NumberDifference difference=new NumberDifference();
		difference.diff21(40);
	}
	public int diff21(int n) {
		int difference = 0;
		if (n >= 21) {
			difference = n - 21;
			difference = difference * 2;
		} else {
			difference = 21 - n;
		}
		return difference;
	}
}
//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0
package com.chainsys.codingchallenge;
public class SumDouble {
	public static void main(String[] args) {
		SumDouble sum=new SumDouble();
		sum.sumDouble(3, 5);
	}
	public int sumDouble(int a, int b) {
		int sum = a + b;
		if (a == b) {
			sum = sum * 2;
		}
		return sum;
	}
}
//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//sumDouble(1, 2) → 3
//sumDouble(3, 2) → 5
//sumDouble(2, 2) → 8
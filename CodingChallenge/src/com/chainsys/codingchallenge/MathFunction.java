package com.chainsys.codingchallenge;
public class MathFunction {
	public static void main(String[] args) {
		MathFunction math=new MathFunction();
		math.nearHundred(98);
		math.posNeg(-1, 5, false);
	}
	public boolean nearHundred(int n) {
		if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
			return true;
		}
		return false;
	}
	public boolean posNeg(int a, int b, boolean negative) {
		if(negative)
			return a<0 && b<0;
		return ((a<0 && b>0) || (a>0 && b<0) );
	}
}
//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false

//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
//posNeg(1, -1, false) → true
//posNeg(-1, 1, false) → true
//posNeg(-4, -5, true) → true
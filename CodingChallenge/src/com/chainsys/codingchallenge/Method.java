package com.chainsys.codingchallenge;
public class Method {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}
		return false;
	}
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile || (!aSmile && !bSmile)) {
			return true;
		}
		return false;
	}
	public boolean parrotTrouble(boolean talking, int hour) {
		if((talking && hour<7) || (talking && hour>20))
		{
			return true;
		}
		return false;
	}
	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Method method = new Method();
		method.sleepIn(false, true);
		method.monkeyTrouble(false, true);
		method.parrotTrouble(false, 12);
		method.makes10(12, 10);
	}
}
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//monkeyTrouble(true, true) → true
//monkeyTrouble(false, false) → true
//monkeyTrouble(true, false) → false


//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//parrotTrouble(true, 6) → true
//parrotTrouble(true, 7) → false
//parrotTrouble(false, 6) → false


//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//makes10(9, 10) → true
//makes10(9, 9) → false
//makes10(1, 9) → true
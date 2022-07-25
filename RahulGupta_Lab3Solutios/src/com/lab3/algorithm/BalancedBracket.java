package com.lab3.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	public static boolean checkBracketBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char character = expression.charAt(i);

			if (character == '(' || character == '{' || character == '[') {
				stack.push(character);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char c;
			switch (character) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '{' || c == '(')
					return false;
				break;

			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Please enter the Brackets as per your convinence to Check Algorithm from following shown below \n [ / ] / { / } / ( / )");
		String brackets = sc.nextLine();
		if(checkBracketBalanced(brackets.trim())==true) {
		System.out.println("The entered String has Balanced Brackets");	
		}
		else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
		sc.close();
	}

}

package com.github.ludmylla.jobrotation;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		
		TestTwo testTwo = new TestTwo();
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.println("Inform a number: ");
		int number = sc.nextInt();
		
		while(number > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		
		
		testTwo.checkIfTheNumberIsPartOfTheFibonacci(number, n3, n1);
	
	}
	
	
	private void checkIfTheNumberIsPartOfTheFibonacci(int number, int aux, int n1) {
		
		if(number == 0) {
			System.out.println("Next number: 1");
		}
		if(number == aux) {
			System.out.println("The number: " + number + " is in the sequence, next number: " + (n1 + number ));
		}else {
			System.out.println("The number is not part of the fibonacci sequence.");
		}

	}

}
package com.coding;

public class FizzBuzz {
	public static void main(String[] args) {
		int num = 1;
		
		do {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			}  else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(num);
			} num ++;	
			} while(num <= 100);
		}
	}

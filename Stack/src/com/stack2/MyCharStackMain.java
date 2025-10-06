package com.stack2;

import java.util.Scanner;

public class MyCharStackMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();

		int len = str.length();

		MyCharStack s = new MyCharStack(len);

		// push
		for (int i = 0; i < len; i++) {
			s.push(str.charAt(i));
		}

		// display
		System.out.println("Displaying data...");
		s.display();

		System.out.println("Deleting data...");
		// pop
		for (int i = 0; i < len; i++) {
			
			System.out.print(s.pop());
		}

		System.out.println("\nDisplaying data...");
		s.display();

		sc.close();

	}

}

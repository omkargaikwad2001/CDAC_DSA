package com.stackLLChar;

import java.util.Scanner;

public class StackCharLLMain {

	public static void main(String[] args) {
		
		StackCharLL s = new StackCharLL();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to reverse");
		String str = sc.nextLine();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			s.push(str.charAt(i));
			
		}
		
		
		s.display();

	}

}

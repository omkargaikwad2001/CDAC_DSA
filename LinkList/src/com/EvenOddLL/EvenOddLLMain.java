package com.EvenOddLL;

public class EvenOddLLMain {

	public static void main(String[] args) {
		
		EvenOddLL l = new EvenOddLL();
		
		System.out.println("Original LL");
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		l.display();
		
		System.out.println("\nEven LL");
		EvenOddLL even = l.createEvenLL();
		even.display();
		
		System.out.println("\nOdd LL");
		EvenOddLL odd = l.createOddLL();
		odd.display();
	}

}

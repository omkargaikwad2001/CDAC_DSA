package com.singlyLLChar;

public class LLCharMain {

	public static void main(String[] args) {
		
		MyCharLL l = new MyCharLL();
		
		for(char ch = 'A';ch<='Z';ch++) {
			l.addAtEndAuto(ch);
		}
		
		l.display();
		
	}

}

package com.InfixToPostfix;

import java.util.Scanner;

public class InfixToPostfixMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();
        sc.close();
        
        MyStack s = new MyStack(infix);
        String postfix = s.infix_postfix(infix);

        if (!postfix.isEmpty())
            System.out.println("Postfix Expression: " + postfix);
    }
}

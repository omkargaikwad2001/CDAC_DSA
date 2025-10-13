package com.InfixToPrefix;

import java.util.Scanner;

public class InfixToPrefixMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();
        sc.close();

        MyStack s = new MyStack(infix);  // pass infix to constructor
        String prefix = s.infix_prefix(infix);

        if (!prefix.isEmpty())
            System.out.println("Prefix Expression: " + prefix);
    }
}

package com.validparentheses;

import java.util.Scanner;

public class ParenthesesMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String str = sc.nextLine();
        MyStack s = new MyStack(str.length());

        boolean isValid = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // push opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            // check closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    isValid = false;
                    break;
                }

                char top = s.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    isValid = false;
                    break;
                }
            }
        }

        // final check
        if (!s.isEmpty()) {
            isValid = false;
        }

        if (isValid)
            System.out.println("Valid Parentheses");
        else
            System.out.println("Invalid Parentheses.");

        sc.close();
    }
}

package com.InfixToPrefix;

public class MyStack {
	
	private int size;
    private int top;
    private char stk[];
    
    public MyStack(String infix) {
        this.size = infix.length();
        top = -1;
        stk = new char[this.size];
    }
    
    public boolean isFull() {
        return top == size - 1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void Push(char value) {
        if (!isFull()) {
            stk[++top] = value;
        } else {
            System.out.println("Stack Overflow!");
        }
    }
    
    public char Pop() {
        if (!isEmpty()) {
            return stk[top--];
        } else {
            return '\0';
        }
    }
    
    public char peek() {
        if (!isEmpty()) {
            return stk[top];
        }
        return '\0';
    }
    
    public boolean isOperand(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || Character.isDigit(ch);
    }
    
    public boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^' || ch == '$';
    }
    
    public int priority(char ch) {
        switch (ch) {
            case '$':
            case '^': return 3;
            case '*':
            case '/':
            case '%': return 2;
            case '+':
            case '-': return 1;
        }
        return -1;
    }
    
    public String infix_prefix(String infix) {
        String prefix = "";  // to build the output

        // Step 1: traverse from right to left (reverse order)
        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);

            if (isOperand(ch)) {
                prefix += ch;
            } 
            else if (ch == ')') {
                Push(ch);
            } 
            else if (ch == '(') {
                while (!isEmpty() && peek() != ')') {
                    prefix += Pop();
                }
                if (!isEmpty() && peek() == ')') {
                    Pop(); // remove ')'
                } else {
                    System.out.println("Invalid Expression: Missing ')'");
                    return "";
                }
            } 
            else if (isOperator(ch)) {
                while (!isEmpty() && priority(peek()) > priority(ch) && peek() != ')') {
                    prefix += Pop();
                }
                Push(ch);
            } 
            else {
                System.out.println("Invalid character: " + ch);
                return "";
            }
        }

        // Step 2: Pop remaining operators
        while (!isEmpty()) {
            char ch = Pop();
            if (ch == '(' || ch == ')') {
                System.out.println("Invalid Expression: Unmatched parentheses");
                return "";
            }
            prefix += ch;
        }

        // Step 3: Reverse the result string
        prefix = new StringBuilder(prefix).reverse().toString();

        return prefix;
    }


}

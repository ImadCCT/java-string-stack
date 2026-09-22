/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Stack {

    // Inner Stack class
    static class Stack1 {
        private String[] arr;
        private int top;
        private int capacity;

        public Stack1(int size) {
            arr = new String[size];
            capacity = size;
            top = -1;
        }

        public void push(String x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
//            System.out.println(x + " pushed to stack.");
        }

        public String pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return null;
                
            }
            return arr[top--];
        }

        public String peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return null;
                
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Stack elements: ");
            
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack1 stack = new Stack1(size);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    String val = sc.next();
                    stack.push(val);
                    break;
                    
        
                case 2:
                    String popped = stack.pop();
                    if (popped != null){
                        System.out.println("popped " + popped);
                    }
                    break;
                    
                case 3:
                    String top = stack.peek();
                    if (top!= null){
                        System.out.println("top element: " + top);
                    }
                    break;
                    
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

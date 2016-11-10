package Day4;

import java.util.Scanner;

/**
 * Created by Deepti on 11/8/2016.
 */
public class Calculator {
    public static void main(String args[]) {
        int a = 0, b = 0;
        char op = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = input.nextInt();
        System.out.println("Enter the value of b: ");
        b = input.nextInt();
        System.out.println("Enter the operator: ");
        op = input.next().charAt(0);
        switch (op) {
            case '+':
                int add = a + b;
                System.out.println(String.format("The value is: %d", add));
                break;
            case '-':
                int sub = a - b;
                System.out.println(String.format("The value is: %d", sub));
                break;
            case '*':
                int mul = a * b;
                System.out.println(String.format("The value is: %d", mul));
                break;
            case '/':
                int div = a - b;
                System.out.println(String.format("The value is: %d", div));
                break;
            default:
                System.out.println(String.format("It is an invalid operator"));
                break;

        }
    }
}

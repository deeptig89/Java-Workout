package Day2;

import java.util.Scanner;

/**
 * Created by Deepti on 11/4/2016.
 */
public class UserInput {
    public static void main(String[] args) {
        int i;
        int output;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value \n");
        i = input.nextInt();
        output = i<<1;

        System.out.println("The value of i* 2  is " + output);

    }
}

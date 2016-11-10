package Day4;

import java.util.Scanner;

/**
 * Created by Deepti on 11/10/2016.
 */
public class MaxValue {
    public static void main(String args[])
    {
        int x =0; int y =0; int z = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = input.nextInt();
        System.out.println("Enter the value of y: ");
        y = input.nextInt();
        System.out.println("Enter the value of z: ");
        z = input.nextInt();

       /* if( x >  y)
        {
            if(x > z) {
                System.out.println("The maximum value :" +x);
            }
            else
                System.out.println("The maximum value is:" +z);


        }
        else if(y>x)
        {
            if(y>z) {

                System.out.println("The maximum value is:" +y);
            }
            else {
                System.out.println("The maximum value is: " + z);
            }
            } */
        int maximum = Math.max(x,Math.max(y,z));
        System.out.println("The maximum value is:" + maximum);

    }
}

/**
 * Created by Deepti on 11/3/2016.
 */
package Day2;

public class Variables {
    public static void main(String args[])
    {
        int i = 12345678;
        byte b =  100;
        boolean bl = true;
        char c = 'a';
        double d = 345.0;
        float f = 25.0f;
        long l = 678957884;
        short s =  10000;

        System.out.println("The value of int i is :" +i+ " and the size the value takes in bytes :" + Integer.SIZE/8 + "The maximum value of int is:" + Integer.MAX_VALUE);
        System.out.println("The value of byte b is: " +b+ "and the size the value takes in bytes :" + Byte.SIZE/8 + "The maximum value of byte is:" + Byte.MAX_VALUE);
        System.out.println("The value of boolean bl is: " +bl+ "and the size the value takes in bytes :" + 2 + "The maximum value of boolean is:" +2);
        System.out.println("The value of char c is: " +c+ "and the size the value takes in bytes :" + Character.SIZE/8 + "The maximum value of Char is:" + Character.MAX_VALUE);
        System.out.println("The value of double d is: " +d+ "and the size the value takes in bytes :" + Double.SIZE/8 + "The maximum value of double is:" + Double.MAX_VALUE);
        System.out.println("The value of float f is: " +f+ "and the size the value takes in bytes :" + Float.SIZE/8 + "The maximum value of float is:" + Float.MAX_VALUE);
        System.out.println("The value of long l is: " +l+ "and the size the value takes in bytes :" + Long.SIZE/8 + "The maximum value of long is:" + Long.MAX_VALUE);
        System.out.println("The value of short s is: " +s+ "and the size the value takes in bytes :" + Short.SIZE/8 + "The maximum value of short is:" + Short.MAX_VALUE);

    }
}

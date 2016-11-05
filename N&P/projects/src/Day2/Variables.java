/**
 * Created by Deepti on 11/3/2016.
 */
package Day2;

public class Variables {
    public static void main(String args[])
    {
        int i= 2147483647; /* Int data type is a 32-bit signed two's complement integer. */
        byte b =  100; /*Byte data type is an 8-bit signed two's complement integer*/
        boolean bl = true; /*boolean data type represents one bit of information*/
        char c = 'a';  /*char data type is a single 16-bit Unicode character*/
        double d = 345.0; /* double data type is a double-precision 64-bit IEEE 754 floating point */
        float f = 25.0f; /* Float data type is a single-precision 32-bit IEEE 754 floating point */
        long l = 678957884; /*Long data type is a 64-bit signed two's complement integer */
        short s =  10000; /*Short data type is a 16-bit signed two's complement integer*/

        System.out.println("The value of int i is :" +i+ " and the size the value takes in bytes :" + Integer.SIZE/8 + "The maximum value of int is:" + Integer.MAX_VALUE);
        System.out.println("The value of byte b is: " +b+ "and the size the value takes in bytes :" + Byte.SIZE/8 + "The maximum value of byte is:" + Byte.MAX_VALUE);
        System.out.println("The value of boolean bl is: " +bl+ "and the size the value takes in bytes :" + 2 + "The maximum value of boolean is:" +2);
        System.out.println("The value of char c is: " +c+ "and the size the value takes in bytes :" + Character.SIZE/8 + "The maximum value of Char is:" + Character.MAX_VALUE);
        System.out.println("The value of double d is: " +d+ "and the size the value takes in bytes :" + Double.SIZE/8 + "The maximum value of double is:" + Double.MAX_VALUE);
        System.out.println("The value of float f is: " +f+ "and the size the value takes in bytes :" + Float.SIZE/8 + "The maximum value of float is:" + Float.MAX_VALUE);
        System.out.println("The value of long l is: " +l+ "and the size the value takes in bytes :" + Long.SIZE/8 + "The maximum value of long is:" + Long.MAX_VALUE);
        System.out.println("The value of short s is: " +s+ "and the size the value takes in bytes :" + Short.SIZE/8 + "The maximum value of short is:" + Short.MAX_VALUE);
        int test = Integer.MAX_VALUE;
        test++;
        System.out.println(test);
    }
}

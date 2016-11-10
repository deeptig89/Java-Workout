package Day4;

/**
 * Created by Deepti on 11/8/2016.
 */
public class TypeCasting {
    public static void main(String args[])
    {
        int i= 83647; /* Int data type is a 32-bit signed two's complement integer. */
        byte b =  100; /*Byte data type is an 8-bit signed two's complement integer*/
        boolean bl = true; /*boolean data type represents one bit of information*/
        char c = 'a';  /*char data type is a single 16-bit Unicode character*/
        double d = 345.0; /* double data type is a double-precision 64-bit IEEE 754 floating point */
        float f = 25.0f; /* Float data type is a single-precision 32-bit IEEE 754 floating point */
        long l = 6789; /*Long data type is a 64-bit signed two's complement integer */
        short s =  10000; /*Short data type is a 16-bit signed two's complement integer*/

        int i1 = s;
        int i2 = b;
        int i3 = (int)l;
        long l1 = i;
        long l2 = s;
        long l3 = b;
        short s1 = (short)i;
        short s2 = b;
        short s3 = (short)l;
       // byte b2 = c;
       // byte b3 = i;
       // byte b4 = l;
       // byte b5 = s;
        double d1 = f;
        double d2 = i;
        double d3 = l;
        double d4 = s;
        //boolean bl2 = c;
        //char c1 = b;
        float f1 = s;
        float f2= i;
        float f3 = l;
        /*When higher data type is being converted to lower data type, an error
            pops up saying it's an incompatible type and suggests what should be given. */

        System.out.println(String.format("The value of i1,i2 are: %d,%d,%d", i1,i2,i3));
        System.out.println(String.format("The value of l1,l2,l3 are : %d,%d,%d", l1,l2,l3));
        System.out.println(String.format("The values of s,s2,s3 are : %d,%d,%d", s1,s2,s3));
        //System.out.println(String.format("The values of d1,d2,d3,d4 are: %d,%d,%d,%d", d1,d2,d3,d4));
        // System.out.println(String.format("The values of f1,f2,f3 are: %d,%d,%d,%d", f1,f2,f3));

    }
}

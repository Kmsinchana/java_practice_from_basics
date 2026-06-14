public class _2_PrimitiveDataTypes {
    public static void main(String [] args){
        //all decimal value will get stored double so the below code will be compilation error because 10.5 is double
        //float f1 = 10.5;
        //correct way
        float f1 = 10.5f; //to tell compiler explicitly that the literal is of type float not double
        System.out.println(f1);

        byte b1 = 37;//(byte range from -128 to 127)
        //compilation error
        //byte b2 =300;
        System.out.println(b1);

        long l = 10+30; //40 is int expression but fits into long
        System.out.println(l);

        //compilation error
        //long i = 10000000000; //integer literal are treated as int and exceeds int range
        long i = 10000000000L; //L is added because to specify that the integer literal is type of long and not as a int
        System.out.println(i);

        float f2 = 10/4;
        //output is 2.0 because
        //10 and 4 are treated as int the result will be assigned to float
        System.out.println(f2);

        float f3 = 10/4f;
        //now the o/p will be 2.5 4f wil
        // l make floating point division
        System.out.println(f3);

        byte bb = (byte)130; //all the integer literal are treated as integer so we need to use byte there is no b or s for short
// o/p will be -126(-128+3(overflow value from 127))
        System.out.println(bb);
        //implicit type conversion
        int in = 10;
        double d = in; //implicit type casting
        System.out.println(d);

        //explicit type
        double dob = 10.8;
        int b =(int) dob; //loss of data will happen
        System.out.println(b);

        //conversion from boolean to any data type is not possible
        //boolean bol = true;
         //int bolint = bol;

        char c ='A'; //stored as unicode value
        int ca = c;
        System.out.println(ca);

        byte s = 127;
//        o/p will be -128 max negative value
        s++;
        System.out.println(s);

        int s1 = 130;
        byte t = (byte)s1;
        System.out.println(t);

        int x = 1_12_234;
//        underscores  will be neglected java 7 feature
        System.out.println(x);

        int def;
//        local variable need to be initialized first
//        below code will result in the compilation error
//        System.out.println(def);

        long originalLong = 123456789123456789L;
        float convertedFloat = originalLong; // Implicit conversion allowed
        long backToLong = (long) convertedFloat; //explicit conversion
//        there is loss of data because of precise of float data type
        System.out.println(originalLong); // Outputs: 123456789123456789
        System.out.println(convertedFloat);
        System.out.println(backToLong);   // Outputs: 123456790519087104

//        In Java, arithmetic operations on byte, short, and char are promoted to int.
        byte byte1 = 20;
        byte byte2 = 30;
//        if we doesn't cast this to byte we get the compilation error
        byte finalAns =(byte) (byte1+byte2);
        System.out.println(finalAns);
//       but byte1++ will work because it will do implicit casting internally (b = (byte)(b + 1))
        byte1++;
        System.out.println(byte1);

        char c1 = 'a';
        char c2 = 'b';
        char finalChar =(char) (c1+c2);
        System.out.println(finalChar);

//        one trick question
        int x1 = 5;
        System.out.println(x1++); //after this statement x will become 6
        x1 = x1++ + ++x1;
//        x1= 6+8 (x++ will make x as 7 ++x will make x as 8)
        System.out.println(x1); //value will be 14
    }
}

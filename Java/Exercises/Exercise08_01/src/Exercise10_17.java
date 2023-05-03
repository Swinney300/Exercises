/*
(Square numbers) 

Find the first ten square numbers that are greater than Long.MAX_VALUE. A square number is a number in the form of n^2. For example, 
4, 9, and 16 are square numbers. Find an efficient approach to run your program fast. 

Sample Run
The ten numbers are
9223372037000250000
9223372043074251001
9223372049148252004
9223372055222253009
9223372061296254016
9223372067370255025
9223372073444256036
9223372079518257049
9223372085592258064
9223372091666259081

 */

import java.math.*;

public class Exercise10_17 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger(Long.MAX_VALUE + "");
        Squares(a);

    }

    public static void Squares(BigInteger a) {

        BigInteger maxValue = a.sqrt();
        BigInteger square = new BigInteger("0");

        System.out.println("The ten number are");
        for (int i = 1; i <= 10; i++) {
            square = maxValue.add(BigInteger.valueOf(i));

            System.out.println(square.pow(2));
        }

    }
}

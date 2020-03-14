package HackerRank.Java.Introduction;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: Java Datatypes
 *
 * link : https://www.hackerrank.com/challenges/java-datatypes/problem
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class JavaDatatypes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        byte byteMinValue =  Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;

        int t = in.nextInt();
        long n  ;
        String str, input;

        while (t-- > 0){
            str = "";
            input  = in.nextString();

           try{
               n = Long.parseLong(input) ;
               if(byteMinValue <= n && byteMaxValue >= n)
                       str += "* byte" + "\n";

               if(shortMinValue <= n && shortMaxValue >= n)
                   str += "* short" + "\n";

               if(intMinValue <= n && intMaxValue >= n)
                   str += "* int" + "\n";

               if(longMinValue <= n && longMaxValue >= n)
                   str += "* long";

               out.println(n + " can be fitted in:\n" + str);
           }
            catch (NumberFormatException e ) {
                out.println(input + " can't be fitted anywhere.");
            }

        }
    }
}

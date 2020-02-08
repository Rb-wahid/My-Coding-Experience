package HackerEarth.Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Micro and Even Numbers
 *
 *link : https://www.hackerearth.com/practice/math/combinatorics/basics-of-combinatorics/practice-problems/algorithm/micro-and-even-numbers/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class MicroAndEvenNumbers {

    BigInteger factorial(int num){
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= num ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    BigInteger permutation(int N,int R){
        return factorial(N).divide(factorial(R).multiply(factorial(N-R)));
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int length = in.nextInt();
        int k = in.nextInt();
        int value ;
        int evenNum = 0;
        for (int i = 0; i < length; i++) {
            value = in.nextInt();
            if ((value & 1) != 1)
                evenNum++;
        }
        out.println(permutation(evenNum, k));
    }
}

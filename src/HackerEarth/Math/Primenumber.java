package HackerEarth.Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Prime number
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/prime-number-6/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;
import java.util.Scanner;

public class Primenumber {
    boolean isPrime(long num){
        BigInteger a = new BigInteger(String.valueOf(num));

        return a.isProbablePrime(5);
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Scanner scanner = new Scanner(System.in);
        int t = in.nextInt();

        while (t-->0){
            long num = in.nextLong();
            if (isPrime(num))
                out.println("prime");
            else
                out.println("composite");

        }




    }
}

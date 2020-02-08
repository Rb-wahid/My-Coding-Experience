package Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: The Confused Monk
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/the-confused-monk/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TheConfusedMonk {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int N = in.nextInt();
        int[] arr = new int[N];
        BigInteger  m = new BigInteger("1000000007");

        for (int i = 0; i < N; i++){
            arr[i] = in.nextInt();

        }



        BigInteger bigGcd = new BigInteger(String.valueOf(arr[0]));
        BigInteger bigF = new BigInteger(String.valueOf(arr[0]));
        for (int i = 1; i < N; i++){
           bigGcd = bigGcd.gcd(new BigInteger(String.valueOf(arr[i])));
            bigF = bigF.multiply(new BigInteger(String.valueOf(arr[i])));
        }


        out.println(bigF.modPow(bigGcd, m).mod(m));
    }
}

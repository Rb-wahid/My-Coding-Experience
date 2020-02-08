package HackerEarth.Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Number of Primes
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-2/practice-problems/algorithm/number-of-primes/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberofPrimes {

    int sieve(int N) {
        int count = 0;
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i * i <= N; ++i) {
            if(isPrime[i] == true) {
                count+=2;
                for(int j = i * i; j <= N ;j += i)
                    isPrime[j] = false;
            }
        }
        return count;
    }

    public void solve(long testNumber, InputReader in, OutputWriter out) {
        int v = in.nextInt();
        out.println(sieve(v));
    }
}

package HackerEarth.Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Mogu Loves Numbers
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/hell-1/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoguLovesNumbers {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            int low = in.nextInt();
            int high = in.nextInt();
            BigInteger ans ;
            int count = 0;
            for (int i = low; i <= high ; i++) {
                ans = new BigInteger(String.valueOf(i));
                if (ans.isProbablePrime(1))
                    count++;

            }
            out.println(count);

        }
    }
}

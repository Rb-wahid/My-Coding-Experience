package HackerEarth.Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: ZrZr
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-2/practice-problems/algorithm/zrzr/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ZrZr {
    long zeroInFact(long num){
        long result = 0;
        for (long i = 5; num/i >= 1 ; i *=5) {
            result += num/i;
        }
        return result;
    }


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while(t-->0){
            long num = in.nextLong();
            out.println(zeroInFact(num));

        }
    }
}

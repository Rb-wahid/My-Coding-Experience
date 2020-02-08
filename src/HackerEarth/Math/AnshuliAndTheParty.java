package HackerEarth.Math;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 *Problem Title: Anshuli and the Party
 *
 *link : https://www.hackerearth.com/practice/math/number-theory/basic-number-theory-1/practice-problems/algorithm/sheero-and-the-party/
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AnshuliAndTheParty {
    long modularExponentiation(long x, long n, long m){
        long result = 1;

        while (n>0){
            if (n%2== 1)
                result = (result*x)%m;
            x = (x*x)%m;
            n /= 2;
        }
        return result;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            long x = in.nextLong();
            long n = in.nextLong();
            long m = 1000000007;
            x = x%m;
            n = n%m;

            out.println(modularExponentiation(x,n,m)%m);
        }
    }
}

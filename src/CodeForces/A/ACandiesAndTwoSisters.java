package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Candies and Two Sisters
 *
 * link : http://codeforces.com/problemset/problem/1335/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACandiesAndTwoSisters {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0){
            long n = in.nextLong() ;
            --n;
            out.println(n>>1);

        }
    }
}

package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Vus the Cossack and a Contest
 *
 * link : https://codeforces.com/problemset/problem/1186/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AVusTheCossackAndAContest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int value =  Math.min(m, k);

        if (value >= n)
            out.println("Yes");
        else
            out.println("No");
    }
}

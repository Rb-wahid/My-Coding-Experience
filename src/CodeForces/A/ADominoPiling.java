package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Domino piling
 *
 * link : https://codeforces.com/problemset/problem/50/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADominoPiling {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int m = in.nextInt();

        int value = (int) Math.floor((n*m)/2.0);

        out.println(value);
    }
}

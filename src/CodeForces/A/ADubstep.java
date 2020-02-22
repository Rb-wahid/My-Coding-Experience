package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Dubstep
 *
 * link : http://codeforces.com/contest/208/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADubstep {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.readLine().replaceAll("WUB"," ").trim();
        out.println(str);
    }
}

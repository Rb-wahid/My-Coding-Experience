package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. HQ9+
 *
 * link : https://codeforces.com/problemset/problem/133/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AHQ9 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.next();
        String string = str.replaceAll("[HQ9]", "");

        if (str.length() != string.length())
            out.println("YES");
        else
            out.println("NO");
    }
}

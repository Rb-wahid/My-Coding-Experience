package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Translation
 *
 * link : https://codeforces.com/problemset/problem/41/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATranslation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        String s = in.next();
        String t = in.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (sb.toString().equals(t))
            out.println("YES");
        else
            out.println("NO");

    }
}

package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. cAPS lOCK
 *
 * link : https://codeforces.com/problemset/problem/131/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACAPSLOCK {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.next();
        str = str.toLowerCase();
        String first = String.valueOf(str.charAt(0));
        str = str.replaceFirst(first, first.toUpperCase());
        out.println(str);
    }
}

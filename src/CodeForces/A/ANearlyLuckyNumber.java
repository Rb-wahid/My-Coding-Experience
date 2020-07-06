package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Nearly Lucky Number
 *
 * link : https://codeforces.com/problemset/problem/110/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANearlyLuckyNumber {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String str = in.next();
        String string = str;
        str = str.replaceAll("[47]", "");

        if (str.length() == 0 && string.length() >= 2)
            out.println("YES");
        else
            out.println("NO");
    }
}

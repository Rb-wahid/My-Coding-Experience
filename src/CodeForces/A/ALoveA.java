package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Love "A"
 *
 * link : https://codeforces.com/problemset/problem/1146/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ALoveA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String string = in.next();
        int length = string.length();
        int a = 0;

        for (char c : string.toCharArray())
            if (c == 'a')
                a++;


        out.println(Math.min(length, (2*a)-1));
    }
}

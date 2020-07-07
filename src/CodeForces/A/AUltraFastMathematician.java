package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Ultra-Fast Mathematician
 *
 * link : https://codeforces.com/problemset/problem/61/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AUltraFastMathematician {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String a = in.next();
        String b = in.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i) ^ b.charAt(i));
        }

        out.println(sb);
    }
}

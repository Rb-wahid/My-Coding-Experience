package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Stones on the Table
 *
 * link : https://codeforces.com/problemset/problem/266/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AStonesOnTheTable {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int count = 0;
        char  ch = in.nextCharacter();
        for (int i = 1; i < n; i++) {
            char c = in.nextCharacter();

            if (ch != c)
                ch = c;
            else {
                count++;
            }
        }

        out.println(count);
    }
}

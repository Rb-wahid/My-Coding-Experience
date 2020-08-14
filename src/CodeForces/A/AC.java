package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. C+=
 *
 * link : https://codeforces.com/problemset/problem/1368/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long n = in.nextLong();

            int count = 0;

            while (true) {
                count++;
                if (a < b)
                    a += b;
                else
                    b += a;

                if (a > n || b > n)
                    break;
            }

            out.println(count);
        }
    }
}

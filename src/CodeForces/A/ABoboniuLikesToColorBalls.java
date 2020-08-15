package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Boboniu Likes to Color Balls
 *
 * link : https://codeforces.com/contest/1395/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABoboniuLikesToColorBalls {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            long r = in.nextLong();
            long g = in.nextLong();
            long b = in.nextLong();
            long w = in.nextLong();

            long min = Math.min(r, Math.min(g, b));
            r = r - min;
            g = g - min;
            b = b - min;
            w = w + min;

            int count = 0;

            if ((w & 1) == 0)
                count++;
            if ((r & 1) == 0)
                count++;
            if ((g & 1) == 0)
                count++;
            if ((b & 1) == 0)
                count++;

            out.println(count >= 3 ? "Yes" : "No");
        }
    }
}

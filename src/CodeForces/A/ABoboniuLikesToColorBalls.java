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

    boolean check (long r, long g, long b, long w) {
        return (r & 1)+(g & 1) + (b & 1) + (w & 1) < 2;
    }

    boolean greaterThanZero(long r, long g, long b, long w){
        return r > 0 && g > 0 && b > 0 && w > 0;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            long r = in.nextLong();
            long g = in.nextLong();
            long b = in.nextLong();
            long w = in.nextLong();

            if (check(r, g, b, w))
                out.println("Yes");
            else if (greaterThanZero(r, g, b, w) && check(r-1, g-1, b-1, w+1))
                out.println("Yes");
            else
                out.println("No");
        }
    }
}

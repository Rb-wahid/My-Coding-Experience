package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Minutes Before the New Year
 *
 * link : http://codeforces.com/problemset/problem/1283/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMinutesBeforeTheNewYear {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int test = in.nextInt();

        while (test-->0) {
            int h = in.nextInt() + 1;
            int m = in.nextInt();
            int hour = 24-h;
            int minute = 60-m + (hour * 60);

            out.println(minute);
        }
    }
}

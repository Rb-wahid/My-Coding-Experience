package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Road To Zero
 *
 * link : http://codeforces.com/problemset/problem/1342/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ARoadToZero {


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int test = in.nextInt();

        while (test-->0) {
            long x = in.nextLong();
            long y = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long total = 0;

            if (x < y) {
                long temp = 0;
                temp = x;
                x = y;
                y = temp;
            }

                if (2*a < b)
                    total += a * (x+y);
                else {
                    total += y*b;
                    total += a * (x-y);
                }

            out.println(total);
        }
    }
}

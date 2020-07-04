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

    void swap( long x, long y) {
        long temp = 0;
        temp = x;
        x = y;
        y = temp;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long x = in.nextLong();
            long y = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long total = 0;

            if (x > y)
                swap(x, y);

            total += a * (y-x);

                if (2*a < b)
                    total += x * (2*a);
                else
                    total += x * (b);

            out.println(total);
        }
    }
}

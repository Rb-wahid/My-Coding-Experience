package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. Donut Shops
 *
 * link : https://codeforces.com/contest/1373/problem/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADonutShops {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long sa = 0;
            long sb = 0;

            sa = a * b;
            sb = c;

            if (sa - sb == 0)
                out.println(b * 2 - 2 + " " + -1);
            else if (sa - sb > 5 && sa - sb < 1000)
                out.println(-1 + " " + b * 2);
            else if (sa - sb > 5 && sa - sb > 1000)
                out.println(-1 + " " + b);

            else
                out.println(1 + " " + b);


        }
    }
}

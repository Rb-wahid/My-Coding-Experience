package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Magic Stick
 *
 * link : https://codeforces.com/problemset/problem/1257/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BMagicStick {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t = in.nextInt();

        while (t-->0) {
            StringBuilder sb = new StringBuilder();
            long x = in.nextLong();
            long y = in.nextLong();

            if (x > 3) {
                sb.append("YES");
            }
            else if ((x == 1)) {
                if (y == 1)
                sb.append("YES");
                else
                    sb.append("NO");
            }
            else if ( y <= 3)
                sb.append("YES");
            else
                sb.append("NO");

            out.println(sb);
        }


    }
}

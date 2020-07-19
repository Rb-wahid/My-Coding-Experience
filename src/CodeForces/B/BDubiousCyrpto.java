package CodeForces.B;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: B. Dubious Cyrpto
 *
 * link : https://codeforces.com/contest/1379/problem/B
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class BDubiousCyrpto {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            long l = in.nextLong();
            long r = in.nextLong();
            long m = in.nextLong();

            for (long a = l; a <= r; a++) {
                long rem = m % a;
                long x = r - l;

                if (rem <= r - l) {
                    if (m - rem != 0) {
                        out.println(a + " " + r + " " + (r - rem));
                        break;
                    }
                }

                if (l + a - rem <= r) {
                    if ((m + a - rem) % a == 0) {
                        out.println(a + " " + l + " " + (l + a - rem));
                        break;
                    }
                }
            }
        }
    }

}

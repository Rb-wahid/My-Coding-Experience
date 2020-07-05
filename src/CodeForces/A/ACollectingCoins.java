package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title:
 *
 * link :
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACollectingCoins {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long n = in.nextLong();

            if ((a+b+c+n) % 3 == 0)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}

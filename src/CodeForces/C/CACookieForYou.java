package CodeForces.C;
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

public class CACookieForYou {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();

        while (t-->0) {
            long vanilla = in.nextLong();
            long chocolate = in.nextLong();
            long first = in.nextLong();
            long second = in.nextLong();

            if ((vanilla+chocolate) >= (first+second) && second <= Math.min(vanilla, chocolate))
                out.println("Yes");
            else
                out.println("No");
        }
    }
}

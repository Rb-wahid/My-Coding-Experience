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

public class AMahmoudAndEhabAndTheEvenOddGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long num = in.nextLong();

        if ((num&1) == 0)
            out.println("Mahmoud");
        else
            out.println("Ehab");
    }
}

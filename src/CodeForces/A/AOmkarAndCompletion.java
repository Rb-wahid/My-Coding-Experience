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

import java.util.Random;

public class AOmkarAndCompletion {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int t= in.nextInt();

        while (t-->0) {
            int n = in.nextInt();

            while (n > 0 ) {
                out.print(1 + " ");
                    n--;

            }
            out.println();
        }
    }
}

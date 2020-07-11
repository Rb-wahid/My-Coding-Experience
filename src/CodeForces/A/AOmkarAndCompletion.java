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
            StringBuilder sb = new StringBuilder();
            Random rand = new Random();

            // Generate random integers in range 0 to 999

            while (n > 0 ) {
                int rand_int1 = rand.nextInt(1000);
                out.print(rand_int1 + " ");
                    n--;

            }
            out.println();
        }
    }
}

package CodeForces.A;
/**
 * Built using CHelper plug-in
 *
 * @author Rb_wahid
 *
 * Problem Title: A. George and Accommodation
 *
 * link : https://codeforces.com/problemset/problem/467/A
 */

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGeorgeAndAccommodation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int room = in.nextInt();
        int count = 0;

        while (room-->0) {
            int p = in.nextInt()+2;
            int q = in.nextInt();

            if (p <= q)
                count++;
        }
        out.println(count);
    }
}

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

            int n = 1;
            long temp = 0;

            while (true) {
                temp = (n * l) + r;

                if (temp > m) {
                    temp = temp - m;
                    break;
                }
                n++;
            }
            out.println(l + " " + r + " " + temp);
        }
    }
}

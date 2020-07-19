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

            long n = 1;
            long temp = 0;
            long a = 0;
            long b = 0;
            long c = 0;
            a = l;
            b = r;


            while (true) {

                c = (n * a) - (b + m);
                if (l <= c) {
                    if (r >= c)
                        break;
                } else {
                    n++;
                }
            }
            out.println(a + " " + b + " " + c);
        }
    }
}
